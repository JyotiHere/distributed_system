// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: warehouseControl.proto

package warehouse_CA.warehouseControl;

/**
 * Protobuf type {@code service1.TempRequest}
 */
public  final class TempRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service1.TempRequest)
    TempRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TempRequest.newBuilder() to construct.
  private TempRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TempRequest() {
    currentTemperature_ = "";
    roomId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TempRequest(
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

            currentTemperature_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            roomId_ = s;
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
    return warehouse_CA.warehouseControl.warehouseControlImpl.internal_static_service1_TempRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return warehouse_CA.warehouseControl.warehouseControlImpl.internal_static_service1_TempRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            warehouse_CA.warehouseControl.TempRequest.class, warehouse_CA.warehouseControl.TempRequest.Builder.class);
  }

  public static final int CURRENTTEMPERATURE_FIELD_NUMBER = 1;
  private volatile java.lang.Object currentTemperature_;
  /**
   * <code>string currentTemperature = 1;</code>
   */
  public java.lang.String getCurrentTemperature() {
    java.lang.Object ref = currentTemperature_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      currentTemperature_ = s;
      return s;
    }
  }
  /**
   * <code>string currentTemperature = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCurrentTemperatureBytes() {
    java.lang.Object ref = currentTemperature_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      currentTemperature_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROOMID_FIELD_NUMBER = 2;
  private volatile java.lang.Object roomId_;
  /**
   * <code>string roomId = 2;</code>
   */
  public java.lang.String getRoomId() {
    java.lang.Object ref = roomId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roomId_ = s;
      return s;
    }
  }
  /**
   * <code>string roomId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRoomIdBytes() {
    java.lang.Object ref = roomId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roomId_ = b;
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
    if (!getCurrentTemperatureBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currentTemperature_);
    }
    if (!getRoomIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roomId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCurrentTemperatureBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, currentTemperature_);
    }
    if (!getRoomIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roomId_);
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
    if (!(obj instanceof warehouse_CA.warehouseControl.TempRequest)) {
      return super.equals(obj);
    }
    warehouse_CA.warehouseControl.TempRequest other = (warehouse_CA.warehouseControl.TempRequest) obj;

    boolean result = true;
    result = result && getCurrentTemperature()
        .equals(other.getCurrentTemperature());
    result = result && getRoomId()
        .equals(other.getRoomId());
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
    hash = (37 * hash) + CURRENTTEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentTemperature().hashCode();
    hash = (37 * hash) + ROOMID_FIELD_NUMBER;
    hash = (53 * hash) + getRoomId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static warehouse_CA.warehouseControl.TempRequest parseFrom(
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
  public static Builder newBuilder(warehouse_CA.warehouseControl.TempRequest prototype) {
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
   * Protobuf type {@code service1.TempRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service1.TempRequest)
      warehouse_CA.warehouseControl.TempRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return warehouse_CA.warehouseControl.warehouseControlImpl.internal_static_service1_TempRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return warehouse_CA.warehouseControl.warehouseControlImpl.internal_static_service1_TempRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              warehouse_CA.warehouseControl.TempRequest.class, warehouse_CA.warehouseControl.TempRequest.Builder.class);
    }

    // Construct using warehouse_CA.warehouseControl.TempRequest.newBuilder()
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
      currentTemperature_ = "";

      roomId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return warehouse_CA.warehouseControl.warehouseControlImpl.internal_static_service1_TempRequest_descriptor;
    }

    @java.lang.Override
    public warehouse_CA.warehouseControl.TempRequest getDefaultInstanceForType() {
      return warehouse_CA.warehouseControl.TempRequest.getDefaultInstance();
    }

    @java.lang.Override
    public warehouse_CA.warehouseControl.TempRequest build() {
      warehouse_CA.warehouseControl.TempRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public warehouse_CA.warehouseControl.TempRequest buildPartial() {
      warehouse_CA.warehouseControl.TempRequest result = new warehouse_CA.warehouseControl.TempRequest(this);
      result.currentTemperature_ = currentTemperature_;
      result.roomId_ = roomId_;
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
      if (other instanceof warehouse_CA.warehouseControl.TempRequest) {
        return mergeFrom((warehouse_CA.warehouseControl.TempRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(warehouse_CA.warehouseControl.TempRequest other) {
      if (other == warehouse_CA.warehouseControl.TempRequest.getDefaultInstance()) return this;
      if (!other.getCurrentTemperature().isEmpty()) {
        currentTemperature_ = other.currentTemperature_;
        onChanged();
      }
      if (!other.getRoomId().isEmpty()) {
        roomId_ = other.roomId_;
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
      warehouse_CA.warehouseControl.TempRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (warehouse_CA.warehouseControl.TempRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object currentTemperature_ = "";
    /**
     * <code>string currentTemperature = 1;</code>
     */
    public java.lang.String getCurrentTemperature() {
      java.lang.Object ref = currentTemperature_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        currentTemperature_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string currentTemperature = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCurrentTemperatureBytes() {
      java.lang.Object ref = currentTemperature_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        currentTemperature_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string currentTemperature = 1;</code>
     */
    public Builder setCurrentTemperature(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      currentTemperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string currentTemperature = 1;</code>
     */
    public Builder clearCurrentTemperature() {
      
      currentTemperature_ = getDefaultInstance().getCurrentTemperature();
      onChanged();
      return this;
    }
    /**
     * <code>string currentTemperature = 1;</code>
     */
    public Builder setCurrentTemperatureBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      currentTemperature_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object roomId_ = "";
    /**
     * <code>string roomId = 2;</code>
     */
    public java.lang.String getRoomId() {
      java.lang.Object ref = roomId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roomId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roomId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoomIdBytes() {
      java.lang.Object ref = roomId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roomId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roomId = 2;</code>
     */
    public Builder setRoomId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roomId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string roomId = 2;</code>
     */
    public Builder clearRoomId() {
      
      roomId_ = getDefaultInstance().getRoomId();
      onChanged();
      return this;
    }
    /**
     * <code>string roomId = 2;</code>
     */
    public Builder setRoomIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roomId_ = value;
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


    // @@protoc_insertion_point(builder_scope:service1.TempRequest)
  }

  // @@protoc_insertion_point(class_scope:service1.TempRequest)
  private static final warehouse_CA.warehouseControl.TempRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new warehouse_CA.warehouseControl.TempRequest();
  }

  public static warehouse_CA.warehouseControl.TempRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TempRequest>
      PARSER = new com.google.protobuf.AbstractParser<TempRequest>() {
    @java.lang.Override
    public TempRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TempRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TempRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TempRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public warehouse_CA.warehouseControl.TempRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
