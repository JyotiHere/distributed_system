// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: automateOrders.proto

package warehouse_CA.automateOrders;

/**
 * Protobuf type {@code service1.OrderDetailsResponse}
 */
public  final class OrderDetailsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:service1.OrderDetailsResponse)
    OrderDetailsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderDetailsResponse.newBuilder() to construct.
  private OrderDetailsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderDetailsResponse() {
    orderId_ = "";
    orderDate_ = "";
    deliveryDate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderDetailsResponse(
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

            orderId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            orderDate_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deliveryDate_ = s;
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
    return warehouse_CA.automateOrders.automateOrdersImpl.internal_static_service1_OrderDetailsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return warehouse_CA.automateOrders.automateOrdersImpl.internal_static_service1_OrderDetailsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            warehouse_CA.automateOrders.OrderDetailsResponse.class, warehouse_CA.automateOrders.OrderDetailsResponse.Builder.class);
  }

  public static final int ORDERID_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderId_;
  /**
   * <code>string orderId = 1;</code>
   */
  public java.lang.String getOrderId() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderId_ = s;
      return s;
    }
  }
  /**
   * <code>string orderId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderIdBytes() {
    java.lang.Object ref = orderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERDATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object orderDate_;
  /**
   * <code>string orderDate = 2;</code>
   */
  public java.lang.String getOrderDate() {
    java.lang.Object ref = orderDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderDate_ = s;
      return s;
    }
  }
  /**
   * <code>string orderDate = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOrderDateBytes() {
    java.lang.Object ref = orderDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DELIVERYDATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object deliveryDate_;
  /**
   * <code>string deliveryDate = 3;</code>
   */
  public java.lang.String getDeliveryDate() {
    java.lang.Object ref = deliveryDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deliveryDate_ = s;
      return s;
    }
  }
  /**
   * <code>string deliveryDate = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDeliveryDateBytes() {
    java.lang.Object ref = deliveryDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deliveryDate_ = b;
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
    if (!getOrderIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderId_);
    }
    if (!getOrderDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orderDate_);
    }
    if (!getDeliveryDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deliveryDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderId_);
    }
    if (!getOrderDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orderDate_);
    }
    if (!getDeliveryDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deliveryDate_);
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
    if (!(obj instanceof warehouse_CA.automateOrders.OrderDetailsResponse)) {
      return super.equals(obj);
    }
    warehouse_CA.automateOrders.OrderDetailsResponse other = (warehouse_CA.automateOrders.OrderDetailsResponse) obj;

    boolean result = true;
    result = result && getOrderId()
        .equals(other.getOrderId());
    result = result && getOrderDate()
        .equals(other.getOrderDate());
    result = result && getDeliveryDate()
        .equals(other.getDeliveryDate());
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
    hash = (37 * hash) + ORDERID_FIELD_NUMBER;
    hash = (53 * hash) + getOrderId().hashCode();
    hash = (37 * hash) + ORDERDATE_FIELD_NUMBER;
    hash = (53 * hash) + getOrderDate().hashCode();
    hash = (37 * hash) + DELIVERYDATE_FIELD_NUMBER;
    hash = (53 * hash) + getDeliveryDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static warehouse_CA.automateOrders.OrderDetailsResponse parseFrom(
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
  public static Builder newBuilder(warehouse_CA.automateOrders.OrderDetailsResponse prototype) {
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
   * Protobuf type {@code service1.OrderDetailsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:service1.OrderDetailsResponse)
      warehouse_CA.automateOrders.OrderDetailsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return warehouse_CA.automateOrders.automateOrdersImpl.internal_static_service1_OrderDetailsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return warehouse_CA.automateOrders.automateOrdersImpl.internal_static_service1_OrderDetailsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              warehouse_CA.automateOrders.OrderDetailsResponse.class, warehouse_CA.automateOrders.OrderDetailsResponse.Builder.class);
    }

    // Construct using warehouse_CA.automateOrders.OrderDetailsResponse.newBuilder()
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
      orderId_ = "";

      orderDate_ = "";

      deliveryDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return warehouse_CA.automateOrders.automateOrdersImpl.internal_static_service1_OrderDetailsResponse_descriptor;
    }

    @java.lang.Override
    public warehouse_CA.automateOrders.OrderDetailsResponse getDefaultInstanceForType() {
      return warehouse_CA.automateOrders.OrderDetailsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public warehouse_CA.automateOrders.OrderDetailsResponse build() {
      warehouse_CA.automateOrders.OrderDetailsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public warehouse_CA.automateOrders.OrderDetailsResponse buildPartial() {
      warehouse_CA.automateOrders.OrderDetailsResponse result = new warehouse_CA.automateOrders.OrderDetailsResponse(this);
      result.orderId_ = orderId_;
      result.orderDate_ = orderDate_;
      result.deliveryDate_ = deliveryDate_;
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
      if (other instanceof warehouse_CA.automateOrders.OrderDetailsResponse) {
        return mergeFrom((warehouse_CA.automateOrders.OrderDetailsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(warehouse_CA.automateOrders.OrderDetailsResponse other) {
      if (other == warehouse_CA.automateOrders.OrderDetailsResponse.getDefaultInstance()) return this;
      if (!other.getOrderId().isEmpty()) {
        orderId_ = other.orderId_;
        onChanged();
      }
      if (!other.getOrderDate().isEmpty()) {
        orderDate_ = other.orderDate_;
        onChanged();
      }
      if (!other.getDeliveryDate().isEmpty()) {
        deliveryDate_ = other.deliveryDate_;
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
      warehouse_CA.automateOrders.OrderDetailsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (warehouse_CA.automateOrders.OrderDetailsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderId_ = "";
    /**
     * <code>string orderId = 1;</code>
     */
    public java.lang.String getOrderId() {
      java.lang.Object ref = orderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderIdBytes() {
      java.lang.Object ref = orderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder setOrderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder clearOrderId() {
      
      orderId_ = getDefaultInstance().getOrderId();
      onChanged();
      return this;
    }
    /**
     * <code>string orderId = 1;</code>
     */
    public Builder setOrderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderDate_ = "";
    /**
     * <code>string orderDate = 2;</code>
     */
    public java.lang.String getOrderDate() {
      java.lang.Object ref = orderDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOrderDateBytes() {
      java.lang.Object ref = orderDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public Builder setOrderDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public Builder clearOrderDate() {
      
      orderDate_ = getDefaultInstance().getOrderDate();
      onChanged();
      return this;
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public Builder setOrderDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deliveryDate_ = "";
    /**
     * <code>string deliveryDate = 3;</code>
     */
    public java.lang.String getDeliveryDate() {
      java.lang.Object ref = deliveryDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deliveryDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string deliveryDate = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDeliveryDateBytes() {
      java.lang.Object ref = deliveryDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deliveryDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string deliveryDate = 3;</code>
     */
    public Builder setDeliveryDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deliveryDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string deliveryDate = 3;</code>
     */
    public Builder clearDeliveryDate() {
      
      deliveryDate_ = getDefaultInstance().getDeliveryDate();
      onChanged();
      return this;
    }
    /**
     * <code>string deliveryDate = 3;</code>
     */
    public Builder setDeliveryDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deliveryDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:service1.OrderDetailsResponse)
  }

  // @@protoc_insertion_point(class_scope:service1.OrderDetailsResponse)
  private static final warehouse_CA.automateOrders.OrderDetailsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new warehouse_CA.automateOrders.OrderDetailsResponse();
  }

  public static warehouse_CA.automateOrders.OrderDetailsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderDetailsResponse>
      PARSER = new com.google.protobuf.AbstractParser<OrderDetailsResponse>() {
    @java.lang.Override
    public OrderDetailsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderDetailsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderDetailsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderDetailsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public warehouse_CA.automateOrders.OrderDetailsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
