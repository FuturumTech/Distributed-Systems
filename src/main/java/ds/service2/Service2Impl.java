// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package ds.service2;

public final class Service2Impl {
  private Service2Impl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_DeskDetailsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_DeskDetailsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_DeskAdjustedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_DeskAdjustedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_Chair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_Chair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_ChairHeightRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_ChairHeightRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_service2_ChairHeightResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_service2_ChairHeightResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016service2.proto\022\010service2\"\267\001\n\022DeskDetai" +
      "lsRequest\022\022\n\ndeskNumber\030\001 \001(\005\022\020\n\010roomNam" +
      "e\030\002 \001(\t\022\031\n\021desiredDeskHeight\030\003 \001(\005\0229\n\top" +
      "eration\030\004 \001(\0162&.service2.DeskDetailsRequ" +
      "est.Operation\"%\n\tOperation\022\n\n\006DESKUP\020\000\022\014" +
      "\n\010DESKDOWN\020\001\"D\n\024DeskAdjustedResponse\022\022\n\n" +
      "deskHeight\030\001 \001(\005\022\030\n\020isHeightAdjusted\030\002 \001" +
      "(\010\"B\n\005Chair\022\023\n\013chairHeight\030\001 \001(\005\022\022\n\ndesk" +
      "Number\030\002 \001(\005\022\020\n\010roomName\030\003 \001(\t\"\247\001\n\022Chair" +
      "HeightRequest\022\036\n\005chair\030\001 \001(\0132\017.service2." +
      "Chair\022C\n\016chairOperation\030\002 \001(\0162+.service2" +
      ".ChairHeightRequest.ChairOperation\",\n\016Ch" +
      "airOperation\022\013\n\007CHAIRUP\020\000\022\r\n\tCHAIRDOWN\020\001" +
      "\"O\n\023ChairHeightResponse\022\036\n\005chair\030\001 \001(\0132\017" +
      ".service2.Chair\022\030\n\020isHeightAdjusted\030\002 \001(" +
      "\0102\262\001\n\010Service2\022R\n\020DeskStatusHeight\022\034.ser" +
      "vice2.DeskDetailsRequest\032\036.service2.Desk" +
      "AdjustedResponse\"\000\022R\n\021ChairStatusHeight\022" +
      "\034.service2.ChairHeightRequest\032\035.service2" +
      ".ChairHeightResponse\"\000B\035\n\013ds.service2B\014S" +
      "ervice2ImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_service2_DeskDetailsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_service2_DeskDetailsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_DeskDetailsRequest_descriptor,
        new java.lang.String[] { "DeskNumber", "RoomName", "DesiredDeskHeight", "Operation", });
    internal_static_service2_DeskAdjustedResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_service2_DeskAdjustedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_DeskAdjustedResponse_descriptor,
        new java.lang.String[] { "DeskHeight", "IsHeightAdjusted", });
    internal_static_service2_Chair_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_service2_Chair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_Chair_descriptor,
        new java.lang.String[] { "ChairHeight", "DeskNumber", "RoomName", });
    internal_static_service2_ChairHeightRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_service2_ChairHeightRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_ChairHeightRequest_descriptor,
        new java.lang.String[] { "Chair", "ChairOperation", });
    internal_static_service2_ChairHeightResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_service2_ChairHeightResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_service2_ChairHeightResponse_descriptor,
        new java.lang.String[] { "Chair", "IsHeightAdjusted", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
