// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

/**
 * Protobuf type {@code service3.UpdateToiletStatusResponse}
 */
public  final class UpdateToiletStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service3.UpdateToiletStatusResponse)
    UpdateToiletStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateToiletStatusResponse.newBuilder() to construct.
  private UpdateToiletStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateToiletStatusResponse() {
    statusUpdated_ = false;
    date_ = "";
    needsCleaning_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateToiletStatusResponse(
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

            statusUpdated_ = input.readBool();
            break;
          }
          case 18: {
            ds.service3.Toilet.Builder subBuilder = null;
            if (toilet_ != null) {
              subBuilder = toilet_.toBuilder();
            }
            toilet_ = input.readMessage(ds.service3.Toilet.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(toilet_);
              toilet_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            date_ = s;
            break;
          }
          case 32: {

            needsCleaning_ = input.readBool();
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
    return ds.service3.Service3Impl.internal_static_service3_UpdateToiletStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service3.Service3Impl.internal_static_service3_UpdateToiletStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service3.UpdateToiletStatusResponse.class, ds.service3.UpdateToiletStatusResponse.Builder.class);
  }

  public static final int STATUSUPDATED_FIELD_NUMBER = 1;
  private boolean statusUpdated_;
  /**
   * <code>bool statusUpdated = 1;</code>
   */
  public boolean getStatusUpdated() {
    return statusUpdated_;
  }

  public static final int TOILET_FIELD_NUMBER = 2;
  private ds.service3.Toilet toilet_;
  /**
   * <code>.service3.Toilet toilet = 2;</code>
   */
  public boolean hasToilet() {
    return toilet_ != null;
  }
  /**
   * <code>.service3.Toilet toilet = 2;</code>
   */
  public ds.service3.Toilet getToilet() {
    return toilet_ == null ? ds.service3.Toilet.getDefaultInstance() : toilet_;
  }
  /**
   * <code>.service3.Toilet toilet = 2;</code>
   */
  public ds.service3.ToiletOrBuilder getToiletOrBuilder() {
    return getToilet();
  }

  public static final int DATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 3;</code>
   */
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEEDSCLEANING_FIELD_NUMBER = 4;
  private boolean needsCleaning_;
  /**
   * <code>bool needsCleaning = 4;</code>
   */
  public boolean getNeedsCleaning() {
    return needsCleaning_;
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
    if (statusUpdated_ != false) {
      output.writeBool(1, statusUpdated_);
    }
    if (toilet_ != null) {
      output.writeMessage(2, getToilet());
    }
    if (!getDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, date_);
    }
    if (needsCleaning_ != false) {
      output.writeBool(4, needsCleaning_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (statusUpdated_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, statusUpdated_);
    }
    if (toilet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getToilet());
    }
    if (!getDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, date_);
    }
    if (needsCleaning_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, needsCleaning_);
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
    if (!(obj instanceof ds.service3.UpdateToiletStatusResponse)) {
      return super.equals(obj);
    }
    ds.service3.UpdateToiletStatusResponse other = (ds.service3.UpdateToiletStatusResponse) obj;

    boolean result = true;
    result = result && (getStatusUpdated()
        == other.getStatusUpdated());
    result = result && (hasToilet() == other.hasToilet());
    if (hasToilet()) {
      result = result && getToilet()
          .equals(other.getToilet());
    }
    result = result && getDate()
        .equals(other.getDate());
    result = result && (getNeedsCleaning()
        == other.getNeedsCleaning());
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
    hash = (37 * hash) + STATUSUPDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getStatusUpdated());
    if (hasToilet()) {
      hash = (37 * hash) + TOILET_FIELD_NUMBER;
      hash = (53 * hash) + getToilet().hashCode();
    }
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + NEEDSCLEANING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedsCleaning());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.UpdateToiletStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service3.UpdateToiletStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.UpdateToiletStatusResponse parseFrom(
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
  public static Builder newBuilder(ds.service3.UpdateToiletStatusResponse prototype) {
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
   * Protobuf type {@code service3.UpdateToiletStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service3.UpdateToiletStatusResponse)
      ds.service3.UpdateToiletStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service3.Service3Impl.internal_static_service3_UpdateToiletStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service3.Service3Impl.internal_static_service3_UpdateToiletStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service3.UpdateToiletStatusResponse.class, ds.service3.UpdateToiletStatusResponse.Builder.class);
    }

    // Construct using ds.service3.UpdateToiletStatusResponse.newBuilder()
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
      statusUpdated_ = false;

      if (toiletBuilder_ == null) {
        toilet_ = null;
      } else {
        toilet_ = null;
        toiletBuilder_ = null;
      }
      date_ = "";

      needsCleaning_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service3.Service3Impl.internal_static_service3_UpdateToiletStatusResponse_descriptor;
    }

    @java.lang.Override
    public ds.service3.UpdateToiletStatusResponse getDefaultInstanceForType() {
      return ds.service3.UpdateToiletStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service3.UpdateToiletStatusResponse build() {
      ds.service3.UpdateToiletStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service3.UpdateToiletStatusResponse buildPartial() {
      ds.service3.UpdateToiletStatusResponse result = new ds.service3.UpdateToiletStatusResponse(this);
      result.statusUpdated_ = statusUpdated_;
      if (toiletBuilder_ == null) {
        result.toilet_ = toilet_;
      } else {
        result.toilet_ = toiletBuilder_.build();
      }
      result.date_ = date_;
      result.needsCleaning_ = needsCleaning_;
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
      if (other instanceof ds.service3.UpdateToiletStatusResponse) {
        return mergeFrom((ds.service3.UpdateToiletStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service3.UpdateToiletStatusResponse other) {
      if (other == ds.service3.UpdateToiletStatusResponse.getDefaultInstance()) return this;
      if (other.getStatusUpdated() != false) {
        setStatusUpdated(other.getStatusUpdated());
      }
      if (other.hasToilet()) {
        mergeToilet(other.getToilet());
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (other.getNeedsCleaning() != false) {
        setNeedsCleaning(other.getNeedsCleaning());
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
      ds.service3.UpdateToiletStatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service3.UpdateToiletStatusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean statusUpdated_ ;
    /**
     * <code>bool statusUpdated = 1;</code>
     */
    public boolean getStatusUpdated() {
      return statusUpdated_;
    }
    /**
     * <code>bool statusUpdated = 1;</code>
     */
    public Builder setStatusUpdated(boolean value) {
      
      statusUpdated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool statusUpdated = 1;</code>
     */
    public Builder clearStatusUpdated() {
      
      statusUpdated_ = false;
      onChanged();
      return this;
    }

    private ds.service3.Toilet toilet_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.service3.Toilet, ds.service3.Toilet.Builder, ds.service3.ToiletOrBuilder> toiletBuilder_;
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public boolean hasToilet() {
      return toiletBuilder_ != null || toilet_ != null;
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public ds.service3.Toilet getToilet() {
      if (toiletBuilder_ == null) {
        return toilet_ == null ? ds.service3.Toilet.getDefaultInstance() : toilet_;
      } else {
        return toiletBuilder_.getMessage();
      }
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public Builder setToilet(ds.service3.Toilet value) {
      if (toiletBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toilet_ = value;
        onChanged();
      } else {
        toiletBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public Builder setToilet(
        ds.service3.Toilet.Builder builderForValue) {
      if (toiletBuilder_ == null) {
        toilet_ = builderForValue.build();
        onChanged();
      } else {
        toiletBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public Builder mergeToilet(ds.service3.Toilet value) {
      if (toiletBuilder_ == null) {
        if (toilet_ != null) {
          toilet_ =
            ds.service3.Toilet.newBuilder(toilet_).mergeFrom(value).buildPartial();
        } else {
          toilet_ = value;
        }
        onChanged();
      } else {
        toiletBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public Builder clearToilet() {
      if (toiletBuilder_ == null) {
        toilet_ = null;
        onChanged();
      } else {
        toilet_ = null;
        toiletBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public ds.service3.Toilet.Builder getToiletBuilder() {
      
      onChanged();
      return getToiletFieldBuilder().getBuilder();
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    public ds.service3.ToiletOrBuilder getToiletOrBuilder() {
      if (toiletBuilder_ != null) {
        return toiletBuilder_.getMessageOrBuilder();
      } else {
        return toilet_ == null ?
            ds.service3.Toilet.getDefaultInstance() : toilet_;
      }
    }
    /**
     * <code>.service3.Toilet toilet = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ds.service3.Toilet, ds.service3.Toilet.Builder, ds.service3.ToiletOrBuilder> 
        getToiletFieldBuilder() {
      if (toiletBuilder_ == null) {
        toiletBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ds.service3.Toilet, ds.service3.Toilet.Builder, ds.service3.ToiletOrBuilder>(
                getToilet(),
                getParentForChildren(),
                isClean());
        toilet_ = null;
      }
      return toiletBuilder_;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 3;</code>
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 3;</code>
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 3;</code>
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 3;</code>
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private boolean needsCleaning_ ;
    /**
     * <code>bool needsCleaning = 4;</code>
     */
    public boolean getNeedsCleaning() {
      return needsCleaning_;
    }
    /**
     * <code>bool needsCleaning = 4;</code>
     */
    public Builder setNeedsCleaning(boolean value) {
      
      needsCleaning_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool needsCleaning = 4;</code>
     */
    public Builder clearNeedsCleaning() {
      
      needsCleaning_ = false;
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


    // @@protoc_insertion_point(builder_scope:service3.UpdateToiletStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:service3.UpdateToiletStatusResponse)
  private static final ds.service3.UpdateToiletStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service3.UpdateToiletStatusResponse();
  }

  public static ds.service3.UpdateToiletStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateToiletStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateToiletStatusResponse>() {
    @java.lang.Override
    public UpdateToiletStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateToiletStatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateToiletStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateToiletStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service3.UpdateToiletStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

