// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service3.proto

package ds.service3;

public interface UpdateToiletStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service3.UpdateToiletStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool statusUpdated = 1;</code>
   */
  boolean getStatusUpdated();

  /**
   * <code>.service3.Toilet toilet = 2;</code>
   */
  boolean hasToilet();
  /**
   * <code>.service3.Toilet toilet = 2;</code>
   */
  ds.service3.Toilet getToilet();
  /**
   * <code>.service3.Toilet toilet = 2;</code>
   */
  ds.service3.ToiletOrBuilder getToiletOrBuilder();

  /**
   * <code>string date = 3;</code>
   */
  java.lang.String getDate();
  /**
   * <code>string date = 3;</code>
   */
  com.google.protobuf.ByteString
      getDateBytes();
}
