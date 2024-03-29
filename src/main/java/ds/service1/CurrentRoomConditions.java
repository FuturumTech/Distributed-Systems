// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package ds.service1;

/**
 * Protobuf type {@code service1.CurrentRoomConditions}
 */
public  final class CurrentRoomConditions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service1.CurrentRoomConditions)
    CurrentRoomConditionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CurrentRoomConditions.newBuilder() to construct.
  private CurrentRoomConditions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CurrentRoomConditions() {
    roomName_ = "";
    humidity_ = 0D;
    tempInCelcius_ = 0D;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CurrentRoomConditions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            roomName_ = s;
            break;
          }
          case 17: {

            humidity_ = input.readDouble();
            break;
          }
          case 25: {

            tempInCelcius_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.service1.Service1Impl.internal_static_service1_CurrentRoomConditions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service1.Service1Impl.internal_static_service1_CurrentRoomConditions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service1.CurrentRoomConditions.class, ds.service1.CurrentRoomConditions.Builder.class);
  }

  public static final int ROOMNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object roomName_;
  /**
   * <code>string roomName = 1;</code>
   */
  public java.lang.String getRoomName() {
    java.lang.Object ref = roomName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roomName_ = s;
      return s;
    }
  }
  /**
   * <code>string roomName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRoomNameBytes() {
    java.lang.Object ref = roomName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roomName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HUMIDITY_FIELD_NUMBER = 2;
  private double humidity_;
  /**
   * <code>double humidity = 2;</code>
   */
  public double getHumidity() {
    return humidity_;
  }

  public static final int TEMPINCELCIUS_FIELD_NUMBER = 3;
  private double tempInCelcius_;
  /**
   * <code>double tempInCelcius = 3;</code>
   */
  public double getTempInCelcius() {
    return tempInCelcius_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRoomNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, roomName_);
    }
    if (humidity_ != 0D) {
      output.writeDouble(2, humidity_);
    }
    if (tempInCelcius_ != 0D) {
      output.writeDouble(3, tempInCelcius_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRoomNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, roomName_);
    }
    if (humidity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, humidity_);
    }
    if (tempInCelcius_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, tempInCelcius_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.service1.CurrentRoomConditions)) {
      return super.equals(obj);
    }
    ds.service1.CurrentRoomConditions other = (ds.service1.CurrentRoomConditions) obj;

    boolean result = true;
    result = result && getRoomName()
        .equals(other.getRoomName());
    result = result && (
        java.lang.Double.doubleToLongBits(getHumidity())
        == java.lang.Double.doubleToLongBits(
            other.getHumidity()));
    result = result && (
        java.lang.Double.doubleToLongBits(getTempInCelcius())
        == java.lang.Double.doubleToLongBits(
            other.getTempInCelcius()));
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROOMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoomName().hashCode();
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHumidity()));
    hash = (37 * hash) + TEMPINCELCIUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTempInCelcius()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service1.CurrentRoomConditions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service1.CurrentRoomConditions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service1.CurrentRoomConditions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service1.CurrentRoomConditions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.service1.CurrentRoomConditions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code service1.CurrentRoomConditions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service1.CurrentRoomConditions)
      ds.service1.CurrentRoomConditionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service1.Service1Impl.internal_static_service1_CurrentRoomConditions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service1.Service1Impl.internal_static_service1_CurrentRoomConditions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service1.CurrentRoomConditions.class, ds.service1.CurrentRoomConditions.Builder.class);
    }

    // Construct using ds.service1.CurrentRoomConditions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      roomName_ = "";

      humidity_ = 0D;

      tempInCelcius_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service1.Service1Impl.internal_static_service1_CurrentRoomConditions_descriptor;
    }

    @java.lang.Override
    public ds.service1.CurrentRoomConditions getDefaultInstanceForType() {
      return ds.service1.CurrentRoomConditions.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service1.CurrentRoomConditions build() {
      ds.service1.CurrentRoomConditions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service1.CurrentRoomConditions buildPartial() {
      ds.service1.CurrentRoomConditions result = new ds.service1.CurrentRoomConditions(this);
      result.roomName_ = roomName_;
      result.humidity_ = humidity_;
      result.tempInCelcius_ = tempInCelcius_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.service1.CurrentRoomConditions) {
        return mergeFrom((ds.service1.CurrentRoomConditions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service1.CurrentRoomConditions other) {
      if (other == ds.service1.CurrentRoomConditions.getDefaultInstance()) return this;
      if (!other.getRoomName().isEmpty()) {
        roomName_ = other.roomName_;
        onChanged();
      }
      if (other.getHumidity() != 0D) {
        setHumidity(other.getHumidity());
      }
      if (other.getTempInCelcius() != 0D) {
        setTempInCelcius(other.getTempInCelcius());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.service1.CurrentRoomConditions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service1.CurrentRoomConditions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object roomName_ = "";
    /**
     * <code>string roomName = 1;</code>
     */
    public java.lang.String getRoomName() {
      java.lang.Object ref = roomName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roomName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRoomNameBytes() {
      java.lang.Object ref = roomName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roomName = 1;</code>
     */
    public Builder setRoomName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roomName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string roomName = 1;</code>
     */
    public Builder clearRoomName() {
      
      roomName_ = getDefaultInstance().getRoomName();
      onChanged();
      return this;
    }
    /**
     * <code>string roomName = 1;</code>
     */
    public Builder setRoomNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roomName_ = value;
      onChanged();
      return this;
    }

    private double humidity_ ;
    /**
     * <code>double humidity = 2;</code>
     */
    public double getHumidity() {
      return humidity_;
    }
    /**
     * <code>double humidity = 2;</code>
     */
    public Builder setHumidity(double value) {
      
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double humidity = 2;</code>
     */
    public Builder clearHumidity() {
      
      humidity_ = 0D;
      onChanged();
      return this;
    }

    private double tempInCelcius_ ;
    /**
     * <code>double tempInCelcius = 3;</code>
     */
    public double getTempInCelcius() {
      return tempInCelcius_;
    }
    /**
     * <code>double tempInCelcius = 3;</code>
     */
    public Builder setTempInCelcius(double value) {
      
      tempInCelcius_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double tempInCelcius = 3;</code>
     */
    public Builder clearTempInCelcius() {
      
      tempInCelcius_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:service1.CurrentRoomConditions)
  }

  // @@protoc_insertion_point(class_scope:service1.CurrentRoomConditions)
  private static final ds.service1.CurrentRoomConditions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service1.CurrentRoomConditions();
  }

  public static ds.service1.CurrentRoomConditions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CurrentRoomConditions>
      PARSER = new com.google.protobuf.AbstractParser<CurrentRoomConditions>() {
    @java.lang.Override
    public CurrentRoomConditions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CurrentRoomConditions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CurrentRoomConditions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CurrentRoomConditions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service1.CurrentRoomConditions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

