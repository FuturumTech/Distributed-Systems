// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package ds.service1;

/**
 * Protobuf type {@code service1.Room}
 */
public  final class Room extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service1.Room)
    RoomOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Room.newBuilder() to construct.
  private Room(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Room() {
    numberOfPeople_ = 0;
    roomName_ = "";
    humidity_ = 0F;
    tempInCelcius_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Room(
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
          case 8: {

            numberOfPeople_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            roomName_ = s;
            break;
          }
          case 29: {

            humidity_ = input.readFloat();
            break;
          }
          case 37: {

            tempInCelcius_ = input.readFloat();
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
    return ds.service1.Service1Impl.internal_static_service1_Room_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service1.Service1Impl.internal_static_service1_Room_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service1.Room.class, ds.service1.Room.Builder.class);
  }

  public static final int NUMBEROFPEOPLE_FIELD_NUMBER = 1;
  private int numberOfPeople_;
  /**
   * <code>int32 numberOfPeople = 1;</code>
   */
  public int getNumberOfPeople() {
    return numberOfPeople_;
  }

  public static final int ROOMNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object roomName_;
  /**
   * <code>string roomName = 2;</code>
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
   * <code>string roomName = 2;</code>
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

  public static final int HUMIDITY_FIELD_NUMBER = 3;
  private float humidity_;
  /**
   * <code>float humidity = 3;</code>
   */
  public float getHumidity() {
    return humidity_;
  }

  public static final int TEMPINCELCIUS_FIELD_NUMBER = 4;
  private float tempInCelcius_;
  /**
   * <code>float tempInCelcius = 4;</code>
   */
  public float getTempInCelcius() {
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
    if (numberOfPeople_ != 0) {
      output.writeInt32(1, numberOfPeople_);
    }
    if (!getRoomNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomName_);
    }
    if (humidity_ != 0F) {
      output.writeFloat(3, humidity_);
    }
    if (tempInCelcius_ != 0F) {
      output.writeFloat(4, tempInCelcius_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numberOfPeople_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, numberOfPeople_);
    }
    if (!getRoomNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomName_);
    }
    if (humidity_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, humidity_);
    }
    if (tempInCelcius_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, tempInCelcius_);
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
    if (!(obj instanceof ds.service1.Room)) {
      return super.equals(obj);
    }
    ds.service1.Room other = (ds.service1.Room) obj;

    boolean result = true;
    result = result && (getNumberOfPeople()
        == other.getNumberOfPeople());
    result = result && getRoomName()
        .equals(other.getRoomName());
    result = result && (
        java.lang.Float.floatToIntBits(getHumidity())
        == java.lang.Float.floatToIntBits(
            other.getHumidity()));
    result = result && (
        java.lang.Float.floatToIntBits(getTempInCelcius())
        == java.lang.Float.floatToIntBits(
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
    hash = (37 * hash) + NUMBEROFPEOPLE_FIELD_NUMBER;
    hash = (53 * hash) + getNumberOfPeople();
    hash = (37 * hash) + ROOMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoomName().hashCode();
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getHumidity());
    hash = (37 * hash) + TEMPINCELCIUS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTempInCelcius());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service1.Room parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service1.Room parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service1.Room parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service1.Room parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service1.Room parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service1.Room parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service1.Room parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service1.Room parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service1.Room parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service1.Room parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service1.Room parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service1.Room parseFrom(
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
  public static Builder newBuilder(ds.service1.Room prototype) {
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
   * Protobuf type {@code service1.Room}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service1.Room)
      ds.service1.RoomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service1.Service1Impl.internal_static_service1_Room_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service1.Service1Impl.internal_static_service1_Room_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service1.Room.class, ds.service1.Room.Builder.class);
    }

    // Construct using ds.service1.Room.newBuilder()
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
      numberOfPeople_ = 0;

      roomName_ = "";

      humidity_ = 0F;

      tempInCelcius_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service1.Service1Impl.internal_static_service1_Room_descriptor;
    }

    @java.lang.Override
    public ds.service1.Room getDefaultInstanceForType() {
      return ds.service1.Room.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service1.Room build() {
      ds.service1.Room result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service1.Room buildPartial() {
      ds.service1.Room result = new ds.service1.Room(this);
      result.numberOfPeople_ = numberOfPeople_;
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
      if (other instanceof ds.service1.Room) {
        return mergeFrom((ds.service1.Room)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service1.Room other) {
      if (other == ds.service1.Room.getDefaultInstance()) return this;
      if (other.getNumberOfPeople() != 0) {
        setNumberOfPeople(other.getNumberOfPeople());
      }
      if (!other.getRoomName().isEmpty()) {
        roomName_ = other.roomName_;
        onChanged();
      }
      if (other.getHumidity() != 0F) {
        setHumidity(other.getHumidity());
      }
      if (other.getTempInCelcius() != 0F) {
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
      ds.service1.Room parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service1.Room) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numberOfPeople_ ;
    /**
     * <code>int32 numberOfPeople = 1;</code>
     */
    public int getNumberOfPeople() {
      return numberOfPeople_;
    }
    /**
     * <code>int32 numberOfPeople = 1;</code>
     */
    public Builder setNumberOfPeople(int value) {
      
      numberOfPeople_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numberOfPeople = 1;</code>
     */
    public Builder clearNumberOfPeople() {
      
      numberOfPeople_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object roomName_ = "";
    /**
     * <code>string roomName = 2;</code>
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
     * <code>string roomName = 2;</code>
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
     * <code>string roomName = 2;</code>
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
     * <code>string roomName = 2;</code>
     */
    public Builder clearRoomName() {
      
      roomName_ = getDefaultInstance().getRoomName();
      onChanged();
      return this;
    }
    /**
     * <code>string roomName = 2;</code>
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

    private float humidity_ ;
    /**
     * <code>float humidity = 3;</code>
     */
    public float getHumidity() {
      return humidity_;
    }
    /**
     * <code>float humidity = 3;</code>
     */
    public Builder setHumidity(float value) {
      
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float humidity = 3;</code>
     */
    public Builder clearHumidity() {
      
      humidity_ = 0F;
      onChanged();
      return this;
    }

    private float tempInCelcius_ ;
    /**
     * <code>float tempInCelcius = 4;</code>
     */
    public float getTempInCelcius() {
      return tempInCelcius_;
    }
    /**
     * <code>float tempInCelcius = 4;</code>
     */
    public Builder setTempInCelcius(float value) {
      
      tempInCelcius_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float tempInCelcius = 4;</code>
     */
    public Builder clearTempInCelcius() {
      
      tempInCelcius_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:service1.Room)
  }

  // @@protoc_insertion_point(class_scope:service1.Room)
  private static final ds.service1.Room DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service1.Room();
  }

  public static ds.service1.Room getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Room>
      PARSER = new com.google.protobuf.AbstractParser<Room>() {
    @java.lang.Override
    public Room parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Room(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Room> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Room> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service1.Room getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

