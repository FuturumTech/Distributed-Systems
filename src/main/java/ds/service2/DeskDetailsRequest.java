// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package ds.service2;

/**
 * Protobuf type {@code service2.DeskDetailsRequest}
 */
public  final class DeskDetailsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2.DeskDetailsRequest)
    DeskDetailsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeskDetailsRequest.newBuilder() to construct.
  private DeskDetailsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeskDetailsRequest() {
    deskNumber_ = 0;
    roomName_ = "";
    desiredDeskHeight_ = 0;
    operation_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeskDetailsRequest(
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

            deskNumber_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            roomName_ = s;
            break;
          }
          case 24: {

            desiredDeskHeight_ = input.readInt32();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            operation_ = rawValue;
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
    return ds.service2.Service2Impl.internal_static_service2_DeskDetailsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service2.Service2Impl.internal_static_service2_DeskDetailsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service2.DeskDetailsRequest.class, ds.service2.DeskDetailsRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code service2.DeskDetailsRequest.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DESKUP = 0;</code>
     */
    DESKUP(0),
    /**
     * <code>DESKDOWN = 1;</code>
     */
    DESKDOWN(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DESKUP = 0;</code>
     */
    public static final int DESKUP_VALUE = 0;
    /**
     * <code>DESKDOWN = 1;</code>
     */
    public static final int DESKDOWN_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return DESKUP;
        case 1: return DESKDOWN;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ds.service2.DeskDetailsRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:service2.DeskDetailsRequest.Operation)
  }

  public static final int DESKNUMBER_FIELD_NUMBER = 1;
  private int deskNumber_;
  /**
   * <code>int32 deskNumber = 1;</code>
   */
  public int getDeskNumber() {
    return deskNumber_;
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

  public static final int DESIREDDESKHEIGHT_FIELD_NUMBER = 3;
  private int desiredDeskHeight_;
  /**
   * <code>int32 desiredDeskHeight = 3;</code>
   */
  public int getDesiredDeskHeight() {
    return desiredDeskHeight_;
  }

  public static final int OPERATION_FIELD_NUMBER = 4;
  private int operation_;
  /**
   * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
   */
  public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
   */
  public ds.service2.DeskDetailsRequest.Operation getOperation() {
    @SuppressWarnings("deprecation")
    ds.service2.DeskDetailsRequest.Operation result = ds.service2.DeskDetailsRequest.Operation.valueOf(operation_);
    return result == null ? ds.service2.DeskDetailsRequest.Operation.UNRECOGNIZED : result;
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
    if (deskNumber_ != 0) {
      output.writeInt32(1, deskNumber_);
    }
    if (!getRoomNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomName_);
    }
    if (desiredDeskHeight_ != 0) {
      output.writeInt32(3, desiredDeskHeight_);
    }
    if (operation_ != ds.service2.DeskDetailsRequest.Operation.DESKUP.getNumber()) {
      output.writeEnum(4, operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deskNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, deskNumber_);
    }
    if (!getRoomNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomName_);
    }
    if (desiredDeskHeight_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, desiredDeskHeight_);
    }
    if (operation_ != ds.service2.DeskDetailsRequest.Operation.DESKUP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, operation_);
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
    if (!(obj instanceof ds.service2.DeskDetailsRequest)) {
      return super.equals(obj);
    }
    ds.service2.DeskDetailsRequest other = (ds.service2.DeskDetailsRequest) obj;

    boolean result = true;
    result = result && (getDeskNumber()
        == other.getDeskNumber());
    result = result && getRoomName()
        .equals(other.getRoomName());
    result = result && (getDesiredDeskHeight()
        == other.getDesiredDeskHeight());
    result = result && operation_ == other.operation_;
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
    hash = (37 * hash) + DESKNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getDeskNumber();
    hash = (37 * hash) + ROOMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getRoomName().hashCode();
    hash = (37 * hash) + DESIREDDESKHEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + getDesiredDeskHeight();
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service2.DeskDetailsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service2.DeskDetailsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service2.DeskDetailsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service2.DeskDetailsRequest parseFrom(
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
  public static Builder newBuilder(ds.service2.DeskDetailsRequest prototype) {
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
   * Protobuf type {@code service2.DeskDetailsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2.DeskDetailsRequest)
      ds.service2.DeskDetailsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service2.Service2Impl.internal_static_service2_DeskDetailsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service2.Service2Impl.internal_static_service2_DeskDetailsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service2.DeskDetailsRequest.class, ds.service2.DeskDetailsRequest.Builder.class);
    }

    // Construct using ds.service2.DeskDetailsRequest.newBuilder()
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
      deskNumber_ = 0;

      roomName_ = "";

      desiredDeskHeight_ = 0;

      operation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service2.Service2Impl.internal_static_service2_DeskDetailsRequest_descriptor;
    }

    @java.lang.Override
    public ds.service2.DeskDetailsRequest getDefaultInstanceForType() {
      return ds.service2.DeskDetailsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service2.DeskDetailsRequest build() {
      ds.service2.DeskDetailsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service2.DeskDetailsRequest buildPartial() {
      ds.service2.DeskDetailsRequest result = new ds.service2.DeskDetailsRequest(this);
      result.deskNumber_ = deskNumber_;
      result.roomName_ = roomName_;
      result.desiredDeskHeight_ = desiredDeskHeight_;
      result.operation_ = operation_;
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
      if (other instanceof ds.service2.DeskDetailsRequest) {
        return mergeFrom((ds.service2.DeskDetailsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service2.DeskDetailsRequest other) {
      if (other == ds.service2.DeskDetailsRequest.getDefaultInstance()) return this;
      if (other.getDeskNumber() != 0) {
        setDeskNumber(other.getDeskNumber());
      }
      if (!other.getRoomName().isEmpty()) {
        roomName_ = other.roomName_;
        onChanged();
      }
      if (other.getDesiredDeskHeight() != 0) {
        setDesiredDeskHeight(other.getDesiredDeskHeight());
      }
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
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
      ds.service2.DeskDetailsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service2.DeskDetailsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int deskNumber_ ;
    /**
     * <code>int32 deskNumber = 1;</code>
     */
    public int getDeskNumber() {
      return deskNumber_;
    }
    /**
     * <code>int32 deskNumber = 1;</code>
     */
    public Builder setDeskNumber(int value) {
      
      deskNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 deskNumber = 1;</code>
     */
    public Builder clearDeskNumber() {
      
      deskNumber_ = 0;
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

    private int desiredDeskHeight_ ;
    /**
     * <code>int32 desiredDeskHeight = 3;</code>
     */
    public int getDesiredDeskHeight() {
      return desiredDeskHeight_;
    }
    /**
     * <code>int32 desiredDeskHeight = 3;</code>
     */
    public Builder setDesiredDeskHeight(int value) {
      
      desiredDeskHeight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 desiredDeskHeight = 3;</code>
     */
    public Builder clearDesiredDeskHeight() {
      
      desiredDeskHeight_ = 0;
      onChanged();
      return this;
    }

    private int operation_ = 0;
    /**
     * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
     */
    public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
     */
    public ds.service2.DeskDetailsRequest.Operation getOperation() {
      @SuppressWarnings("deprecation")
      ds.service2.DeskDetailsRequest.Operation result = ds.service2.DeskDetailsRequest.Operation.valueOf(operation_);
      return result == null ? ds.service2.DeskDetailsRequest.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
     */
    public Builder setOperation(ds.service2.DeskDetailsRequest.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.service2.DeskDetailsRequest.Operation operation = 4;</code>
     */
    public Builder clearOperation() {
      
      operation_ = 0;
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


    // @@protoc_insertion_point(builder_scope:service2.DeskDetailsRequest)
  }

  // @@protoc_insertion_point(class_scope:service2.DeskDetailsRequest)
  private static final ds.service2.DeskDetailsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service2.DeskDetailsRequest();
  }

  public static ds.service2.DeskDetailsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeskDetailsRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeskDetailsRequest>() {
    @java.lang.Override
    public DeskDetailsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeskDetailsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeskDetailsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeskDetailsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service2.DeskDetailsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

