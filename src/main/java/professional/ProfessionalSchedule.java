// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProffessionaSchedule.proto

package professional;

public final class ProfessionalSchedule {
  private ProfessionalSchedule() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_profile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_profile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_success_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_success_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_absenceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_absenceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ProffessionaSchedule.proto\"\232\001\n\007profile" +
      "\022\023\n\013card_number\030\001 \001(\005\022\014\n\004task\030\002 \001(\t\022\024\n\014c" +
      "ap_prof_mon\030\003 \001(\002\022\024\n\014cap_prof_tue\030\004 \001(\002\022" +
      "\024\n\014cap_prof_wed\030\005 \001(\002\022\024\n\014cap_prof_thu\030\006 " +
      "\001(\002\022\024\n\014cap_prof_fri\030\007 \001(\002\"\032\n\007success\022\017\n\007" +
      "message\030\001 \001(\t\"\216\001\n\016absenceRequest\022\023\n\013card" +
      "_number\030\001 \001(\005\022\022\n\njob_number\030\002 \001(\005\022\024\n\014hou" +
      "rs_booked\030\003 \001(\002\022\022\n\nday_booked\030\004 \001(\005\022\024\n\014m" +
      "onth_booked\030\005 \001(\005\022\023\n\013year_booked\030\006 \001(\0052\237" +
      "\001\n\nTimesheets\022(\n\020IntroduceProfile\022\010.prof" +
      "ile\032\010.success\"\000\0223\n\022AbsenceEmptyAgenda\022\017." +
      "absenceRequest\032\010.success\"\0000\001\0222\n\021AbsenceF" +
      "ullAgenda\022\017.absenceRequest\032\010.success\"\000(\001" +
      "B&\n\014professionalB\024ProfessionalScheduleP\001" +
      "b\006proto3"
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
    internal_static_profile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_profile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_profile_descriptor,
        new java.lang.String[] { "CardNumber", "Task", "CapProfMon", "CapProfTue", "CapProfWed", "CapProfThu", "CapProfFri", });
    internal_static_success_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_success_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_success_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_absenceRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_absenceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_absenceRequest_descriptor,
        new java.lang.String[] { "CardNumber", "JobNumber", "HoursBooked", "DayBooked", "MonthBooked", "YearBooked", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}