package com.thomas.models;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by hadoop on 3/6/17.
 */
public class ParameterServer {
    private HashMap<String, ParameterTable> tables;
    private HashMap<String, ParameterTableMetaData> metaData;

    private Logger logger = Logger.getLogger(this.getClass());

    public ParameterServer() {
        tables = new HashMap<String, ParameterTable>();
        metaData = new HashMap<String, ParameterTableMetaData>();
    }

    public void createParameterTable(String []machines, String tableId, int dimems, Double[] intialVector) {
        logger.info("create parameter table: " + tableId);

        ParameterTable table = new ParameterTable(dimems);
        table.init(intialVector);
        tables.put(tableId, table);
        metaData.put(tableId, new ParameterTableMetaData(machines.length));
    }

    public ArrayList<Double> readRows(String tableId, int rowId, int range) {
        logger.info("read table row: " + tableId + ", row id : " + rowId);

        ParameterTable parameterTable = tables.get(tableId);

        Double[] data = tables.get(tableId).getRow(rowId);
        ArrayList<Double> list = new ArrayList<Double>();
        for (double d: data) list.add(d);
        return list;
    }

    public void updateRows(String tableId, int rowId, List<Double> valVector) {
        logger.info("update table row: " + tableId + ", row id : " + rowId);

        metaData.get(tableId).recieverNum.getAndIncrement();
        Double [] delta = new Double[valVector.size()];
        for (int i=0; i<valVector.size(); i++) delta[i] = valVector.get(i);
        tables.get(tableId).updateRow(rowId, delta);
    }

    public boolean round(String tableId) {
        if (metaData.get(tableId).isRoundOver()) {
            metaData.get(tableId).recieverNum.set(0);
            return true;
        }
        return false;
    }

}