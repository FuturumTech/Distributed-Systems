// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service1.proto

package ds.service1;

public interface CurrentRoomConditionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service1.CurrentRoomConditions)
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
   * <code>double humidity = 2;</code>
   */
  double getHumidity();

  /**
   * <code>double tempInCelcius = 3;</code>
   */
  double getTempInCelcius();
}
