// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

public interface UpdateToiletStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service3.UpdateToiletStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.service3.Toilet toilet = 1;</code>
   */
  boolean hasToilet();
  /**
   * <code>.service3.Toilet toilet = 1;</code>
   */
  ds.service3.Toilet getToilet();
  /**
   * <code>.service3.Toilet toilet = 1;</code>
   */
  ds.service3.ToiletOrBuilder getToiletOrBuilder();

  /**
   * <code>string date = 2;</code>
   */
  java.lang.String getDate();
  /**
   * <code>string date = 2;</code>
   */
  com.google.protobuf.ByteString
      getDateBytes();
}
