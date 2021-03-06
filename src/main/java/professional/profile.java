// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProffessionaSchedule.proto

package professional;

/**
 * Protobuf type {@code profile}
 */
public  final class profile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:profile)
    profileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use profile.newBuilder() to construct.
  private profile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private profile() {
    cardNumber_ = 0;
    task_ = "";
    capProfMon_ = 0F;
    capProfTue_ = 0F;
    capProfWed_ = 0F;
    capProfThu_ = 0F;
    capProfFri_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private profile(
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

            cardNumber_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            task_ = s;
            break;
          }
          case 29: {

            capProfMon_ = input.readFloat();
            break;
          }
          case 37: {

            capProfTue_ = input.readFloat();
            break;
          }
          case 45: {

            capProfWed_ = input.readFloat();
            break;
          }
          case 53: {

            capProfThu_ = input.readFloat();
            break;
          }
          case 61: {

            capProfFri_ = input.readFloat();
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
    return professional.ProfessionalSchedule.internal_static_profile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return professional.ProfessionalSchedule.internal_static_profile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            professional.profile.class, professional.profile.Builder.class);
  }

  public static final int CARD_NUMBER_FIELD_NUMBER = 1;
  private int cardNumber_;
  /**
   * <pre>
   *it may be a good idea to add the email here
   * </pre>
   *
   * <code>int32 card_number = 1;</code>
   */
  public int getCardNumber() {
    return cardNumber_;
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

  public static final int CAP_PROF_MON_FIELD_NUMBER = 3;
  private float capProfMon_;
  /**
   * <code>float cap_prof_mon = 3;</code>
   */
  public float getCapProfMon() {
    return capProfMon_;
  }

  public static final int CAP_PROF_TUE_FIELD_NUMBER = 4;
  private float capProfTue_;
  /**
   * <code>float cap_prof_tue = 4;</code>
   */
  public float getCapProfTue() {
    return capProfTue_;
  }

  public static final int CAP_PROF_WED_FIELD_NUMBER = 5;
  private float capProfWed_;
  /**
   * <code>float cap_prof_wed = 5;</code>
   */
  public float getCapProfWed() {
    return capProfWed_;
  }

  public static final int CAP_PROF_THU_FIELD_NUMBER = 6;
  private float capProfThu_;
  /**
   * <code>float cap_prof_thu = 6;</code>
   */
  public float getCapProfThu() {
    return capProfThu_;
  }

  public static final int CAP_PROF_FRI_FIELD_NUMBER = 7;
  private float capProfFri_;
  /**
   * <code>float cap_prof_fri = 7;</code>
   */
  public float getCapProfFri() {
    return capProfFri_;
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
    if (cardNumber_ != 0) {
      output.writeInt32(1, cardNumber_);
    }
    if (!getTaskBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, task_);
    }
    if (capProfMon_ != 0F) {
      output.writeFloat(3, capProfMon_);
    }
    if (capProfTue_ != 0F) {
      output.writeFloat(4, capProfTue_);
    }
    if (capProfWed_ != 0F) {
      output.writeFloat(5, capProfWed_);
    }
    if (capProfThu_ != 0F) {
      output.writeFloat(6, capProfThu_);
    }
    if (capProfFri_ != 0F) {
      output.writeFloat(7, capProfFri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cardNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, cardNumber_);
    }
    if (!getTaskBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, task_);
    }
    if (capProfMon_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, capProfMon_);
    }
    if (capProfTue_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, capProfTue_);
    }
    if (capProfWed_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, capProfWed_);
    }
    if (capProfThu_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, capProfThu_);
    }
    if (capProfFri_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(7, capProfFri_);
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
    if (!(obj instanceof professional.profile)) {
      return super.equals(obj);
    }
    professional.profile other = (professional.profile) obj;

    boolean result = true;
    result = result && (getCardNumber()
        == other.getCardNumber());
    result = result && getTask()
        .equals(other.getTask());
    result = result && (
        java.lang.Float.floatToIntBits(getCapProfMon())
        == java.lang.Float.floatToIntBits(
            other.getCapProfMon()));
    result = result && (
        java.lang.Float.floatToIntBits(getCapProfTue())
        == java.lang.Float.floatToIntBits(
            other.getCapProfTue()));
    result = result && (
        java.lang.Float.floatToIntBits(getCapProfWed())
        == java.lang.Float.floatToIntBits(
            other.getCapProfWed()));
    result = result && (
        java.lang.Float.floatToIntBits(getCapProfThu())
        == java.lang.Float.floatToIntBits(
            other.getCapProfThu()));
    result = result && (
        java.lang.Float.floatToIntBits(getCapProfFri())
        == java.lang.Float.floatToIntBits(
            other.getCapProfFri()));
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
    hash = (37 * hash) + CARD_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getCardNumber();
    hash = (37 * hash) + TASK_FIELD_NUMBER;
    hash = (53 * hash) + getTask().hashCode();
    hash = (37 * hash) + CAP_PROF_MON_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCapProfMon());
    hash = (37 * hash) + CAP_PROF_TUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCapProfTue());
    hash = (37 * hash) + CAP_PROF_WED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCapProfWed());
    hash = (37 * hash) + CAP_PROF_THU_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCapProfThu());
    hash = (37 * hash) + CAP_PROF_FRI_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getCapProfFri());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static professional.profile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static professional.profile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static professional.profile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static professional.profile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static professional.profile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static professional.profile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static professional.profile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static professional.profile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static professional.profile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static professional.profile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static professional.profile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static professional.profile parseFrom(
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
  public static Builder newBuilder(professional.profile prototype) {
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
   * Protobuf type {@code profile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:profile)
      professional.profileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return professional.ProfessionalSchedule.internal_static_profile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return professional.ProfessionalSchedule.internal_static_profile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              professional.profile.class, professional.profile.Builder.class);
    }

    // Construct using professional.profile.newBuilder()
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
      cardNumber_ = 0;

      task_ = "";

      capProfMon_ = 0F;

      capProfTue_ = 0F;

      capProfWed_ = 0F;

      capProfThu_ = 0F;

      capProfFri_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return professional.ProfessionalSchedule.internal_static_profile_descriptor;
    }

    @java.lang.Override
    public professional.profile getDefaultInstanceForType() {
      return professional.profile.getDefaultInstance();
    }

    @java.lang.Override
    public professional.profile build() {
      professional.profile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public professional.profile buildPartial() {
      professional.profile result = new professional.profile(this);
      result.cardNumber_ = cardNumber_;
      result.task_ = task_;
      result.capProfMon_ = capProfMon_;
      result.capProfTue_ = capProfTue_;
      result.capProfWed_ = capProfWed_;
      result.capProfThu_ = capProfThu_;
      result.capProfFri_ = capProfFri_;
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
      if (other instanceof professional.profile) {
        return mergeFrom((professional.profile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(professional.profile other) {
      if (other == professional.profile.getDefaultInstance()) return this;
      if (other.getCardNumber() != 0) {
        setCardNumber(other.getCardNumber());
      }
      if (!other.getTask().isEmpty()) {
        task_ = other.task_;
        onChanged();
      }
      if (other.getCapProfMon() != 0F) {
        setCapProfMon(other.getCapProfMon());
      }
      if (other.getCapProfTue() != 0F) {
        setCapProfTue(other.getCapProfTue());
      }
      if (other.getCapProfWed() != 0F) {
        setCapProfWed(other.getCapProfWed());
      }
      if (other.getCapProfThu() != 0F) {
        setCapProfThu(other.getCapProfThu());
      }
      if (other.getCapProfFri() != 0F) {
        setCapProfFri(other.getCapProfFri());
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
      professional.profile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (professional.profile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int cardNumber_ ;
    /**
     * <pre>
     *it may be a good idea to add the email here
     * </pre>
     *
     * <code>int32 card_number = 1;</code>
     */
    public int getCardNumber() {
      return cardNumber_;
    }
    /**
     * <pre>
     *it may be a good idea to add the email here
     * </pre>
     *
     * <code>int32 card_number = 1;</code>
     */
    public Builder setCardNumber(int value) {
      
      cardNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *it may be a good idea to add the email here
     * </pre>
     *
     * <code>int32 card_number = 1;</code>
     */
    public Builder clearCardNumber() {
      
      cardNumber_ = 0;
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

    private float capProfMon_ ;
    /**
     * <code>float cap_prof_mon = 3;</code>
     */
    public float getCapProfMon() {
      return capProfMon_;
    }
    /**
     * <code>float cap_prof_mon = 3;</code>
     */
    public Builder setCapProfMon(float value) {
      
      capProfMon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cap_prof_mon = 3;</code>
     */
    public Builder clearCapProfMon() {
      
      capProfMon_ = 0F;
      onChanged();
      return this;
    }

    private float capProfTue_ ;
    /**
     * <code>float cap_prof_tue = 4;</code>
     */
    public float getCapProfTue() {
      return capProfTue_;
    }
    /**
     * <code>float cap_prof_tue = 4;</code>
     */
    public Builder setCapProfTue(float value) {
      
      capProfTue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cap_prof_tue = 4;</code>
     */
    public Builder clearCapProfTue() {
      
      capProfTue_ = 0F;
      onChanged();
      return this;
    }

    private float capProfWed_ ;
    /**
     * <code>float cap_prof_wed = 5;</code>
     */
    public float getCapProfWed() {
      return capProfWed_;
    }
    /**
     * <code>float cap_prof_wed = 5;</code>
     */
    public Builder setCapProfWed(float value) {
      
      capProfWed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cap_prof_wed = 5;</code>
     */
    public Builder clearCapProfWed() {
      
      capProfWed_ = 0F;
      onChanged();
      return this;
    }

    private float capProfThu_ ;
    /**
     * <code>float cap_prof_thu = 6;</code>
     */
    public float getCapProfThu() {
      return capProfThu_;
    }
    /**
     * <code>float cap_prof_thu = 6;</code>
     */
    public Builder setCapProfThu(float value) {
      
      capProfThu_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cap_prof_thu = 6;</code>
     */
    public Builder clearCapProfThu() {
      
      capProfThu_ = 0F;
      onChanged();
      return this;
    }

    private float capProfFri_ ;
    /**
     * <code>float cap_prof_fri = 7;</code>
     */
    public float getCapProfFri() {
      return capProfFri_;
    }
    /**
     * <code>float cap_prof_fri = 7;</code>
     */
    public Builder setCapProfFri(float value) {
      
      capProfFri_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float cap_prof_fri = 7;</code>
     */
    public Builder clearCapProfFri() {
      
      capProfFri_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:profile)
  }

  // @@protoc_insertion_point(class_scope:profile)
  private static final professional.profile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new professional.profile();
  }

  public static professional.profile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<profile>
      PARSER = new com.google.protobuf.AbstractParser<profile>() {
    @java.lang.Override
    public profile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new profile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<profile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<profile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public professional.profile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

