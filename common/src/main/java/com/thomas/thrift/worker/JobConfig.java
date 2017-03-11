/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.thomas.thrift.worker;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-11")
public class JobConfig implements org.apache.thrift.TBase<JobConfig, JobConfig._Fields>, java.io.Serializable, Cloneable, Comparable<JobConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobConfig");

  private static final org.apache.thrift.protocol.TField JOB_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("jobKey", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LEARNING_RATE_FIELD_DESC = new org.apache.thrift.protocol.TField("learningRate", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField DATA_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("dataPath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ITE_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("iteNum", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField SERVER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("serverId", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField SERVER_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("serverPort", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tableId", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JobConfigStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JobConfigTupleSchemeFactory();

  public long jobKey; // required
  public String jobType; // required
  public double learningRate; // required
  public String dataPath; // required
  public int iteNum; // required
  public String serverId; // required
  public int serverPort; // required
  public String tableId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    JOB_KEY((short)1, "jobKey"),
    JOB_TYPE((short)2, "jobType"),
    LEARNING_RATE((short)3, "learningRate"),
    DATA_PATH((short)4, "dataPath"),
    ITE_NUM((short)5, "iteNum"),
    SERVER_ID((short)6, "serverId"),
    SERVER_PORT((short)7, "serverPort"),
    TABLE_ID((short)8, "tableId");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_KEY
          return JOB_KEY;
        case 2: // JOB_TYPE
          return JOB_TYPE;
        case 3: // LEARNING_RATE
          return LEARNING_RATE;
        case 4: // DATA_PATH
          return DATA_PATH;
        case 5: // ITE_NUM
          return ITE_NUM;
        case 6: // SERVER_ID
          return SERVER_ID;
        case 7: // SERVER_PORT
          return SERVER_PORT;
        case 8: // TABLE_ID
          return TABLE_ID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __JOBKEY_ISSET_ID = 0;
  private static final int __LEARNINGRATE_ISSET_ID = 1;
  private static final int __ITENUM_ISSET_ID = 2;
  private static final int __SERVERPORT_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_KEY, new org.apache.thrift.meta_data.FieldMetaData("jobKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.JOB_TYPE, new org.apache.thrift.meta_data.FieldMetaData("jobType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LEARNING_RATE, new org.apache.thrift.meta_data.FieldMetaData("learningRate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DATA_PATH, new org.apache.thrift.meta_data.FieldMetaData("dataPath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ITE_NUM, new org.apache.thrift.meta_data.FieldMetaData("iteNum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SERVER_ID, new org.apache.thrift.meta_data.FieldMetaData("serverId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVER_PORT, new org.apache.thrift.meta_data.FieldMetaData("serverPort", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tableId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobConfig.class, metaDataMap);
  }

  public JobConfig() {
  }

  public JobConfig(
    long jobKey,
    String jobType,
    double learningRate,
    String dataPath,
    int iteNum,
    String serverId,
    int serverPort,
    String tableId)
  {
    this();
    this.jobKey = jobKey;
    setJobKeyIsSet(true);
    this.jobType = jobType;
    this.learningRate = learningRate;
    setLearningRateIsSet(true);
    this.dataPath = dataPath;
    this.iteNum = iteNum;
    setIteNumIsSet(true);
    this.serverId = serverId;
    this.serverPort = serverPort;
    setServerPortIsSet(true);
    this.tableId = tableId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobConfig(JobConfig other) {
    __isset_bitfield = other.__isset_bitfield;
    this.jobKey = other.jobKey;
    if (other.isSetJobType()) {
      this.jobType = other.jobType;
    }
    this.learningRate = other.learningRate;
    if (other.isSetDataPath()) {
      this.dataPath = other.dataPath;
    }
    this.iteNum = other.iteNum;
    if (other.isSetServerId()) {
      this.serverId = other.serverId;
    }
    this.serverPort = other.serverPort;
    if (other.isSetTableId()) {
      this.tableId = other.tableId;
    }
  }

  public JobConfig deepCopy() {
    return new JobConfig(this);
  }

  @Override
  public void clear() {
    setJobKeyIsSet(false);
    this.jobKey = 0;
    this.jobType = null;
    setLearningRateIsSet(false);
    this.learningRate = 0.0;
    this.dataPath = null;
    setIteNumIsSet(false);
    this.iteNum = 0;
    this.serverId = null;
    setServerPortIsSet(false);
    this.serverPort = 0;
    this.tableId = null;
  }

  public long getJobKey() {
    return this.jobKey;
  }

  public JobConfig setJobKey(long jobKey) {
    this.jobKey = jobKey;
    setJobKeyIsSet(true);
    return this;
  }

  public void unsetJobKey() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __JOBKEY_ISSET_ID);
  }

  /** Returns true if field jobKey is set (has been assigned a value) and false otherwise */
  public boolean isSetJobKey() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __JOBKEY_ISSET_ID);
  }

  public void setJobKeyIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __JOBKEY_ISSET_ID, value);
  }

  public String getJobType() {
    return this.jobType;
  }

  public JobConfig setJobType(String jobType) {
    this.jobType = jobType;
    return this;
  }

  public void unsetJobType() {
    this.jobType = null;
  }

  /** Returns true if field jobType is set (has been assigned a value) and false otherwise */
  public boolean isSetJobType() {
    return this.jobType != null;
  }

  public void setJobTypeIsSet(boolean value) {
    if (!value) {
      this.jobType = null;
    }
  }

  public double getLearningRate() {
    return this.learningRate;
  }

  public JobConfig setLearningRate(double learningRate) {
    this.learningRate = learningRate;
    setLearningRateIsSet(true);
    return this;
  }

  public void unsetLearningRate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LEARNINGRATE_ISSET_ID);
  }

  /** Returns true if field learningRate is set (has been assigned a value) and false otherwise */
  public boolean isSetLearningRate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LEARNINGRATE_ISSET_ID);
  }

  public void setLearningRateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LEARNINGRATE_ISSET_ID, value);
  }

  public String getDataPath() {
    return this.dataPath;
  }

  public JobConfig setDataPath(String dataPath) {
    this.dataPath = dataPath;
    return this;
  }

  public void unsetDataPath() {
    this.dataPath = null;
  }

  /** Returns true if field dataPath is set (has been assigned a value) and false otherwise */
  public boolean isSetDataPath() {
    return this.dataPath != null;
  }

  public void setDataPathIsSet(boolean value) {
    if (!value) {
      this.dataPath = null;
    }
  }

  public int getIteNum() {
    return this.iteNum;
  }

  public JobConfig setIteNum(int iteNum) {
    this.iteNum = iteNum;
    setIteNumIsSet(true);
    return this;
  }

  public void unsetIteNum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ITENUM_ISSET_ID);
  }

  /** Returns true if field iteNum is set (has been assigned a value) and false otherwise */
  public boolean isSetIteNum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ITENUM_ISSET_ID);
  }

  public void setIteNumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ITENUM_ISSET_ID, value);
  }

  public String getServerId() {
    return this.serverId;
  }

  public JobConfig setServerId(String serverId) {
    this.serverId = serverId;
    return this;
  }

  public void unsetServerId() {
    this.serverId = null;
  }

  /** Returns true if field serverId is set (has been assigned a value) and false otherwise */
  public boolean isSetServerId() {
    return this.serverId != null;
  }

  public void setServerIdIsSet(boolean value) {
    if (!value) {
      this.serverId = null;
    }
  }

  public int getServerPort() {
    return this.serverPort;
  }

  public JobConfig setServerPort(int serverPort) {
    this.serverPort = serverPort;
    setServerPortIsSet(true);
    return this;
  }

  public void unsetServerPort() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SERVERPORT_ISSET_ID);
  }

  /** Returns true if field serverPort is set (has been assigned a value) and false otherwise */
  public boolean isSetServerPort() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SERVERPORT_ISSET_ID);
  }

  public void setServerPortIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SERVERPORT_ISSET_ID, value);
  }

  public String getTableId() {
    return this.tableId;
  }

  public JobConfig setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public void unsetTableId() {
    this.tableId = null;
  }

  /** Returns true if field tableId is set (has been assigned a value) and false otherwise */
  public boolean isSetTableId() {
    return this.tableId != null;
  }

  public void setTableIdIsSet(boolean value) {
    if (!value) {
      this.tableId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_KEY:
      if (value == null) {
        unsetJobKey();
      } else {
        setJobKey((Long)value);
      }
      break;

    case JOB_TYPE:
      if (value == null) {
        unsetJobType();
      } else {
        setJobType((String)value);
      }
      break;

    case LEARNING_RATE:
      if (value == null) {
        unsetLearningRate();
      } else {
        setLearningRate((Double)value);
      }
      break;

    case DATA_PATH:
      if (value == null) {
        unsetDataPath();
      } else {
        setDataPath((String)value);
      }
      break;

    case ITE_NUM:
      if (value == null) {
        unsetIteNum();
      } else {
        setIteNum((Integer)value);
      }
      break;

    case SERVER_ID:
      if (value == null) {
        unsetServerId();
      } else {
        setServerId((String)value);
      }
      break;

    case SERVER_PORT:
      if (value == null) {
        unsetServerPort();
      } else {
        setServerPort((Integer)value);
      }
      break;

    case TABLE_ID:
      if (value == null) {
        unsetTableId();
      } else {
        setTableId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_KEY:
      return getJobKey();

    case JOB_TYPE:
      return getJobType();

    case LEARNING_RATE:
      return getLearningRate();

    case DATA_PATH:
      return getDataPath();

    case ITE_NUM:
      return getIteNum();

    case SERVER_ID:
      return getServerId();

    case SERVER_PORT:
      return getServerPort();

    case TABLE_ID:
      return getTableId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_KEY:
      return isSetJobKey();
    case JOB_TYPE:
      return isSetJobType();
    case LEARNING_RATE:
      return isSetLearningRate();
    case DATA_PATH:
      return isSetDataPath();
    case ITE_NUM:
      return isSetIteNum();
    case SERVER_ID:
      return isSetServerId();
    case SERVER_PORT:
      return isSetServerPort();
    case TABLE_ID:
      return isSetTableId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobConfig)
      return this.equals((JobConfig)that);
    return false;
  }

  public boolean equals(JobConfig that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_jobKey = true;
    boolean that_present_jobKey = true;
    if (this_present_jobKey || that_present_jobKey) {
      if (!(this_present_jobKey && that_present_jobKey))
        return false;
      if (this.jobKey != that.jobKey)
        return false;
    }

    boolean this_present_jobType = true && this.isSetJobType();
    boolean that_present_jobType = true && that.isSetJobType();
    if (this_present_jobType || that_present_jobType) {
      if (!(this_present_jobType && that_present_jobType))
        return false;
      if (!this.jobType.equals(that.jobType))
        return false;
    }

    boolean this_present_learningRate = true;
    boolean that_present_learningRate = true;
    if (this_present_learningRate || that_present_learningRate) {
      if (!(this_present_learningRate && that_present_learningRate))
        return false;
      if (this.learningRate != that.learningRate)
        return false;
    }

    boolean this_present_dataPath = true && this.isSetDataPath();
    boolean that_present_dataPath = true && that.isSetDataPath();
    if (this_present_dataPath || that_present_dataPath) {
      if (!(this_present_dataPath && that_present_dataPath))
        return false;
      if (!this.dataPath.equals(that.dataPath))
        return false;
    }

    boolean this_present_iteNum = true;
    boolean that_present_iteNum = true;
    if (this_present_iteNum || that_present_iteNum) {
      if (!(this_present_iteNum && that_present_iteNum))
        return false;
      if (this.iteNum != that.iteNum)
        return false;
    }

    boolean this_present_serverId = true && this.isSetServerId();
    boolean that_present_serverId = true && that.isSetServerId();
    if (this_present_serverId || that_present_serverId) {
      if (!(this_present_serverId && that_present_serverId))
        return false;
      if (!this.serverId.equals(that.serverId))
        return false;
    }

    boolean this_present_serverPort = true;
    boolean that_present_serverPort = true;
    if (this_present_serverPort || that_present_serverPort) {
      if (!(this_present_serverPort && that_present_serverPort))
        return false;
      if (this.serverPort != that.serverPort)
        return false;
    }

    boolean this_present_tableId = true && this.isSetTableId();
    boolean that_present_tableId = true && that.isSetTableId();
    if (this_present_tableId || that_present_tableId) {
      if (!(this_present_tableId && that_present_tableId))
        return false;
      if (!this.tableId.equals(that.tableId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(jobKey);

    hashCode = hashCode * 8191 + ((isSetJobType()) ? 131071 : 524287);
    if (isSetJobType())
      hashCode = hashCode * 8191 + jobType.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(learningRate);

    hashCode = hashCode * 8191 + ((isSetDataPath()) ? 131071 : 524287);
    if (isSetDataPath())
      hashCode = hashCode * 8191 + dataPath.hashCode();

    hashCode = hashCode * 8191 + iteNum;

    hashCode = hashCode * 8191 + ((isSetServerId()) ? 131071 : 524287);
    if (isSetServerId())
      hashCode = hashCode * 8191 + serverId.hashCode();

    hashCode = hashCode * 8191 + serverPort;

    hashCode = hashCode * 8191 + ((isSetTableId()) ? 131071 : 524287);
    if (isSetTableId())
      hashCode = hashCode * 8191 + tableId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JobConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetJobKey()).compareTo(other.isSetJobKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobKey, other.jobKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobType()).compareTo(other.isSetJobType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobType, other.jobType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLearningRate()).compareTo(other.isSetLearningRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLearningRate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.learningRate, other.learningRate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataPath()).compareTo(other.isSetDataPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataPath, other.dataPath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIteNum()).compareTo(other.isSetIteNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIteNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iteNum, other.iteNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServerId()).compareTo(other.isSetServerId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverId, other.serverId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServerPort()).compareTo(other.isSetServerPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServerPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serverPort, other.serverPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTableId()).compareTo(other.isSetTableId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableId, other.tableId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JobConfig(");
    boolean first = true;

    sb.append("jobKey:");
    sb.append(this.jobKey);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobType:");
    if (this.jobType == null) {
      sb.append("null");
    } else {
      sb.append(this.jobType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("learningRate:");
    sb.append(this.learningRate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataPath:");
    if (this.dataPath == null) {
      sb.append("null");
    } else {
      sb.append(this.dataPath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iteNum:");
    sb.append(this.iteNum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverId:");
    if (this.serverId == null) {
      sb.append("null");
    } else {
      sb.append(this.serverId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serverPort:");
    sb.append(this.serverPort);
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableId:");
    if (this.tableId == null) {
      sb.append("null");
    } else {
      sb.append(this.tableId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobConfigStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobConfigStandardScheme getScheme() {
      return new JobConfigStandardScheme();
    }
  }

  private static class JobConfigStandardScheme extends org.apache.thrift.scheme.StandardScheme<JobConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.jobKey = iprot.readI64();
              struct.setJobKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.jobType = iprot.readString();
              struct.setJobTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LEARNING_RATE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.learningRate = iprot.readDouble();
              struct.setLearningRateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataPath = iprot.readString();
              struct.setDataPathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ITE_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.iteNum = iprot.readI32();
              struct.setIteNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SERVER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serverId = iprot.readString();
              struct.setServerIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SERVER_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.serverPort = iprot.readI32();
              struct.setServerPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableId = iprot.readString();
              struct.setTableIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(JOB_KEY_FIELD_DESC);
      oprot.writeI64(struct.jobKey);
      oprot.writeFieldEnd();
      if (struct.jobType != null) {
        oprot.writeFieldBegin(JOB_TYPE_FIELD_DESC);
        oprot.writeString(struct.jobType);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEARNING_RATE_FIELD_DESC);
      oprot.writeDouble(struct.learningRate);
      oprot.writeFieldEnd();
      if (struct.dataPath != null) {
        oprot.writeFieldBegin(DATA_PATH_FIELD_DESC);
        oprot.writeString(struct.dataPath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ITE_NUM_FIELD_DESC);
      oprot.writeI32(struct.iteNum);
      oprot.writeFieldEnd();
      if (struct.serverId != null) {
        oprot.writeFieldBegin(SERVER_ID_FIELD_DESC);
        oprot.writeString(struct.serverId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SERVER_PORT_FIELD_DESC);
      oprot.writeI32(struct.serverPort);
      oprot.writeFieldEnd();
      if (struct.tableId != null) {
        oprot.writeFieldBegin(TABLE_ID_FIELD_DESC);
        oprot.writeString(struct.tableId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobConfigTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobConfigTupleScheme getScheme() {
      return new JobConfigTupleScheme();
    }
  }

  private static class JobConfigTupleScheme extends org.apache.thrift.scheme.TupleScheme<JobConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetJobKey()) {
        optionals.set(0);
      }
      if (struct.isSetJobType()) {
        optionals.set(1);
      }
      if (struct.isSetLearningRate()) {
        optionals.set(2);
      }
      if (struct.isSetDataPath()) {
        optionals.set(3);
      }
      if (struct.isSetIteNum()) {
        optionals.set(4);
      }
      if (struct.isSetServerId()) {
        optionals.set(5);
      }
      if (struct.isSetServerPort()) {
        optionals.set(6);
      }
      if (struct.isSetTableId()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetJobKey()) {
        oprot.writeI64(struct.jobKey);
      }
      if (struct.isSetJobType()) {
        oprot.writeString(struct.jobType);
      }
      if (struct.isSetLearningRate()) {
        oprot.writeDouble(struct.learningRate);
      }
      if (struct.isSetDataPath()) {
        oprot.writeString(struct.dataPath);
      }
      if (struct.isSetIteNum()) {
        oprot.writeI32(struct.iteNum);
      }
      if (struct.isSetServerId()) {
        oprot.writeString(struct.serverId);
      }
      if (struct.isSetServerPort()) {
        oprot.writeI32(struct.serverPort);
      }
      if (struct.isSetTableId()) {
        oprot.writeString(struct.tableId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.jobKey = iprot.readI64();
        struct.setJobKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobType = iprot.readString();
        struct.setJobTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.learningRate = iprot.readDouble();
        struct.setLearningRateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dataPath = iprot.readString();
        struct.setDataPathIsSet(true);
      }
      if (incoming.get(4)) {
        struct.iteNum = iprot.readI32();
        struct.setIteNumIsSet(true);
      }
      if (incoming.get(5)) {
        struct.serverId = iprot.readString();
        struct.setServerIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.serverPort = iprot.readI32();
        struct.setServerPortIsSet(true);
      }
      if (incoming.get(7)) {
        struct.tableId = iprot.readString();
        struct.setTableIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

