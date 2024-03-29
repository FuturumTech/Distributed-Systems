// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

/**
 * Protobuf enum {@code service3.ErrorCode}
 */
public enum ErrorCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ABOVE_20 = 0;</code>
   */
  ABOVE_20(0),
  /**
   * <code>BELOW_2 = 1;</code>
   */
  BELOW_2(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ABOVE_20 = 0;</code>
   */
  public static final int ABOVE_20_VALUE = 0;
  /**
   * <code>BELOW_2 = 1;</code>
   */
  public static final int BELOW_2_VALUE = 1;


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
  public static ErrorCode valueOf(int value) {
    return forNumber(value);
  }

  public static ErrorCode forNumber(int value) {
    switch (value) {
      case 0: return ABOVE_20;
      case 1: return BELOW_2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrorCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
          public ErrorCode findValueByNumber(int number) {
            return ErrorCode.forNumber(number);
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
    return ds.service3.Service3Impl.getDescriptor().getEnumTypes().get(0);
  }

  private static final ErrorCode[] VALUES = values();

  public static ErrorCode valueOf(
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

  private ErrorCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:service3.ErrorCode)
}

