// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectManagerSchedule.proto

package grpc.CA1.AutomatedSchedulingApp;

/**
 * Protobuf type {@code TaskSpecifications}
 */
public  final class TaskSpecifications extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TaskSpecifications)
    TaskSpecificationsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskSpecifications.newBuilder() to construct.
  private TaskSpecifications(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskSpecifications() {
    projectNumber_ = "";
    task_ = "";
    numberHours_ = 0F;
    dayMilestone_ = 0L;
    monthMilestone_ = 0L;
    yearMilestone_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskSpecifications(
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

            projectNumber_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            task_ = s;
            break;
          }
          case 29: {

            numberHours_ = input.readFloat();
            break;
          }
          case 32: {

            dayMilestone_ = input.readInt64();
            break;
          }
          case 40: {

            monthMilestone_ = input.readInt64();
            break;
          }
          case 48: {

            yearMilestone_ = input.readInt64();
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
    return grpc.CA1.AutomatedSchedulingApp.projectManagerSchedule.internal_static_TaskSpecifications_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.CA1.AutomatedSchedulingApp.projectManagerSchedule.internal_static_TaskSpecifications_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.class, grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.Builder.class);
  }

  public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectNumber_;
  /**
   * <code>string project_number = 1;</code>
   */
  public java.lang.String getProjectNumber() {
    java.lang.Object ref = projectNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string project_number = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProjectNumberBytes() {
    java.lang.Object ref = projectNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TASK_FIELD_NUMBER = 2;
  private volatile java.lang.Object task_;
  /**
   * <code>string task = 2;</code>
   */
  public java.lang.String getTask() {
    java.lang.Object ref = task_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      task_ = s;
      return s;
    }
  }
  /**
   * <code>string task = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTaskBytes() {
    java.lang.Object ref = task_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      task_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMBER_HOURS_FIELD_NUMBER = 3;
  private float numberHours_;
  /**
   * <code>float number_hours = 3;</code>
   */
  public float getNumberHours() {
    return numberHours_;
  }

  public static final int DAY_MILESTONE_FIELD_NUMBER = 4;
  private long dayMilestone_;
  /**
   * <code>int64 day_milestone = 4;</code>
   */
  public long getDayMilestone() {
    return dayMilestone_;
  }

  public static final int MONTH_MILESTONE_FIELD_NUMBER = 5;
  private long monthMilestone_;
  /**
   * <code>int64 month_milestone = 5;</code>
   */
  public long getMonthMilestone() {
    return monthMilestone_;
  }

  public static final int YEAR_MILESTONE_FIELD_NUMBER = 6;
  private long yearMilestone_;
  /**
   * <code>int64 year_milestone = 6;</code>
   */
  public long getYearMilestone() {
    return yearMilestone_;
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
    if (!getProjectNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectNumber_);
    }
    if (!getTaskBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, task_);
    }
    if (numberHours_ != 0F) {
      output.writeFloat(3, numberHours_);
    }
    if (dayMilestone_ != 0L) {
      output.writeInt64(4, dayMilestone_);
    }
    if (monthMilestone_ != 0L) {
      output.writeInt64(5, monthMilestone_);
    }
    if (yearMilestone_ != 0L) {
      output.writeInt64(6, yearMilestone_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectNumber_);
    }
    if (!getTaskBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, task_);
    }
    if (numberHours_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, numberHours_);
    }
    if (dayMilestone_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, dayMilestone_);
    }
    if (monthMilestone_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, monthMilestone_);
    }
    if (yearMilestone_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, yearMilestone_);
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
    if (!(obj instanceof grpc.CA1.AutomatedSchedulingApp.TaskSpecifications)) {
      return super.equals(obj);
    }
    grpc.CA1.AutomatedSchedulingApp.TaskSpecifications other = (grpc.CA1.AutomatedSchedulingApp.TaskSpecifications) obj;

    boolean result = true;
    result = result && getProjectNumber()
        .equals(other.getProjectNumber());
    result = result && getTask()
        .equals(other.getTask());
    result = result && (
        java.lang.Float.floatToIntBits(getNumberHours())
        == java.lang.Float.floatToIntBits(
            other.getNumberHours()));
    result = result && (getDayMilestone()
        == other.getDayMilestone());
    result = result && (getMonthMilestone()
        == other.getMonthMilestone());
    result = result && (getYearMilestone()
        == other.getYearMilestone());
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
    hash = (37 * hash) + PROJECT_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getProjectNumber().hashCode();
    hash = (37 * hash) + TASK_FIELD_NUMBER;
    hash = (53 * hash) + getTask().hashCode();
    hash = (37 * hash) + NUMBER_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNumberHours());
    hash = (37 * hash) + DAY_MILESTONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDayMilestone());
    hash = (37 * hash) + MONTH_MILESTONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMonthMilestone());
    hash = (37 * hash) + YEAR_MILESTONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getYearMilestone());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parseFrom(
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
  public static Builder newBuilder(grpc.CA1.AutomatedSchedulingApp.TaskSpecifications prototype) {
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
   * Protobuf type {@code TaskSpecifications}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TaskSpecifications)
      grpc.CA1.AutomatedSchedulingApp.TaskSpecificationsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.CA1.AutomatedSchedulingApp.projectManagerSchedule.internal_static_TaskSpecifications_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.CA1.AutomatedSchedulingApp.projectManagerSchedule.internal_static_TaskSpecifications_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.class, grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.Builder.class);
    }

    // Construct using grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.newBuilder()
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
      projectNumber_ = "";

      task_ = "";

      numberHours_ = 0F;

      dayMilestone_ = 0L;

      monthMilestone_ = 0L;

      yearMilestone_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.CA1.AutomatedSchedulingApp.projectManagerSchedule.internal_static_TaskSpecifications_descriptor;
    }

    @java.lang.Override
    public grpc.CA1.AutomatedSchedulingApp.TaskSpecifications getDefaultInstanceForType() {
      return grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.CA1.AutomatedSchedulingApp.TaskSpecifications build() {
      grpc.CA1.AutomatedSchedulingApp.TaskSpecifications result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.CA1.AutomatedSchedulingApp.TaskSpecifications buildPartial() {
      grpc.CA1.AutomatedSchedulingApp.TaskSpecifications result = new grpc.CA1.AutomatedSchedulingApp.TaskSpecifications(this);
      result.projectNumber_ = projectNumber_;
      result.task_ = task_;
      result.numberHours_ = numberHours_;
      result.dayMilestone_ = dayMilestone_;
      result.monthMilestone_ = monthMilestone_;
      result.yearMilestone_ = yearMilestone_;
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
      if (other instanceof grpc.CA1.AutomatedSchedulingApp.TaskSpecifications) {
        return mergeFrom((grpc.CA1.AutomatedSchedulingApp.TaskSpecifications)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.CA1.AutomatedSchedulingApp.TaskSpecifications other) {
      if (other == grpc.CA1.AutomatedSchedulingApp.TaskSpecifications.getDefaultInstance()) return this;
      if (!other.getProjectNumber().isEmpty()) {
        projectNumber_ = other.projectNumber_;
        onChanged();
      }
      if (!other.getTask().isEmpty()) {
        task_ = other.task_;
        onChanged();
      }
      if (other.getNumberHours() != 0F) {
        setNumberHours(other.getNumberHours());
      }
      if (other.getDayMilestone() != 0L) {
        setDayMilestone(other.getDayMilestone());
      }
      if (other.getMonthMilestone() != 0L) {
        setMonthMilestone(other.getMonthMilestone());
      }
      if (other.getYearMilestone() != 0L) {
        setYearMilestone(other.getYearMilestone());
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
      grpc.CA1.AutomatedSchedulingApp.TaskSpecifications parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.CA1.AutomatedSchedulingApp.TaskSpecifications) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object projectNumber_ = "";
    /**
     * <code>string project_number = 1;</code>
     */
    public java.lang.String getProjectNumber() {
      java.lang.Object ref = projectNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string project_number = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProjectNumberBytes() {
      java.lang.Object ref = projectNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string project_number = 1;</code>
     */
    public Builder setProjectNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string project_number = 1;</code>
     */
    public Builder clearProjectNumber() {
      
      projectNumber_ = getDefaultInstance().getProjectNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string project_number = 1;</code>
     */
    public Builder setProjectNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object task_ = "";
    /**
     * <code>string task = 2;</code>
     */
    public java.lang.String getTask() {
      java.lang.Object ref = task_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        task_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string task = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTaskBytes() {
      java.lang.Object ref = task_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        task_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string task = 2;</code>
     */
    public Builder setTask(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      task_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string task = 2;</code>
     */
    public Builder clearTask() {
      
      task_ = getDefaultInstance().getTask();
      onChanged();
      return this;
    }
    /**
     * <code>string task = 2;</code>
     */
    public Builder setTaskBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      task_ = value;
      onChanged();
      return this;
    }

    private float numberHours_ ;
    /**
     * <code>float number_hours = 3;</code>
     */
    public float getNumberHours() {
      return numberHours_;
    }
    /**
     * <code>float number_hours = 3;</code>
     */
    public Builder setNumberHours(float value) {
      
      numberHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float number_hours = 3;</code>
     */
    public Builder clearNumberHours() {
      
      numberHours_ = 0F;
      onChanged();
      return this;
    }

    private long dayMilestone_ ;
    /**
     * <code>int64 day_milestone = 4;</code>
     */
    public long getDayMilestone() {
      return dayMilestone_;
    }
    /**
     * <code>int64 day_milestone = 4;</code>
     */
    public Builder setDayMilestone(long value) {
      
      dayMilestone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 day_milestone = 4;</code>
     */
    public Builder clearDayMilestone() {
      
      dayMilestone_ = 0L;
      onChanged();
      return this;
    }

    private long monthMilestone_ ;
    /**
     * <code>int64 month_milestone = 5;</code>
     */
    public long getMonthMilestone() {
      return monthMilestone_;
    }
    /**
     * <code>int64 month_milestone = 5;</code>
     */
    public Builder setMonthMilestone(long value) {
      
      monthMilestone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 month_milestone = 5;</code>
     */
    public Builder clearMonthMilestone() {
      
      monthMilestone_ = 0L;
      onChanged();
      return this;
    }

    private long yearMilestone_ ;
    /**
     * <code>int64 year_milestone = 6;</code>
     */
    public long getYearMilestone() {
      return yearMilestone_;
    }
    /**
     * <code>int64 year_milestone = 6;</code>
     */
    public Builder setYearMilestone(long value) {
      
      yearMilestone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 year_milestone = 6;</code>
     */
    public Builder clearYearMilestone() {
      
      yearMilestone_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:TaskSpecifications)
  }

  // @@protoc_insertion_point(class_scope:TaskSpecifications)
  private static final grpc.CA1.AutomatedSchedulingApp.TaskSpecifications DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.CA1.AutomatedSchedulingApp.TaskSpecifications();
  }

  public static grpc.CA1.AutomatedSchedulingApp.TaskSpecifications getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskSpecifications>
      PARSER = new com.google.protobuf.AbstractParser<TaskSpecifications>() {
    @java.lang.Override
    public TaskSpecifications parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskSpecifications(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskSpecifications> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskSpecifications> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.CA1.AutomatedSchedulingApp.TaskSpecifications getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

