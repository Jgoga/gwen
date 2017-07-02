// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/assistant/embedded/v1alpha1/embedded_assistant.proto

package com.google.assistant.embedded.v1alpha1;

/**
 * <pre>
 * Specifies how to process the `ConverseRequest` messages.
 * </pre>
 *
 * Protobuf type {@code google.assistant.embedded.v1alpha1.ConverseConfig}
 */
public  final class ConverseConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.assistant.embedded.v1alpha1.ConverseConfig)
    ConverseConfigOrBuilder {
  // Use ConverseConfig.newBuilder() to construct.
  private ConverseConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConverseConfig() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ConverseConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder subBuilder = null;
            if (audioInConfig_ != null) {
              subBuilder = audioInConfig_.toBuilder();
            }
            audioInConfig_ = input.readMessage(com.google.assistant.embedded.v1alpha1.AudioInConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audioInConfig_);
              audioInConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.assistant.embedded.v1alpha1.AudioOutConfig.Builder subBuilder = null;
            if (audioOutConfig_ != null) {
              subBuilder = audioOutConfig_.toBuilder();
            }
            audioOutConfig_ = input.readMessage(com.google.assistant.embedded.v1alpha1.AudioOutConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(audioOutConfig_);
              audioOutConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.assistant.embedded.v1alpha1.ConverseState.Builder subBuilder = null;
            if (converseState_ != null) {
              subBuilder = converseState_.toBuilder();
            }
            converseState_ = input.readMessage(com.google.assistant.embedded.v1alpha1.ConverseState.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(converseState_);
              converseState_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.assistant.embedded.v1alpha1.ConverseConfig.class, com.google.assistant.embedded.v1alpha1.ConverseConfig.Builder.class);
  }

  public static final int AUDIO_IN_CONFIG_FIELD_NUMBER = 1;
  private com.google.assistant.embedded.v1alpha1.AudioInConfig audioInConfig_;
  /**
   * <pre>
   * *Required* Specifies how to process the subsequent incoming audio.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
   */
  public boolean hasAudioInConfig() {
    return audioInConfig_ != null;
  }
  /**
   * <pre>
   * *Required* Specifies how to process the subsequent incoming audio.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
   */
  public com.google.assistant.embedded.v1alpha1.AudioInConfig getAudioInConfig() {
    return audioInConfig_ == null ? com.google.assistant.embedded.v1alpha1.AudioInConfig.getDefaultInstance() : audioInConfig_;
  }
  /**
   * <pre>
   * *Required* Specifies how to process the subsequent incoming audio.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
   */
  public com.google.assistant.embedded.v1alpha1.AudioInConfigOrBuilder getAudioInConfigOrBuilder() {
    return getAudioInConfig();
  }

  public static final int AUDIO_OUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.assistant.embedded.v1alpha1.AudioOutConfig audioOutConfig_;
  /**
   * <pre>
   * *Required* Specifies how to format the audio that will be returned.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
   */
  public boolean hasAudioOutConfig() {
    return audioOutConfig_ != null;
  }
  /**
   * <pre>
   * *Required* Specifies how to format the audio that will be returned.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
   */
  public com.google.assistant.embedded.v1alpha1.AudioOutConfig getAudioOutConfig() {
    return audioOutConfig_ == null ? com.google.assistant.embedded.v1alpha1.AudioOutConfig.getDefaultInstance() : audioOutConfig_;
  }
  /**
   * <pre>
   * *Required* Specifies how to format the audio that will be returned.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
   */
  public com.google.assistant.embedded.v1alpha1.AudioOutConfigOrBuilder getAudioOutConfigOrBuilder() {
    return getAudioOutConfig();
  }

  public static final int CONVERSE_STATE_FIELD_NUMBER = 3;
  private com.google.assistant.embedded.v1alpha1.ConverseState converseState_;
  /**
   * <pre>
   * *Required* Represents the current dialog state.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
   */
  public boolean hasConverseState() {
    return converseState_ != null;
  }
  /**
   * <pre>
   * *Required* Represents the current dialog state.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
   */
  public com.google.assistant.embedded.v1alpha1.ConverseState getConverseState() {
    return converseState_ == null ? com.google.assistant.embedded.v1alpha1.ConverseState.getDefaultInstance() : converseState_;
  }
  /**
   * <pre>
   * *Required* Represents the current dialog state.
   * </pre>
   *
   * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
   */
  public com.google.assistant.embedded.v1alpha1.ConverseStateOrBuilder getConverseStateOrBuilder() {
    return getConverseState();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (audioInConfig_ != null) {
      output.writeMessage(1, getAudioInConfig());
    }
    if (audioOutConfig_ != null) {
      output.writeMessage(2, getAudioOutConfig());
    }
    if (converseState_ != null) {
      output.writeMessage(3, getConverseState());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (audioInConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAudioInConfig());
    }
    if (audioOutConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAudioOutConfig());
    }
    if (converseState_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getConverseState());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.assistant.embedded.v1alpha1.ConverseConfig)) {
      return super.equals(obj);
    }
    com.google.assistant.embedded.v1alpha1.ConverseConfig other = (com.google.assistant.embedded.v1alpha1.ConverseConfig) obj;

    boolean result = true;
    result = result && (hasAudioInConfig() == other.hasAudioInConfig());
    if (hasAudioInConfig()) {
      result = result && getAudioInConfig()
          .equals(other.getAudioInConfig());
    }
    result = result && (hasAudioOutConfig() == other.hasAudioOutConfig());
    if (hasAudioOutConfig()) {
      result = result && getAudioOutConfig()
          .equals(other.getAudioOutConfig());
    }
    result = result && (hasConverseState() == other.hasConverseState());
    if (hasConverseState()) {
      result = result && getConverseState()
          .equals(other.getConverseState());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAudioInConfig()) {
      hash = (37 * hash) + AUDIO_IN_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAudioInConfig().hashCode();
    }
    if (hasAudioOutConfig()) {
      hash = (37 * hash) + AUDIO_OUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAudioOutConfig().hashCode();
    }
    if (hasConverseState()) {
      hash = (37 * hash) + CONVERSE_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getConverseState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.assistant.embedded.v1alpha1.ConverseConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.assistant.embedded.v1alpha1.ConverseConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Specifies how to process the `ConverseRequest` messages.
   * </pre>
   *
   * Protobuf type {@code google.assistant.embedded.v1alpha1.ConverseConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.assistant.embedded.v1alpha1.ConverseConfig)
      com.google.assistant.embedded.v1alpha1.ConverseConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.assistant.embedded.v1alpha1.ConverseConfig.class, com.google.assistant.embedded.v1alpha1.ConverseConfig.Builder.class);
    }

    // Construct using com.google.assistant.embedded.v1alpha1.ConverseConfig.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (audioInConfigBuilder_ == null) {
        audioInConfig_ = null;
      } else {
        audioInConfig_ = null;
        audioInConfigBuilder_ = null;
      }
      if (audioOutConfigBuilder_ == null) {
        audioOutConfig_ = null;
      } else {
        audioOutConfig_ = null;
        audioOutConfigBuilder_ = null;
      }
      if (converseStateBuilder_ == null) {
        converseState_ = null;
      } else {
        converseState_ = null;
        converseStateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.assistant.embedded.v1alpha1.AssistantProto.internal_static_google_assistant_embedded_v1alpha1_ConverseConfig_descriptor;
    }

    public com.google.assistant.embedded.v1alpha1.ConverseConfig getDefaultInstanceForType() {
      return com.google.assistant.embedded.v1alpha1.ConverseConfig.getDefaultInstance();
    }

    public com.google.assistant.embedded.v1alpha1.ConverseConfig build() {
      com.google.assistant.embedded.v1alpha1.ConverseConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.assistant.embedded.v1alpha1.ConverseConfig buildPartial() {
      com.google.assistant.embedded.v1alpha1.ConverseConfig result = new com.google.assistant.embedded.v1alpha1.ConverseConfig(this);
      if (audioInConfigBuilder_ == null) {
        result.audioInConfig_ = audioInConfig_;
      } else {
        result.audioInConfig_ = audioInConfigBuilder_.build();
      }
      if (audioOutConfigBuilder_ == null) {
        result.audioOutConfig_ = audioOutConfig_;
      } else {
        result.audioOutConfig_ = audioOutConfigBuilder_.build();
      }
      if (converseStateBuilder_ == null) {
        result.converseState_ = converseState_;
      } else {
        result.converseState_ = converseStateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.assistant.embedded.v1alpha1.ConverseConfig) {
        return mergeFrom((com.google.assistant.embedded.v1alpha1.ConverseConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.assistant.embedded.v1alpha1.ConverseConfig other) {
      if (other == com.google.assistant.embedded.v1alpha1.ConverseConfig.getDefaultInstance()) return this;
      if (other.hasAudioInConfig()) {
        mergeAudioInConfig(other.getAudioInConfig());
      }
      if (other.hasAudioOutConfig()) {
        mergeAudioOutConfig(other.getAudioOutConfig());
      }
      if (other.hasConverseState()) {
        mergeConverseState(other.getConverseState());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.assistant.embedded.v1alpha1.ConverseConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.assistant.embedded.v1alpha1.ConverseConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.assistant.embedded.v1alpha1.AudioInConfig audioInConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.assistant.embedded.v1alpha1.AudioInConfig, com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder, com.google.assistant.embedded.v1alpha1.AudioInConfigOrBuilder> audioInConfigBuilder_;
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public boolean hasAudioInConfig() {
      return audioInConfigBuilder_ != null || audioInConfig_ != null;
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public com.google.assistant.embedded.v1alpha1.AudioInConfig getAudioInConfig() {
      if (audioInConfigBuilder_ == null) {
        return audioInConfig_ == null ? com.google.assistant.embedded.v1alpha1.AudioInConfig.getDefaultInstance() : audioInConfig_;
      } else {
        return audioInConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public Builder setAudioInConfig(com.google.assistant.embedded.v1alpha1.AudioInConfig value) {
      if (audioInConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioInConfig_ = value;
        onChanged();
      } else {
        audioInConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public Builder setAudioInConfig(
        com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder builderForValue) {
      if (audioInConfigBuilder_ == null) {
        audioInConfig_ = builderForValue.build();
        onChanged();
      } else {
        audioInConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public Builder mergeAudioInConfig(com.google.assistant.embedded.v1alpha1.AudioInConfig value) {
      if (audioInConfigBuilder_ == null) {
        if (audioInConfig_ != null) {
          audioInConfig_ =
            com.google.assistant.embedded.v1alpha1.AudioInConfig.newBuilder(audioInConfig_).mergeFrom(value).buildPartial();
        } else {
          audioInConfig_ = value;
        }
        onChanged();
      } else {
        audioInConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public Builder clearAudioInConfig() {
      if (audioInConfigBuilder_ == null) {
        audioInConfig_ = null;
        onChanged();
      } else {
        audioInConfig_ = null;
        audioInConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder getAudioInConfigBuilder() {
      
      onChanged();
      return getAudioInConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    public com.google.assistant.embedded.v1alpha1.AudioInConfigOrBuilder getAudioInConfigOrBuilder() {
      if (audioInConfigBuilder_ != null) {
        return audioInConfigBuilder_.getMessageOrBuilder();
      } else {
        return audioInConfig_ == null ?
            com.google.assistant.embedded.v1alpha1.AudioInConfig.getDefaultInstance() : audioInConfig_;
      }
    }
    /**
     * <pre>
     * *Required* Specifies how to process the subsequent incoming audio.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioInConfig audio_in_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.assistant.embedded.v1alpha1.AudioInConfig, com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder, com.google.assistant.embedded.v1alpha1.AudioInConfigOrBuilder> 
        getAudioInConfigFieldBuilder() {
      if (audioInConfigBuilder_ == null) {
        audioInConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.assistant.embedded.v1alpha1.AudioInConfig, com.google.assistant.embedded.v1alpha1.AudioInConfig.Builder, com.google.assistant.embedded.v1alpha1.AudioInConfigOrBuilder>(
                getAudioInConfig(),
                getParentForChildren(),
                isClean());
        audioInConfig_ = null;
      }
      return audioInConfigBuilder_;
    }

    private com.google.assistant.embedded.v1alpha1.AudioOutConfig audioOutConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.assistant.embedded.v1alpha1.AudioOutConfig, com.google.assistant.embedded.v1alpha1.AudioOutConfig.Builder, com.google.assistant.embedded.v1alpha1.AudioOutConfigOrBuilder> audioOutConfigBuilder_;
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public boolean hasAudioOutConfig() {
      return audioOutConfigBuilder_ != null || audioOutConfig_ != null;
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public com.google.assistant.embedded.v1alpha1.AudioOutConfig getAudioOutConfig() {
      if (audioOutConfigBuilder_ == null) {
        return audioOutConfig_ == null ? com.google.assistant.embedded.v1alpha1.AudioOutConfig.getDefaultInstance() : audioOutConfig_;
      } else {
        return audioOutConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public Builder setAudioOutConfig(com.google.assistant.embedded.v1alpha1.AudioOutConfig value) {
      if (audioOutConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audioOutConfig_ = value;
        onChanged();
      } else {
        audioOutConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public Builder setAudioOutConfig(
        com.google.assistant.embedded.v1alpha1.AudioOutConfig.Builder builderForValue) {
      if (audioOutConfigBuilder_ == null) {
        audioOutConfig_ = builderForValue.build();
        onChanged();
      } else {
        audioOutConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public Builder mergeAudioOutConfig(com.google.assistant.embedded.v1alpha1.AudioOutConfig value) {
      if (audioOutConfigBuilder_ == null) {
        if (audioOutConfig_ != null) {
          audioOutConfig_ =
            com.google.assistant.embedded.v1alpha1.AudioOutConfig.newBuilder(audioOutConfig_).mergeFrom(value).buildPartial();
        } else {
          audioOutConfig_ = value;
        }
        onChanged();
      } else {
        audioOutConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public Builder clearAudioOutConfig() {
      if (audioOutConfigBuilder_ == null) {
        audioOutConfig_ = null;
        onChanged();
      } else {
        audioOutConfig_ = null;
        audioOutConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public com.google.assistant.embedded.v1alpha1.AudioOutConfig.Builder getAudioOutConfigBuilder() {
      
      onChanged();
      return getAudioOutConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    public com.google.assistant.embedded.v1alpha1.AudioOutConfigOrBuilder getAudioOutConfigOrBuilder() {
      if (audioOutConfigBuilder_ != null) {
        return audioOutConfigBuilder_.getMessageOrBuilder();
      } else {
        return audioOutConfig_ == null ?
            com.google.assistant.embedded.v1alpha1.AudioOutConfig.getDefaultInstance() : audioOutConfig_;
      }
    }
    /**
     * <pre>
     * *Required* Specifies how to format the audio that will be returned.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.AudioOutConfig audio_out_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.assistant.embedded.v1alpha1.AudioOutConfig, com.google.assistant.embedded.v1alpha1.AudioOutConfig.Builder, com.google.assistant.embedded.v1alpha1.AudioOutConfigOrBuilder> 
        getAudioOutConfigFieldBuilder() {
      if (audioOutConfigBuilder_ == null) {
        audioOutConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.assistant.embedded.v1alpha1.AudioOutConfig, com.google.assistant.embedded.v1alpha1.AudioOutConfig.Builder, com.google.assistant.embedded.v1alpha1.AudioOutConfigOrBuilder>(
                getAudioOutConfig(),
                getParentForChildren(),
                isClean());
        audioOutConfig_ = null;
      }
      return audioOutConfigBuilder_;
    }

    private com.google.assistant.embedded.v1alpha1.ConverseState converseState_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.assistant.embedded.v1alpha1.ConverseState, com.google.assistant.embedded.v1alpha1.ConverseState.Builder, com.google.assistant.embedded.v1alpha1.ConverseStateOrBuilder> converseStateBuilder_;
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public boolean hasConverseState() {
      return converseStateBuilder_ != null || converseState_ != null;
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public com.google.assistant.embedded.v1alpha1.ConverseState getConverseState() {
      if (converseStateBuilder_ == null) {
        return converseState_ == null ? com.google.assistant.embedded.v1alpha1.ConverseState.getDefaultInstance() : converseState_;
      } else {
        return converseStateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public Builder setConverseState(com.google.assistant.embedded.v1alpha1.ConverseState value) {
      if (converseStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        converseState_ = value;
        onChanged();
      } else {
        converseStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public Builder setConverseState(
        com.google.assistant.embedded.v1alpha1.ConverseState.Builder builderForValue) {
      if (converseStateBuilder_ == null) {
        converseState_ = builderForValue.build();
        onChanged();
      } else {
        converseStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public Builder mergeConverseState(com.google.assistant.embedded.v1alpha1.ConverseState value) {
      if (converseStateBuilder_ == null) {
        if (converseState_ != null) {
          converseState_ =
            com.google.assistant.embedded.v1alpha1.ConverseState.newBuilder(converseState_).mergeFrom(value).buildPartial();
        } else {
          converseState_ = value;
        }
        onChanged();
      } else {
        converseStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public Builder clearConverseState() {
      if (converseStateBuilder_ == null) {
        converseState_ = null;
        onChanged();
      } else {
        converseState_ = null;
        converseStateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public com.google.assistant.embedded.v1alpha1.ConverseState.Builder getConverseStateBuilder() {
      
      onChanged();
      return getConverseStateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    public com.google.assistant.embedded.v1alpha1.ConverseStateOrBuilder getConverseStateOrBuilder() {
      if (converseStateBuilder_ != null) {
        return converseStateBuilder_.getMessageOrBuilder();
      } else {
        return converseState_ == null ?
            com.google.assistant.embedded.v1alpha1.ConverseState.getDefaultInstance() : converseState_;
      }
    }
    /**
     * <pre>
     * *Required* Represents the current dialog state.
     * </pre>
     *
     * <code>.google.assistant.embedded.v1alpha1.ConverseState converse_state = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.assistant.embedded.v1alpha1.ConverseState, com.google.assistant.embedded.v1alpha1.ConverseState.Builder, com.google.assistant.embedded.v1alpha1.ConverseStateOrBuilder> 
        getConverseStateFieldBuilder() {
      if (converseStateBuilder_ == null) {
        converseStateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.assistant.embedded.v1alpha1.ConverseState, com.google.assistant.embedded.v1alpha1.ConverseState.Builder, com.google.assistant.embedded.v1alpha1.ConverseStateOrBuilder>(
                getConverseState(),
                getParentForChildren(),
                isClean());
        converseState_ = null;
      }
      return converseStateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.assistant.embedded.v1alpha1.ConverseConfig)
  }

  // @@protoc_insertion_point(class_scope:google.assistant.embedded.v1alpha1.ConverseConfig)
  private static final com.google.assistant.embedded.v1alpha1.ConverseConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.assistant.embedded.v1alpha1.ConverseConfig();
  }

  public static com.google.assistant.embedded.v1alpha1.ConverseConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConverseConfig>
      PARSER = new com.google.protobuf.AbstractParser<ConverseConfig>() {
    public ConverseConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ConverseConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConverseConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConverseConfig> getParserForType() {
    return PARSER;
  }

  public com.google.assistant.embedded.v1alpha1.ConverseConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

