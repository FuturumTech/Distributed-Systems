// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

/**
 * Protobuf type {@code service3.ErrorResponse}
 */
public  final class ErrorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service3.ErrorResponse)
    ErrorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorResponse.newBuilder() to construct.
  private ErrorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorResponse() {
    toiletName_ = "";
    exceededVisitsLimit_ = "";
    numberOfExceededVisits_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorResponse(
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

            toiletName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            exceededVisitsLimit_ = s;
            break;
          }
          case 24: {

            numberOfExceededVisits_ = input.readInt32();
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
    return ds.service3.Service3Impl.internal_static_service3_ErrorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service3.Service3Impl.internal_static_service3_ErrorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service3.ErrorResponse.class, ds.service3.ErrorResponse.Builder.class);
  }

  public static final int TOILETNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object toiletName_;
  /**
   * <code>string toiletName = 1;</code>
   */
  public java.lang.String getToiletName() {
    java.lang.Object ref = toiletName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toiletName_ = s;
      return s;
    }
  }
  /**
   * <code>string toiletName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getToiletNameBytes() {
    java.lang.Object ref = toiletName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toiletName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXCEEDEDVISITSLIMIT_FIELD_NUMBER = 2;
  private volatile java.lang.Object exceededVisitsLimit_;
  /**
   * <code>string exceededVisitsLimit = 2;</code>
   */
  public java.lang.String getExceededVisitsLimit() {
    java.lang.Object ref = exceededVisitsLimit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exceededVisitsLimit_ = s;
      return s;
    }
  }
  /**
   * <code>string exceededVisitsLimit = 2;</code>
   */
  public com.google.protobuf.ByteString
      getExceededVisitsLimitBytes() {
    java.lang.Object ref = exceededVisitsLimit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exceededVisitsLimit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBEROFEXCEEDEDVISITS_FIELD_NUMBER = 3;
  private int numberOfExceededVisits_;
  /**
   * <code>int32 numberOfExceededVisits = 3;</code>
   */
  public int getNumberOfExceededVisits() {
    return numberOfExceededVisits_;
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
    if (!getToiletNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, toiletName_);
    }
    if (!getExceededVisitsLimitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, exceededVisitsLimit_);
    }
    if (numberOfExceededVisits_ != 0) {
      output.writeInt32(3, numberOfExceededVisits_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getToiletNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, toiletName_);
    }
    if (!getExceededVisitsLimitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, exceededVisitsLimit_);
    }
    if (numberOfExceededVisits_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, numberOfExceededVisits_);
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
    if (!(obj instanceof ds.service3.ErrorResponse)) {
      return super.equals(obj);
    }
    ds.service3.ErrorResponse other = (ds.service3.ErrorResponse) obj;

    boolean result = true;
    result = result && getToiletName()
        .equals(other.getToiletName());
    result = result && getExceededVisitsLimit()
        .equals(other.getExceededVisitsLimit());
    result = result && (getNumberOfExceededVisits()
        == other.getNumberOfExceededVisits());
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
    hash = (37 * hash) + TOILETNAME_FIELD_NUMBER;
    hash = (53 * hash) + getToiletName().hashCode();
    hash = (37 * hash) + EXCEEDEDVISITSLIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getExceededVisitsLimit().hashCode();
    hash = (37 * hash) + NUMBEROFEXCEEDEDVISITS_FIELD_NUMBER;
    hash = (53 * hash) + getNumberOfExceededVisits();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service3.ErrorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.ErrorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.ErrorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.ErrorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.ErrorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.ErrorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.ErrorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.ErrorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.ErrorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service3.ErrorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.ErrorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.ErrorResponse parseFrom(
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
  public static Builder newBuilder(ds.service3.ErrorResponse prototype) {
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
   * Protobuf type {@code service3.ErrorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service3.ErrorResponse)
      ds.service3.ErrorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service3.Service3Impl.internal_static_service3_ErrorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service3.Service3Impl.internal_static_service3_ErrorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service3.ErrorResponse.class, ds.service3.ErrorResponse.Builder.class);
    }

    // Construct using ds.service3.ErrorResponse.newBuilder()
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
      toiletName_ = "";

      exceededVisitsLimit_ = "";

      numberOfExceededVisits_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service3.Service3Impl.internal_static_service3_ErrorResponse_descriptor;
    }

    @java.lang.Override
    public ds.service3.ErrorResponse getDefaultInstanceForType() {
      return ds.service3.ErrorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service3.ErrorResponse build() {
      ds.service3.ErrorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service3.ErrorResponse buildPartial() {
      ds.service3.ErrorResponse result = new ds.service3.ErrorResponse(this);
      result.toiletName_ = toiletName_;
      result.exceededVisitsLimit_ = exceededVisitsLimit_;
      result.numberOfExceededVisits_ = numberOfExceededVisits_;
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
      if (other instanceof ds.service3.ErrorResponse) {
        return mergeFrom((ds.service3.ErrorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service3.ErrorResponse other) {
      if (other == ds.service3.ErrorResponse.getDefaultInstance()) return this;
      if (!other.getToiletName().isEmpty()) {
        toiletName_ = other.toiletName_;
        onChanged();
      }
      if (!other.getExceededVisitsLimit().isEmpty()) {
        exceededVisitsLimit_ = other.exceededVisitsLimit_;
        onChanged();
      }
      if (other.getNumberOfExceededVisits() != 0) {
        setNumberOfExceededVisits(other.getNumberOfExceededVisits());
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
      ds.service3.ErrorResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service3.ErrorResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object toiletName_ = "";
    /**
     * <code>string toiletName = 1;</code>
     */
    public java.lang.String getToiletName() {
      java.lang.Object ref = toiletName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toiletName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string toiletName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getToiletNameBytes() {
      java.lang.Object ref = toiletName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toiletName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string toiletName = 1;</code>
     */
    public Builder setToiletName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toiletName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string toiletName = 1;</code>
     */
    public Builder clearToiletName() {
      
      toiletName_ = getDefaultInstance().getToiletName();
      onChanged();
      return this;
    }
    /**
     * <code>string toiletName = 1;</code>
     */
    public Builder setToiletNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toiletName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object exceededVisitsLimit_ = "";
    /**
     * <code>string exceededVisitsLimit = 2;</code>
     */
    public java.lang.String getExceededVisitsLimit() {
      java.lang.Object ref = exceededVisitsLimit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exceededVisitsLimit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string exceededVisitsLimit = 2;</code>
     */
    public com.google.protobuf.ByteString
        getExceededVisitsLimitBytes() {
      java.lang.Object ref = exceededVisitsLimit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exceededVisitsLimit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string exceededVisitsLimit = 2;</code>
     */
    public Builder setExceededVisitsLimit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      exceededVisitsLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string exceededVisitsLimit = 2;</code>
     */
    public Builder clearExceededVisitsLimit() {
      
      exceededVisitsLimit_ = getDefaultInstance().getExceededVisitsLimit();
      onChanged();
      return this;
    }
    /**
     * <code>string exceededVisitsLimit = 2;</code>
     */
    public Builder setExceededVisitsLimitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      exceededVisitsLimit_ = value;
      onChanged();
      return this;
    }

    private int numberOfExceededVisits_ ;
    /**
     * <code>int32 numberOfExceededVisits = 3;</code>
     */
    public int getNumberOfExceededVisits() {
      return numberOfExceededVisits_;
    }
    /**
     * <code>int32 numberOfExceededVisits = 3;</code>
     */
    public Builder setNumberOfExceededVisits(int value) {
      
      numberOfExceededVisits_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numberOfExceededVisits = 3;</code>
     */
    public Builder clearNumberOfExceededVisits() {
      
      numberOfExceededVisits_ = 0;
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


    // @@protoc_insertion_point(builder_scope:service3.ErrorResponse)
  }

  // @@protoc_insertion_point(class_scope:service3.ErrorResponse)
  private static final ds.service3.ErrorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service3.ErrorResponse();
  }

  public static ds.service3.ErrorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorResponse>
      PARSER = new com.google.protobuf.AbstractParser<ErrorResponse>() {
    @java.lang.Override
    public ErrorResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service3.ErrorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

