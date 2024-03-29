// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

/**
 * <pre>
 *rpc EntersToToilet:
 * </pre>
 *
 * Protobuf type {@code service3.ToiletVisitsRequest}
 */
public  final class ToiletVisitsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service3.ToiletVisitsRequest)
    ToiletVisitsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ToiletVisitsRequest.newBuilder() to construct.
  private ToiletVisitsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ToiletVisitsRequest() {
    toiletLastEnterDateAndTime_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ToiletVisitsRequest(
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

            toiletLastEnterDateAndTime_ = s;
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
    return ds.service3.Service3Impl.internal_static_service3_ToiletVisitsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.service3.Service3Impl.internal_static_service3_ToiletVisitsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.service3.ToiletVisitsRequest.class, ds.service3.ToiletVisitsRequest.Builder.class);
  }

  public static final int TOILETLASTENTERDATEANDTIME_FIELD_NUMBER = 1;
  private volatile java.lang.Object toiletLastEnterDateAndTime_;
  /**
   * <code>string toiletLastEnterDateAndTime = 1;</code>
   */
  public java.lang.String getToiletLastEnterDateAndTime() {
    java.lang.Object ref = toiletLastEnterDateAndTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toiletLastEnterDateAndTime_ = s;
      return s;
    }
  }
  /**
   * <code>string toiletLastEnterDateAndTime = 1;</code>
   */
  public com.google.protobuf.ByteString
      getToiletLastEnterDateAndTimeBytes() {
    java.lang.Object ref = toiletLastEnterDateAndTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toiletLastEnterDateAndTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getToiletLastEnterDateAndTimeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, toiletLastEnterDateAndTime_);
    }
    if (toilet_ != null) {
      output.writeMessage(2, getToilet());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getToiletLastEnterDateAndTimeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, toiletLastEnterDateAndTime_);
    }
    if (toilet_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getToilet());
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
    if (!(obj instanceof ds.service3.ToiletVisitsRequest)) {
      return super.equals(obj);
    }
    ds.service3.ToiletVisitsRequest other = (ds.service3.ToiletVisitsRequest) obj;

    boolean result = true;
    result = result && getToiletLastEnterDateAndTime()
        .equals(other.getToiletLastEnterDateAndTime());
    result = result && (hasToilet() == other.hasToilet());
    if (hasToilet()) {
      result = result && getToilet()
          .equals(other.getToilet());
    }
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
    hash = (37 * hash) + TOILETLASTENTERDATEANDTIME_FIELD_NUMBER;
    hash = (53 * hash) + getToiletLastEnterDateAndTime().hashCode();
    if (hasToilet()) {
      hash = (37 * hash) + TOILET_FIELD_NUMBER;
      hash = (53 * hash) + getToilet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.service3.ToiletVisitsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.ToiletVisitsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.service3.ToiletVisitsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.service3.ToiletVisitsRequest parseFrom(
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
  public static Builder newBuilder(ds.service3.ToiletVisitsRequest prototype) {
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
   * <pre>
   *rpc EntersToToilet:
   * </pre>
   *
   * Protobuf type {@code service3.ToiletVisitsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service3.ToiletVisitsRequest)
      ds.service3.ToiletVisitsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.service3.Service3Impl.internal_static_service3_ToiletVisitsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.service3.Service3Impl.internal_static_service3_ToiletVisitsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.service3.ToiletVisitsRequest.class, ds.service3.ToiletVisitsRequest.Builder.class);
    }

    // Construct using ds.service3.ToiletVisitsRequest.newBuilder()
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
      toiletLastEnterDateAndTime_ = "";

      if (toiletBuilder_ == null) {
        toilet_ = null;
      } else {
        toilet_ = null;
        toiletBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.service3.Service3Impl.internal_static_service3_ToiletVisitsRequest_descriptor;
    }

    @java.lang.Override
    public ds.service3.ToiletVisitsRequest getDefaultInstanceForType() {
      return ds.service3.ToiletVisitsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public ds.service3.ToiletVisitsRequest build() {
      ds.service3.ToiletVisitsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.service3.ToiletVisitsRequest buildPartial() {
      ds.service3.ToiletVisitsRequest result = new ds.service3.ToiletVisitsRequest(this);
      result.toiletLastEnterDateAndTime_ = toiletLastEnterDateAndTime_;
      if (toiletBuilder_ == null) {
        result.toilet_ = toilet_;
      } else {
        result.toilet_ = toiletBuilder_.build();
      }
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
      if (other instanceof ds.service3.ToiletVisitsRequest) {
        return mergeFrom((ds.service3.ToiletVisitsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.service3.ToiletVisitsRequest other) {
      if (other == ds.service3.ToiletVisitsRequest.getDefaultInstance()) return this;
      if (!other.getToiletLastEnterDateAndTime().isEmpty()) {
        toiletLastEnterDateAndTime_ = other.toiletLastEnterDateAndTime_;
        onChanged();
      }
      if (other.hasToilet()) {
        mergeToilet(other.getToilet());
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
      ds.service3.ToiletVisitsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.service3.ToiletVisitsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object toiletLastEnterDateAndTime_ = "";
    /**
     * <code>string toiletLastEnterDateAndTime = 1;</code>
     */
    public java.lang.String getToiletLastEnterDateAndTime() {
      java.lang.Object ref = toiletLastEnterDateAndTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toiletLastEnterDateAndTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string toiletLastEnterDateAndTime = 1;</code>
     */
    public com.google.protobuf.ByteString
        getToiletLastEnterDateAndTimeBytes() {
      java.lang.Object ref = toiletLastEnterDateAndTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toiletLastEnterDateAndTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string toiletLastEnterDateAndTime = 1;</code>
     */
    public Builder setToiletLastEnterDateAndTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      toiletLastEnterDateAndTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string toiletLastEnterDateAndTime = 1;</code>
     */
    public Builder clearToiletLastEnterDateAndTime() {
      
      toiletLastEnterDateAndTime_ = getDefaultInstance().getToiletLastEnterDateAndTime();
      onChanged();
      return this;
    }
    /**
     * <code>string toiletLastEnterDateAndTime = 1;</code>
     */
    public Builder setToiletLastEnterDateAndTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      toiletLastEnterDateAndTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:service3.ToiletVisitsRequest)
  }

  // @@protoc_insertion_point(class_scope:service3.ToiletVisitsRequest)
  private static final ds.service3.ToiletVisitsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.service3.ToiletVisitsRequest();
  }

  public static ds.service3.ToiletVisitsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ToiletVisitsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ToiletVisitsRequest>() {
    @java.lang.Override
    public ToiletVisitsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ToiletVisitsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ToiletVisitsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ToiletVisitsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.service3.ToiletVisitsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

