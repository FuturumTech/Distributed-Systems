// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package ds.service1;

public interface DesiredRoomConditionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service1.DesiredRoomConditions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string roomName = 1;</code>
   */
  java.lang.String getRoomName();
  /**
   * <code>string roomName = 1;</code>
   */
  com.google.protobuf.ByteString
      getRoomNameBytes();

  /**
   * <code>float desiredHumidity = 2;</code>
   */
  float getDesiredHumidity();

  /**
   * <code>float desiredTempInCelcius = 3;</code>
   */
  float getDesiredTempInCelcius();
}