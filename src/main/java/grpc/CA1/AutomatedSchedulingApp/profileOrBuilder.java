// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AutomatedSchedulingApp.proto

package grpc.CA1.AutomatedSchedulingApp;

public interface profileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:profile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *it may be a good idea to add the email here
   * </pre>
   *
   * <code>int32 card_number = 1;</code>
   */
  int getCardNumber();

  /**
   * <code>string task = 2;</code>
   */
  java.lang.String getTask();
  /**
   * <code>string task = 2;</code>
   */
  com.google.protobuf.ByteString
      getTaskBytes();

  /**
   * <code>float cap_prof_mon = 3;</code>
   */
  float getCapProfMon();

  /**
   * <code>float cap_prof_tue = 4;</code>
   */
  float getCapProfTue();

  /**
   * <code>float cap_prof_wed = 5;</code>
   */
  float getCapProfWed();

  /**
   * <code>float cap_prof_thu = 6;</code>
   */
  float getCapProfThu();

  /**
   * <code>float cap_prof_fri = 7;</code>
   */
  float getCapProfFri();
}
