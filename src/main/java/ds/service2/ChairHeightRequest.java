// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package ds.service2;

/**
 * Protobuf type {@code service2.ChairHeightRequest}
 */
public  final class ChairHeightRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service2.ChairHeightRequest)
    ChairHeightRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChairHeightRequest.newBuilder() to construct.
  private ChairHeightRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChairHeightRequest() {
    operation_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChairHeightRequest(
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
            ds.service2.Chair.Builder subBuilder = null;
            if (chair_ != null) {
              subBuilder = chair_.toBuilder();
            }
            chair_ = input.readMessage(ds.service2.Chair.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chair_);
              chair_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
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
    return ds.service2.Service2Impl.internal_static_service2_ChairHeightRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service2.Service2Impl.internal_static_service2_ChairHeightRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service2.ChairHeightRequest.class, ds.service2.ChairHeightRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code service2.ChairHeightRequest.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CHAIRUP = 0;</code>
     */
    CHAIRUP(0),
    /**
     * <code>CHAIRDOWN = 1;</code>
     */
    CHAIRDOWN(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CHAIRUP = 0;</code>
     */
    public static final int CHAIRUP_VALUE = 0;
    /**
     * <code>CHAIRDOWN = 1;</code>
     */
    public static final int CHAIRDOWN_VALUE = 1;


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
        case 0: return CHAIRUP;
        case 1: return CHAIRDOWN;
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
      return ds.service2.ChairHeightRequest.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:service2.ChairHeightRequest.Operation)
  }

  public static final int CHAIR_FIELD_NUMBER = 1;
  private ds.service2.Chair chair_;
  /**
   * <code>.service2.Chair chair = 1;</code>
   */
  public boolean hasChair() {
    return chair_ != null;
  }
  /**
   * <code>.service2.Chair chair = 1;</code>
   */
  public ds.service2.Chair getChair() {
    return chair_ == null ? ds.service2.Chair.getDefaultInstance() : chair_;
  }
  /**
   * <code>.service2.Chair chair = 1;</code>
   */
  public ds.service2.ChairOrBuilder getChairOrBuilder() {
    return getChair();
  }

  public static final int OPERATION_FIELD_NUMBER = 2;
  private int operation_;
  /**
   * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
   */
  public int getOperationValue() {
    return operation_;
  }
  /**
   * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
   */
  public ds.service2.ChairHeightRequest.Operation getOperation() {
    @SuppressWarnings("deprecation")
    ds.service2.ChairHeightRequest.Operation result = ds.service2.ChairHeightRequest.Operation.valueOf(operation_);
    return result == null ? ds.service2.ChairHeightRequest.Operation.UNRECOGNIZED : result;
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
    if (chair_ != null) {
      output.writeMessage(1, getChair());
    }
    if (operation_ != ds.service2.ChairHeightRequest.Operation.CHAIRUP.getNumber()) {
      output.writeEnum(2, operation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (chair_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getChair());
    }
    if (operation_ != ds.service2.ChairHeightRequest.Operation.CHAIRUP.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, operation_);
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
    if (!(obj instanceof ds.service2.ChairHeightRequest)) {
      return super.equals(obj);
    }
    ds.service2.ChairHeightRequest other = (ds.service2.ChairHeightRequest) obj;

    boolean result = true;
    result = result && (hasChair() == other.hasChair());
    if (hasChair()) {
      result = result && getChair()
          .equals(other.getChair());
    }
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
    if (hasChair()) {
      hash = (37 * hash) + CHAIR_FIELD_NUMBER;
      hash = (53 * hash) + getChair().hashCode();
    }
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service2.ChairHeightRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.ChairHeightRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service2.ChairHeightRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service2.ChairHeightRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service2.ChairHeightRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service2.ChairHeightRequest parseFrom(
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
  public static Builder newBuilder(ds.service2.ChairHeightRequest prototype) {
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
   * Protobuf type {@code service2.ChairHeightRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service2.ChairHeightRequest)
      ds.service2.ChairHeightRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service2.Service2Impl.internal_static_service2_ChairHeightRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service2.Service2Impl.internal_static_service2_ChairHeightRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service2.ChairHeightRequest.class, ds.service2.ChairHeightRequest.Builder.class);
    }

    // Construct using ds.service2.ChairHeightRequest.newBuilder()
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
      if (chairBuilder_ == null) {
        chair_ = null;
      } else {
        chair_ = null;
        chairBuilder_ = null;
      }
      operation_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service2.Service2Impl.internal_static_service2_ChairHeightRequest_descriptor;
    }

    @java.lang.Override
    public ds.service2.ChairHeightRequest getDefaultInstanceForType() {
      return ds.service2.ChairHeightRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service2.ChairHeightRequest build() {
      ds.service2.ChairHeightRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service2.ChairHeightRequest buildPartial() {
      ds.service2.ChairHeightRequest result = new ds.service2.ChairHeightRequest(this);
      if (chairBuilder_ == null) {
        result.chair_ = chair_;
      } else {
        result.chair_ = chairBuilder_.build();
      }
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
      if (other instanceof ds.service2.ChairHeightRequest) {
        return mergeFrom((ds.service2.ChairHeightRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service2.ChairHeightRequest other) {
      if (other == ds.service2.ChairHeightRequest.getDefaultInstance()) return this;
      if (other.hasChair()) {
        mergeChair(other.getChair());
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
      ds.service2.ChairHeightRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service2.ChairHeightRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private ds.service2.Chair chair_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.service2.Chair, ds.service2.Chair.Builder, ds.service2.ChairOrBuilder> chairBuilder_;
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public boolean hasChair() {
      return chairBuilder_ != null || chair_ != null;
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public ds.service2.Chair getChair() {
      if (chairBuilder_ == null) {
        return chair_ == null ? ds.service2.Chair.getDefaultInstance() : chair_;
      } else {
        return chairBuilder_.getMessage();
      }
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public Builder setChair(ds.service2.Chair value) {
      if (chairBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chair_ = value;
        onChanged();
      } else {
        chairBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public Builder setChair(
        ds.service2.Chair.Builder builderForValue) {
      if (chairBuilder_ == null) {
        chair_ = builderForValue.build();
        onChanged();
      } else {
        chairBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public Builder mergeChair(ds.service2.Chair value) {
      if (chairBuilder_ == null) {
        if (chair_ != null) {
          chair_ =
            ds.service2.Chair.newBuilder(chair_).mergeFrom(value).buildPartial();
        } else {
          chair_ = value;
        }
        onChanged();
      } else {
        chairBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public Builder clearChair() {
      if (chairBuilder_ == null) {
        chair_ = null;
        onChanged();
      } else {
        chair_ = null;
        chairBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public ds.service2.Chair.Builder getChairBuilder() {
      
      onChanged();
      return getChairFieldBuilder().getBuilder();
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    public ds.service2.ChairOrBuilder getChairOrBuilder() {
      if (chairBuilder_ != null) {
        return chairBuilder_.getMessageOrBuilder();
      } else {
        return chair_ == null ?
            ds.service2.Chair.getDefaultInstance() : chair_;
      }
    }
    /**
     * <code>.service2.Chair chair = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.service2.Chair, ds.service2.Chair.Builder, ds.service2.ChairOrBuilder> 
        getChairFieldBuilder() {
      if (chairBuilder_ == null) {
        chairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ds.service2.Chair, ds.service2.Chair.Builder, ds.service2.ChairOrBuilder>(
                getChair(),
                getParentForChildren(),
                isClean());
        chair_ = null;
      }
      return chairBuilder_;
    }

    private int operation_ = 0;
    /**
     * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
     */
    public int getOperationValue() {
      return operation_;
    }
    /**
     * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
     */
    public ds.service2.ChairHeightRequest.Operation getOperation() {
      @SuppressWarnings("deprecation")
      ds.service2.ChairHeightRequest.Operation result = ds.service2.ChairHeightRequest.Operation.valueOf(operation_);
      return result == null ? ds.service2.ChairHeightRequest.Operation.UNRECOGNIZED : result;
    }
    /**
     * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
     */
    public Builder setOperation(ds.service2.ChairHeightRequest.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.service2.ChairHeightRequest.Operation operation = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:service2.ChairHeightRequest)
  }

  // @@protoc_insertion_point(class_scope:service2.ChairHeightRequest)
  private static final ds.service2.ChairHeightRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service2.ChairHeightRequest();
  }

  public static ds.service2.ChairHeightRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChairHeightRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChairHeightRequest>() {
    @java.lang.Override
    public ChairHeightRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChairHeightRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChairHeightRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChairHeightRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service2.ChairHeightRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

