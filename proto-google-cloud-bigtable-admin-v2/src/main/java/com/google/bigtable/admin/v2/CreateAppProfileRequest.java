// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

/**
 * <pre>
 * Request message for BigtableInstanceAdmin.CreateAppProfile.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.CreateAppProfileRequest}
 */
public  final class CreateAppProfileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.CreateAppProfileRequest)
    CreateAppProfileRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAppProfileRequest.newBuilder() to construct.
  private CreateAppProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAppProfileRequest() {
    parent_ = "";
    appProfileId_ = "";
    ignoreWarnings_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateAppProfileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            appProfileId_ = s;
            break;
          }
          case 26: {
            com.google.bigtable.admin.v2.AppProfile.Builder subBuilder = null;
            if (appProfile_ != null) {
              subBuilder = appProfile_.toBuilder();
            }
            appProfile_ = input.readMessage(com.google.bigtable.admin.v2.AppProfile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(appProfile_);
              appProfile_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            ignoreWarnings_ = input.readBool();
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
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateAppProfileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateAppProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.CreateAppProfileRequest.class, com.google.bigtable.admin.v2.CreateAppProfileRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The unique name of the instance in which to create the new app profile.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique name of the instance in which to create the new app profile.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_PROFILE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object appProfileId_;
  /**
   * <pre>
   * The ID to be used when referring to the new app profile within its
   * instance, e.g., just `myprofile` rather than
   * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
   * </pre>
   *
   * <code>string app_profile_id = 2;</code>
   */
  public java.lang.String getAppProfileId() {
    java.lang.Object ref = appProfileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appProfileId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID to be used when referring to the new app profile within its
   * instance, e.g., just `myprofile` rather than
   * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
   * </pre>
   *
   * <code>string app_profile_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAppProfileIdBytes() {
    java.lang.Object ref = appProfileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appProfileId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_PROFILE_FIELD_NUMBER = 3;
  private com.google.bigtable.admin.v2.AppProfile appProfile_;
  /**
   * <pre>
   * The app profile to be created.
   * Fields marked `OutputOnly` will be ignored.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
   */
  public boolean hasAppProfile() {
    return appProfile_ != null;
  }
  /**
   * <pre>
   * The app profile to be created.
   * Fields marked `OutputOnly` will be ignored.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
   */
  public com.google.bigtable.admin.v2.AppProfile getAppProfile() {
    return appProfile_ == null ? com.google.bigtable.admin.v2.AppProfile.getDefaultInstance() : appProfile_;
  }
  /**
   * <pre>
   * The app profile to be created.
   * Fields marked `OutputOnly` will be ignored.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
   */
  public com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfileOrBuilder() {
    return getAppProfile();
  }

  public static final int IGNORE_WARNINGS_FIELD_NUMBER = 4;
  private boolean ignoreWarnings_;
  /**
   * <pre>
   * If true, ignore safety checks when creating the app profile.
   * </pre>
   *
   * <code>bool ignore_warnings = 4;</code>
   */
  public boolean getIgnoreWarnings() {
    return ignoreWarnings_;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getAppProfileIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, appProfileId_);
    }
    if (appProfile_ != null) {
      output.writeMessage(3, getAppProfile());
    }
    if (ignoreWarnings_ != false) {
      output.writeBool(4, ignoreWarnings_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getAppProfileIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, appProfileId_);
    }
    if (appProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAppProfile());
    }
    if (ignoreWarnings_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, ignoreWarnings_);
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
    if (!(obj instanceof com.google.bigtable.admin.v2.CreateAppProfileRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.CreateAppProfileRequest other = (com.google.bigtable.admin.v2.CreateAppProfileRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && getAppProfileId()
        .equals(other.getAppProfileId());
    result = result && (hasAppProfile() == other.hasAppProfile());
    if (hasAppProfile()) {
      result = result && getAppProfile()
          .equals(other.getAppProfile());
    }
    result = result && (getIgnoreWarnings()
        == other.getIgnoreWarnings());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + APP_PROFILE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAppProfileId().hashCode();
    if (hasAppProfile()) {
      hash = (37 * hash) + APP_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getAppProfile().hashCode();
    }
    hash = (37 * hash) + IGNORE_WARNINGS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreWarnings());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateAppProfileRequest parseFrom(
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
  public static Builder newBuilder(com.google.bigtable.admin.v2.CreateAppProfileRequest prototype) {
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
   * Request message for BigtableInstanceAdmin.CreateAppProfile.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.CreateAppProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.CreateAppProfileRequest)
      com.google.bigtable.admin.v2.CreateAppProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateAppProfileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateAppProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.CreateAppProfileRequest.class, com.google.bigtable.admin.v2.CreateAppProfileRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.CreateAppProfileRequest.newBuilder()
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
      parent_ = "";

      appProfileId_ = "";

      if (appProfileBuilder_ == null) {
        appProfile_ = null;
      } else {
        appProfile_ = null;
        appProfileBuilder_ = null;
      }
      ignoreWarnings_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateAppProfileRequest_descriptor;
    }

    public com.google.bigtable.admin.v2.CreateAppProfileRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.CreateAppProfileRequest.getDefaultInstance();
    }

    public com.google.bigtable.admin.v2.CreateAppProfileRequest build() {
      com.google.bigtable.admin.v2.CreateAppProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.bigtable.admin.v2.CreateAppProfileRequest buildPartial() {
      com.google.bigtable.admin.v2.CreateAppProfileRequest result = new com.google.bigtable.admin.v2.CreateAppProfileRequest(this);
      result.parent_ = parent_;
      result.appProfileId_ = appProfileId_;
      if (appProfileBuilder_ == null) {
        result.appProfile_ = appProfile_;
      } else {
        result.appProfile_ = appProfileBuilder_.build();
      }
      result.ignoreWarnings_ = ignoreWarnings_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.CreateAppProfileRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.CreateAppProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.CreateAppProfileRequest other) {
      if (other == com.google.bigtable.admin.v2.CreateAppProfileRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getAppProfileId().isEmpty()) {
        appProfileId_ = other.appProfileId_;
        onChanged();
      }
      if (other.hasAppProfile()) {
        mergeAppProfile(other.getAppProfile());
      }
      if (other.getIgnoreWarnings() != false) {
        setIgnoreWarnings(other.getIgnoreWarnings());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.bigtable.admin.v2.CreateAppProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.CreateAppProfileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The unique name of the instance in which to create the new app profile.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new app profile.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new app profile.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new app profile.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new app profile.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object appProfileId_ = "";
    /**
     * <pre>
     * The ID to be used when referring to the new app profile within its
     * instance, e.g., just `myprofile` rather than
     * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
     * </pre>
     *
     * <code>string app_profile_id = 2;</code>
     */
    public java.lang.String getAppProfileId() {
      java.lang.Object ref = appProfileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appProfileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID to be used when referring to the new app profile within its
     * instance, e.g., just `myprofile` rather than
     * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
     * </pre>
     *
     * <code>string app_profile_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppProfileIdBytes() {
      java.lang.Object ref = appProfileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appProfileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID to be used when referring to the new app profile within its
     * instance, e.g., just `myprofile` rather than
     * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
     * </pre>
     *
     * <code>string app_profile_id = 2;</code>
     */
    public Builder setAppProfileId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appProfileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to be used when referring to the new app profile within its
     * instance, e.g., just `myprofile` rather than
     * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
     * </pre>
     *
     * <code>string app_profile_id = 2;</code>
     */
    public Builder clearAppProfileId() {
      
      appProfileId_ = getDefaultInstance().getAppProfileId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to be used when referring to the new app profile within its
     * instance, e.g., just `myprofile` rather than
     * `projects/myproject/instances/myinstance/appProfiles/myprofile`.
     * </pre>
     *
     * <code>string app_profile_id = 2;</code>
     */
    public Builder setAppProfileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appProfileId_ = value;
      onChanged();
      return this;
    }

    private com.google.bigtable.admin.v2.AppProfile appProfile_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.admin.v2.AppProfile, com.google.bigtable.admin.v2.AppProfile.Builder, com.google.bigtable.admin.v2.AppProfileOrBuilder> appProfileBuilder_;
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public boolean hasAppProfile() {
      return appProfileBuilder_ != null || appProfile_ != null;
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public com.google.bigtable.admin.v2.AppProfile getAppProfile() {
      if (appProfileBuilder_ == null) {
        return appProfile_ == null ? com.google.bigtable.admin.v2.AppProfile.getDefaultInstance() : appProfile_;
      } else {
        return appProfileBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public Builder setAppProfile(com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appProfile_ = value;
        onChanged();
      } else {
        appProfileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public Builder setAppProfile(
        com.google.bigtable.admin.v2.AppProfile.Builder builderForValue) {
      if (appProfileBuilder_ == null) {
        appProfile_ = builderForValue.build();
        onChanged();
      } else {
        appProfileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public Builder mergeAppProfile(com.google.bigtable.admin.v2.AppProfile value) {
      if (appProfileBuilder_ == null) {
        if (appProfile_ != null) {
          appProfile_ =
            com.google.bigtable.admin.v2.AppProfile.newBuilder(appProfile_).mergeFrom(value).buildPartial();
        } else {
          appProfile_ = value;
        }
        onChanged();
      } else {
        appProfileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public Builder clearAppProfile() {
      if (appProfileBuilder_ == null) {
        appProfile_ = null;
        onChanged();
      } else {
        appProfile_ = null;
        appProfileBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public com.google.bigtable.admin.v2.AppProfile.Builder getAppProfileBuilder() {
      
      onChanged();
      return getAppProfileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    public com.google.bigtable.admin.v2.AppProfileOrBuilder getAppProfileOrBuilder() {
      if (appProfileBuilder_ != null) {
        return appProfileBuilder_.getMessageOrBuilder();
      } else {
        return appProfile_ == null ?
            com.google.bigtable.admin.v2.AppProfile.getDefaultInstance() : appProfile_;
      }
    }
    /**
     * <pre>
     * The app profile to be created.
     * Fields marked `OutputOnly` will be ignored.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.AppProfile app_profile = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.admin.v2.AppProfile, com.google.bigtable.admin.v2.AppProfile.Builder, com.google.bigtable.admin.v2.AppProfileOrBuilder> 
        getAppProfileFieldBuilder() {
      if (appProfileBuilder_ == null) {
        appProfileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.AppProfile, com.google.bigtable.admin.v2.AppProfile.Builder, com.google.bigtable.admin.v2.AppProfileOrBuilder>(
                getAppProfile(),
                getParentForChildren(),
                isClean());
        appProfile_ = null;
      }
      return appProfileBuilder_;
    }

    private boolean ignoreWarnings_ ;
    /**
     * <pre>
     * If true, ignore safety checks when creating the app profile.
     * </pre>
     *
     * <code>bool ignore_warnings = 4;</code>
     */
    public boolean getIgnoreWarnings() {
      return ignoreWarnings_;
    }
    /**
     * <pre>
     * If true, ignore safety checks when creating the app profile.
     * </pre>
     *
     * <code>bool ignore_warnings = 4;</code>
     */
    public Builder setIgnoreWarnings(boolean value) {
      
      ignoreWarnings_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, ignore safety checks when creating the app profile.
     * </pre>
     *
     * <code>bool ignore_warnings = 4;</code>
     */
    public Builder clearIgnoreWarnings() {
      
      ignoreWarnings_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.CreateAppProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.CreateAppProfileRequest)
  private static final com.google.bigtable.admin.v2.CreateAppProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.CreateAppProfileRequest();
  }

  public static com.google.bigtable.admin.v2.CreateAppProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAppProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAppProfileRequest>() {
    public CreateAppProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateAppProfileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateAppProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAppProfileRequest> getParserForType() {
    return PARSER;
  }

  public com.google.bigtable.admin.v2.CreateAppProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

