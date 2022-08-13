package warehouse_CA.automateOrders;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: automateOrders.proto")
public final class automateOrdersGrpc {

  private automateOrdersGrpc() {}

  public static final String SERVICE_NAME = "service1.automateOrders";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<warehouse_CA.automateOrders.OrderDetailsRequest,
      warehouse_CA.automateOrders.OrderDetailsResponse> getGetOrderDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOrderDetails",
      requestType = warehouse_CA.automateOrders.OrderDetailsRequest.class,
      responseType = warehouse_CA.automateOrders.OrderDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<warehouse_CA.automateOrders.OrderDetailsRequest,
      warehouse_CA.automateOrders.OrderDetailsResponse> getGetOrderDetailsMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.automateOrders.OrderDetailsRequest, warehouse_CA.automateOrders.OrderDetailsResponse> getGetOrderDetailsMethod;
    if ((getGetOrderDetailsMethod = automateOrdersGrpc.getGetOrderDetailsMethod) == null) {
      synchronized (automateOrdersGrpc.class) {
        if ((getGetOrderDetailsMethod = automateOrdersGrpc.getGetOrderDetailsMethod) == null) {
          automateOrdersGrpc.getGetOrderDetailsMethod = getGetOrderDetailsMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.automateOrders.OrderDetailsRequest, warehouse_CA.automateOrders.OrderDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.automateOrders", "getOrderDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.automateOrders.OrderDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.automateOrders.OrderDetailsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new automateOrdersMethodDescriptorSupplier("getOrderDetails"))
                  .build();
          }
        }
     }
     return getGetOrderDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse_CA.automateOrders.OrderStatusRequest,
      warehouse_CA.automateOrders.OrderStatusResponse> getCheckOrderStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkOrderStatus",
      requestType = warehouse_CA.automateOrders.OrderStatusRequest.class,
      responseType = warehouse_CA.automateOrders.OrderStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse_CA.automateOrders.OrderStatusRequest,
      warehouse_CA.automateOrders.OrderStatusResponse> getCheckOrderStatusMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.automateOrders.OrderStatusRequest, warehouse_CA.automateOrders.OrderStatusResponse> getCheckOrderStatusMethod;
    if ((getCheckOrderStatusMethod = automateOrdersGrpc.getCheckOrderStatusMethod) == null) {
      synchronized (automateOrdersGrpc.class) {
        if ((getCheckOrderStatusMethod = automateOrdersGrpc.getCheckOrderStatusMethod) == null) {
          automateOrdersGrpc.getCheckOrderStatusMethod = getCheckOrderStatusMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.automateOrders.OrderStatusRequest, warehouse_CA.automateOrders.OrderStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.automateOrders", "checkOrderStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.automateOrders.OrderStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.automateOrders.OrderStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new automateOrdersMethodDescriptorSupplier("checkOrderStatus"))
                  .build();
          }
        }
     }
     return getCheckOrderStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse_CA.automateOrders.Message,
      warehouse_CA.automateOrders.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = warehouse_CA.automateOrders.Message.class,
      responseType = warehouse_CA.automateOrders.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse_CA.automateOrders.Message,
      warehouse_CA.automateOrders.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.automateOrders.Message, warehouse_CA.automateOrders.Empty> getEmptyMethod;
    if ((getEmptyMethod = automateOrdersGrpc.getEmptyMethod) == null) {
      synchronized (automateOrdersGrpc.class) {
        if ((getEmptyMethod = automateOrdersGrpc.getEmptyMethod) == null) {
          automateOrdersGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.automateOrders.Message, warehouse_CA.automateOrders.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.automateOrders", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.automateOrders.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.automateOrders.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new automateOrdersMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static automateOrdersStub newStub(io.grpc.Channel channel) {
    return new automateOrdersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static automateOrdersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new automateOrdersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static automateOrdersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new automateOrdersFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class automateOrdersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderDetailsRequest> getOrderDetails(
        io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderDetailsResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetOrderDetailsMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public void checkOrderStatus(warehouse_CA.automateOrders.OrderStatusRequest request,
        io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckOrderStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public void empty(warehouse_CA.automateOrders.Message request,
        io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetOrderDetailsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                warehouse_CA.automateOrders.OrderDetailsRequest,
                warehouse_CA.automateOrders.OrderDetailsResponse>(
                  this, METHODID_GET_ORDER_DETAILS)))
          .addMethod(
            getCheckOrderStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                warehouse_CA.automateOrders.OrderStatusRequest,
                warehouse_CA.automateOrders.OrderStatusResponse>(
                  this, METHODID_CHECK_ORDER_STATUS)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                warehouse_CA.automateOrders.Message,
                warehouse_CA.automateOrders.Empty>(
                  this, METHODID_EMPTY)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class automateOrdersStub extends io.grpc.stub.AbstractStub<automateOrdersStub> {
    private automateOrdersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private automateOrdersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected automateOrdersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new automateOrdersStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for bidirectional streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderDetailsRequest> getOrderDetails(
        io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderDetailsResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetOrderDetailsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public void checkOrderStatus(warehouse_CA.automateOrders.OrderStatusRequest request,
        io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckOrderStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public void empty(warehouse_CA.automateOrders.Message request,
        io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class automateOrdersBlockingStub extends io.grpc.stub.AbstractStub<automateOrdersBlockingStub> {
    private automateOrdersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private automateOrdersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected automateOrdersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new automateOrdersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public warehouse_CA.automateOrders.OrderStatusResponse checkOrderStatus(warehouse_CA.automateOrders.OrderStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckOrderStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public warehouse_CA.automateOrders.Empty empty(warehouse_CA.automateOrders.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class automateOrdersFutureStub extends io.grpc.stub.AbstractStub<automateOrdersFutureStub> {
    private automateOrdersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private automateOrdersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected automateOrdersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new automateOrdersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse_CA.automateOrders.OrderStatusResponse> checkOrderStatus(
        warehouse_CA.automateOrders.OrderStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckOrderStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse_CA.automateOrders.Empty> empty(
        warehouse_CA.automateOrders.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_ORDER_STATUS = 0;
  private static final int METHODID_EMPTY = 1;
  private static final int METHODID_GET_ORDER_DETAILS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final automateOrdersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(automateOrdersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_ORDER_STATUS:
          serviceImpl.checkOrderStatus((warehouse_CA.automateOrders.OrderStatusRequest) request,
              (io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderStatusResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((warehouse_CA.automateOrders.Message) request,
              (io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ORDER_DETAILS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getOrderDetails(
              (io.grpc.stub.StreamObserver<warehouse_CA.automateOrders.OrderDetailsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class automateOrdersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    automateOrdersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return warehouse_CA.automateOrders.automateOrdersImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("automateOrders");
    }
  }

  private static final class automateOrdersFileDescriptorSupplier
      extends automateOrdersBaseDescriptorSupplier {
    automateOrdersFileDescriptorSupplier() {}
  }

  private static final class automateOrdersMethodDescriptorSupplier
      extends automateOrdersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    automateOrdersMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (automateOrdersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new automateOrdersFileDescriptorSupplier())
              .addMethod(getGetOrderDetailsMethod())
              .addMethod(getCheckOrderStatusMethod())
              .addMethod(getEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
