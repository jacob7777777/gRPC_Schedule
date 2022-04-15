// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProjectManagerSchedule.proto

package ProjectManager;

/**
 * Protobuf type {@code TaskMatch}
 */
public  final class TaskMatch extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TaskMatch)
    TaskMatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TaskMatch.newBuilder() to construct.
  private TaskMatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TaskMatch() {
    date_ = 0L;
    numberOfHours_ = 0F;
    cardNumber_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TaskMatch(
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
          case 8: {

            date_ = input.readInt64();
            break;
          }
          case 21: {

            numberOfHours_ = input.readFloat();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            cardNumber_ = s;
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
    return ProjectManager.projectManagerSchedule.internal_static_TaskMatch_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ProjectManager.projectManagerSchedule.internal_static_TaskMatch_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ProjectManager.TaskMatch.class, ProjectManager.TaskMatch.Builder.class);
  }

  public static final int DATE_FIELD_NUMBER = 1;
  private long date_;
  /**
   * <code>int64 date = 1;</code>
   */
  public long getDate() {
    return date_;
  }

  public static final int NUMBER_OF_HOURS_FIELD_NUMBER = 2;
  private float numberOfHours_;
  /**
   * <code>float number_of_hours = 2;</code>
   */
  public float getNumberOfHours() {
    return numberOfHours_;
  }

  public static final int CARD_NUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object cardNumber_;
  /**
   * <code>string card_number = 3;</code>
   */
  public java.lang.String getCardNumber() {
    java.lang.Object ref = cardNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cardNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string card_number = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCardNumberBytes() {
    java.lang.Object ref = cardNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cardNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (date_ != 0L) {
      output.writeInt64(1, date_);
    }
    if (numberOfHours_ != 0F) {
      output.writeFloat(2, numberOfHours_);
    }
    if (!getCardNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, cardNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (date_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, date_);
    }
    if (numberOfHours_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, numberOfHours_);
    }
    if (!getCardNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, cardNumber_);
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
    if (!(obj instanceof ProjectManager.TaskMatch)) {
      return super.equals(obj);
    }
    ProjectManager.TaskMatch other = (ProjectManager.TaskMatch) obj;

    boolean result = true;
    result = result && (getDate()
        == other.getDate());
    result = result && (
        java.lang.Float.floatToIntBits(getNumberOfHours())
        == java.lang.Float.floatToIntBits(
            other.getNumberOfHours()));
    result = result && getCardNumber()
        .equals(other.getCardNumber());
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
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDate());
    hash = (37 * hash) + NUMBER_OF_HOURS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getNumberOfHours());
    hash = (37 * hash) + CARD_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getCardNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ProjectManager.TaskMatch parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProjectManager.TaskMatch parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProjectManager.TaskMatch parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProjectManager.TaskMatch parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProjectManager.TaskMatch parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProjectManager.TaskMatch parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProjectManager.TaskMatch parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProjectManager.TaskMatch parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProjectManager.TaskMatch parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ProjectManager.TaskMatch parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProjectManager.TaskMatch parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProjectManager.TaskMatch parseFrom(
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
  public static Builder newBuilder(ProjectManager.TaskMatch prototype) {
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
   * Protobuf type {@code TaskMatch}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TaskMatch)
      ProjectManager.TaskMatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProjectManager.projectManagerSchedule.internal_static_TaskMatch_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProjectManager.projectManagerSchedule.internal_static_TaskMatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProjectManager.TaskMatch.class, ProjectManager.TaskMatch.Builder.class);
    }

    // Construct using ProjectManager.TaskMatch.newBuilder()
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
      date_ = 0L;

      numberOfHours_ = 0F;

      cardNumber_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ProjectManager.projectManagerSchedule.internal_static_TaskMatch_descriptor;
    }

    @java.lang.Override
    public ProjectManager.TaskMatch getDefaultInstanceForType() {
      return ProjectManager.TaskMatch.getDefaultInstance();
    }

    @java.lang.Override
    public ProjectManager.TaskMatch build() {
      ProjectManager.TaskMatch result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ProjectManager.TaskMatch buildPartial() {
      ProjectManager.TaskMatch result = new ProjectManager.TaskMatch(this);
      result.date_ = date_;
      result.numberOfHours_ = numberOfHours_;
      result.cardNumber_ = cardNumber_;
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
      if (other instanceof ProjectManager.TaskMatch) {
        return mergeFrom((ProjectManager.TaskMatch)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ProjectManager.TaskMatch other) {
      if (other == ProjectManager.TaskMatch.getDefaultInstance()) return this;
      if (other.getDate() != 0L) {
        setDate(other.getDate());
      }
      if (other.getNumberOfHours() != 0F) {
        setNumberOfHours(other.getNumberOfHours());
      }
      if (!other.getCardNumber().isEmpty()) {
        cardNumber_ = other.cardNumber_;
        onChanged();
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
      ProjectManager.TaskMatch parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ProjectManager.TaskMatch) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long date_ ;
    /**
     * <code>int64 date = 1;</code>
     */
    public long getDate() {
      return date_;
    }
    /**
     * <code>int64 date = 1;</code>
     */
    public Builder setDate(long value) {
      
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 date = 1;</code>
     */
    public Builder clearDate() {
      
      date_ = 0L;
      onChanged();
      return this;
    }

    private float numberOfHours_ ;
    /**
     * <code>float number_of_hours = 2;</code>
     */
    public float getNumberOfHours() {
      return numberOfHours_;
    }
    /**
     * <code>float number_of_hours = 2;</code>
     */
    public Builder setNumberOfHours(float value) {
      
      numberOfHours_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float number_of_hours = 2;</code>
     */
    public Builder clearNumberOfHours() {
      
      numberOfHours_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object cardNumber_ = "";
    /**
     * <code>string card_number = 3;</code>
     */
    public java.lang.String getCardNumber() {
      java.lang.Object ref = cardNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cardNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string card_number = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCardNumberBytes() {
      java.lang.Object ref = cardNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cardNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string card_number = 3;</code>
     */
    public Builder setCardNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cardNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string card_number = 3;</code>
     */
    public Builder clearCardNumber() {
      
      cardNumber_ = getDefaultInstance().getCardNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string card_number = 3;</code>
     */
    public Builder setCardNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cardNumber_ = value;
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


    // @@protoc_insertion_point(builder_scope:TaskMatch)
  }

  // @@protoc_insertion_point(class_scope:TaskMatch)
  private static final ProjectManager.TaskMatch DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ProjectManager.TaskMatch();
  }

  public static ProjectManager.TaskMatch getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TaskMatch>
      PARSER = new com.google.protobuf.AbstractParser<TaskMatch>() {
    @java.lang.Override
    public TaskMatch parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TaskMatch(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TaskMatch> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TaskMatch> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ProjectManager.TaskMatch getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

