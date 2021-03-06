/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.thomas.thrift.master;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-04-09")
public class ExecInfo implements org.apache.thrift.TBase<ExecInfo, ExecInfo._Fields>, java.io.Serializable, Cloneable, Comparable<ExecInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ExecInfo");

  private static final org.apache.thrift.protocol.TField EXEC_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("execTime", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField COMPUTE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("computeTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField LOSS_FIELD_DESC = new org.apache.thrift.protocol.TField("loss", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField HOST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("hostId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExecInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExecInfoTupleSchemeFactory();

  public long execTime; // required
  public long computeTime; // required
  public java.util.List<Double> loss; // required
  public String hostId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXEC_TIME((short)1, "execTime"),
    COMPUTE_TIME((short)2, "computeTime"),
    LOSS((short)3, "loss"),
    HOST_ID((short)4, "hostId");

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
        case 1: // EXEC_TIME
          return EXEC_TIME;
        case 2: // COMPUTE_TIME
          return COMPUTE_TIME;
        case 3: // LOSS
          return LOSS;
        case 4: // HOST_ID
          return HOST_ID;
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
  private static final int __EXECTIME_ISSET_ID = 0;
  private static final int __COMPUTETIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXEC_TIME, new org.apache.thrift.meta_data.FieldMetaData("execTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.COMPUTE_TIME, new org.apache.thrift.meta_data.FieldMetaData("computeTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOSS, new org.apache.thrift.meta_data.FieldMetaData("loss", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.HOST_ID, new org.apache.thrift.meta_data.FieldMetaData("hostId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecInfo.class, metaDataMap);
  }

  public ExecInfo() {
  }

  public ExecInfo(
    long execTime,
    long computeTime,
    java.util.List<Double> loss,
    String hostId)
  {
    this();
    this.execTime = execTime;
    setExecTimeIsSet(true);
    this.computeTime = computeTime;
    setComputeTimeIsSet(true);
    this.loss = loss;
    this.hostId = hostId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecInfo(ExecInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.execTime = other.execTime;
    this.computeTime = other.computeTime;
    if (other.isSetLoss()) {
      java.util.List<Double> __this__loss = new java.util.ArrayList<Double>(other.loss);
      this.loss = __this__loss;
    }
    if (other.isSetHostId()) {
      this.hostId = other.hostId;
    }
  }

  public ExecInfo deepCopy() {
    return new ExecInfo(this);
  }

  @Override
  public void clear() {
    setExecTimeIsSet(false);
    this.execTime = 0;
    setComputeTimeIsSet(false);
    this.computeTime = 0;
    this.loss = null;
    this.hostId = null;
  }

  public long getExecTime() {
    return this.execTime;
  }

  public ExecInfo setExecTime(long execTime) {
    this.execTime = execTime;
    setExecTimeIsSet(true);
    return this;
  }

  public void unsetExecTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXECTIME_ISSET_ID);
  }

  /** Returns true if field execTime is set (has been assigned a value) and false otherwise */
  public boolean isSetExecTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXECTIME_ISSET_ID);
  }

  public void setExecTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXECTIME_ISSET_ID, value);
  }

  public long getComputeTime() {
    return this.computeTime;
  }

  public ExecInfo setComputeTime(long computeTime) {
    this.computeTime = computeTime;
    setComputeTimeIsSet(true);
    return this;
  }

  public void unsetComputeTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COMPUTETIME_ISSET_ID);
  }

  /** Returns true if field computeTime is set (has been assigned a value) and false otherwise */
  public boolean isSetComputeTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COMPUTETIME_ISSET_ID);
  }

  public void setComputeTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COMPUTETIME_ISSET_ID, value);
  }

  public int getLossSize() {
    return (this.loss == null) ? 0 : this.loss.size();
  }

  public java.util.Iterator<Double> getLossIterator() {
    return (this.loss == null) ? null : this.loss.iterator();
  }

  public void addToLoss(double elem) {
    if (this.loss == null) {
      this.loss = new java.util.ArrayList<Double>();
    }
    this.loss.add(elem);
  }

  public java.util.List<Double> getLoss() {
    return this.loss;
  }

  public ExecInfo setLoss(java.util.List<Double> loss) {
    this.loss = loss;
    return this;
  }

  public void unsetLoss() {
    this.loss = null;
  }

  /** Returns true if field loss is set (has been assigned a value) and false otherwise */
  public boolean isSetLoss() {
    return this.loss != null;
  }

  public void setLossIsSet(boolean value) {
    if (!value) {
      this.loss = null;
    }
  }

  public String getHostId() {
    return this.hostId;
  }

  public ExecInfo setHostId(String hostId) {
    this.hostId = hostId;
    return this;
  }

  public void unsetHostId() {
    this.hostId = null;
  }

  /** Returns true if field hostId is set (has been assigned a value) and false otherwise */
  public boolean isSetHostId() {
    return this.hostId != null;
  }

  public void setHostIdIsSet(boolean value) {
    if (!value) {
      this.hostId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXEC_TIME:
      if (value == null) {
        unsetExecTime();
      } else {
        setExecTime((Long)value);
      }
      break;

    case COMPUTE_TIME:
      if (value == null) {
        unsetComputeTime();
      } else {
        setComputeTime((Long)value);
      }
      break;

    case LOSS:
      if (value == null) {
        unsetLoss();
      } else {
        setLoss((java.util.List<Double>)value);
      }
      break;

    case HOST_ID:
      if (value == null) {
        unsetHostId();
      } else {
        setHostId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXEC_TIME:
      return getExecTime();

    case COMPUTE_TIME:
      return getComputeTime();

    case LOSS:
      return getLoss();

    case HOST_ID:
      return getHostId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXEC_TIME:
      return isSetExecTime();
    case COMPUTE_TIME:
      return isSetComputeTime();
    case LOSS:
      return isSetLoss();
    case HOST_ID:
      return isSetHostId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecInfo)
      return this.equals((ExecInfo)that);
    return false;
  }

  public boolean equals(ExecInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_execTime = true;
    boolean that_present_execTime = true;
    if (this_present_execTime || that_present_execTime) {
      if (!(this_present_execTime && that_present_execTime))
        return false;
      if (this.execTime != that.execTime)
        return false;
    }

    boolean this_present_computeTime = true;
    boolean that_present_computeTime = true;
    if (this_present_computeTime || that_present_computeTime) {
      if (!(this_present_computeTime && that_present_computeTime))
        return false;
      if (this.computeTime != that.computeTime)
        return false;
    }

    boolean this_present_loss = true && this.isSetLoss();
    boolean that_present_loss = true && that.isSetLoss();
    if (this_present_loss || that_present_loss) {
      if (!(this_present_loss && that_present_loss))
        return false;
      if (!this.loss.equals(that.loss))
        return false;
    }

    boolean this_present_hostId = true && this.isSetHostId();
    boolean that_present_hostId = true && that.isSetHostId();
    if (this_present_hostId || that_present_hostId) {
      if (!(this_present_hostId && that_present_hostId))
        return false;
      if (!this.hostId.equals(that.hostId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(execTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(computeTime);

    hashCode = hashCode * 8191 + ((isSetLoss()) ? 131071 : 524287);
    if (isSetLoss())
      hashCode = hashCode * 8191 + loss.hashCode();

    hashCode = hashCode * 8191 + ((isSetHostId()) ? 131071 : 524287);
    if (isSetHostId())
      hashCode = hashCode * 8191 + hostId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExecInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetExecTime()).compareTo(other.isSetExecTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.execTime, other.execTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetComputeTime()).compareTo(other.isSetComputeTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComputeTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.computeTime, other.computeTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLoss()).compareTo(other.isSetLoss());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoss()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loss, other.loss);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostId()).compareTo(other.isSetHostId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostId, other.hostId);
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
    StringBuilder sb = new StringBuilder("ExecInfo(");
    boolean first = true;

    sb.append("execTime:");
    sb.append(this.execTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("computeTime:");
    sb.append(this.computeTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("loss:");
    if (this.loss == null) {
      sb.append("null");
    } else {
      sb.append(this.loss);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hostId:");
    if (this.hostId == null) {
      sb.append("null");
    } else {
      sb.append(this.hostId);
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

  private static class ExecInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExecInfoStandardScheme getScheme() {
      return new ExecInfoStandardScheme();
    }
  }

  private static class ExecInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<ExecInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ExecInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXEC_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.execTime = iprot.readI64();
              struct.setExecTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPUTE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.computeTime = iprot.readI64();
              struct.setComputeTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOSS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.loss = new java.util.ArrayList<Double>(_list8.size);
                double _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readDouble();
                  struct.loss.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setLossIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HOST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostId = iprot.readString();
              struct.setHostIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ExecInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(EXEC_TIME_FIELD_DESC);
      oprot.writeI64(struct.execTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COMPUTE_TIME_FIELD_DESC);
      oprot.writeI64(struct.computeTime);
      oprot.writeFieldEnd();
      if (struct.loss != null) {
        oprot.writeFieldBegin(LOSS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.loss.size()));
          for (double _iter11 : struct.loss)
          {
            oprot.writeDouble(_iter11);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.hostId != null) {
        oprot.writeFieldBegin(HOST_ID_FIELD_DESC);
        oprot.writeString(struct.hostId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExecInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ExecInfoTupleScheme getScheme() {
      return new ExecInfoTupleScheme();
    }
  }

  private static class ExecInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<ExecInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ExecInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetExecTime()) {
        optionals.set(0);
      }
      if (struct.isSetComputeTime()) {
        optionals.set(1);
      }
      if (struct.isSetLoss()) {
        optionals.set(2);
      }
      if (struct.isSetHostId()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetExecTime()) {
        oprot.writeI64(struct.execTime);
      }
      if (struct.isSetComputeTime()) {
        oprot.writeI64(struct.computeTime);
      }
      if (struct.isSetLoss()) {
        {
          oprot.writeI32(struct.loss.size());
          for (double _iter12 : struct.loss)
          {
            oprot.writeDouble(_iter12);
          }
        }
      }
      if (struct.isSetHostId()) {
        oprot.writeString(struct.hostId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ExecInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.execTime = iprot.readI64();
        struct.setExecTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.computeTime = iprot.readI64();
        struct.setComputeTimeIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.loss = new java.util.ArrayList<Double>(_list13.size);
          double _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readDouble();
            struct.loss.add(_elem14);
          }
        }
        struct.setLossIsSet(true);
      }
      if (incoming.get(3)) {
        struct.hostId = iprot.readString();
        struct.setHostIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

