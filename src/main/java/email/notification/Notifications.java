// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmailNotification.proto

package email.notification;

public final class Notifications {
  private Notifications() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_answer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_thanks_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_thanks_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027EmailNotification.proto\"&\n\006answer\022\034\n\024C" +
      "onfirmation_Refusal\030\001 \001(\010\"\031\n\006thanks\022\017\n\007m" +
      "essage\030\001 \001(\t2W\n\014Notification\022%\n\017JobConfi" +
      "rmation\022\007.answer\032\007.thanks\"\000\022 \n\nTaskChang" +
      "e\022\007.answer\032\007.thanks\"\000B%\n\022email.notificat" +
      "ionB\rNotificationsP\001b\006proto3"
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
    internal_static_answer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_answer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_answer_descriptor,
        new java.lang.String[] { "ConfirmationRefusal", });
    internal_static_thanks_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_thanks_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_thanks_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
