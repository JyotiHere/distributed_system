package warehouse_CA.manageStock;

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
 *Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: manageStock.proto")
public final class manageStockGrpc {

  private manageStockGrpc() {}

  public static final String SERVICE_NAME = "service1.manageStock";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<warehouse_CA.manageStock.WarehouseStockRequest,
      warehouse_CA.manageStock.WarehouseStockResponse> getStockCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "stockCheck",
      requestType = warehouse_CA.manageStock.WarehouseStockRequest.class,
      responseType = warehouse_CA.manageStock.WarehouseStockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<warehouse_CA.manageStock.WarehouseStockRequest,
      warehouse_CA.manageStock.WarehouseStockResponse> getStockCheckMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.manageStock.WarehouseStockRequest, warehouse_CA.manageStock.WarehouseStockResponse> getStockCheckMethod;
    if ((getStockCheckMethod = manageStockGrpc.getStockCheckMethod) == null) {
      synchronized (manageStockGrpc.class) {
        if ((getStockCheckMethod = manageStockGrpc.getStockCheckMethod) == null) {
          manageStockGrpc.getStockCheckMethod = getStockCheckMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.manageStock.WarehouseStockRequest, warehouse_CA.manageStock.WarehouseStockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.manageStock", "stockCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.manageStock.WarehouseStockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.manageStock.WarehouseStockResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new manageStockMethodDescriptorSupplier("stockCheck"))
                  .build();
          }
        }
     }
     return getStockCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse_CA.manageStock.ListRequest,
      warehouse_CA.manageStock.ListResponse> getProductConditionCheckerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "productConditionChecker",
      requestType = warehouse_CA.manageStock.ListRequest.class,
      responseType = warehouse_CA.manageStock.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse_CA.manageStock.ListRequest,
      warehouse_CA.manageStock.ListResponse> getProductConditionCheckerMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.manageStock.ListRequest, warehouse_CA.manageStock.ListResponse> getProductConditionCheckerMethod;
    if ((getProductConditionCheckerMethod = manageStockGrpc.getProductConditionCheckerMethod) == null) {
      synchronized (manageStockGrpc.class) {
        if ((getProductConditionCheckerMethod = manageStockGrpc.getProductConditionCheckerMethod) == null) {
          manageStockGrpc.getProductConditionCheckerMethod = getProductConditionCheckerMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.manageStock.ListRequest, warehouse_CA.manageStock.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.manageStock", "productConditionChecker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.manageStock.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.manageStock.ListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new manageStockMethodDescriptorSupplier("productConditionChecker"))
                  .build();
          }
        }
     }
     return getProductConditionCheckerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<warehouse_CA.manageStock.Message,
      warehouse_CA.manageStock.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = warehouse_CA.manageStock.Message.class,
      responseType = warehouse_CA.manageStock.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<warehouse_CA.manageStock.Message,
      warehouse_CA.manageStock.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<warehouse_CA.manageStock.Message, warehouse_CA.manageStock.Empty> getEmptyMethod;
    if ((getEmptyMethod = manageStockGrpc.getEmptyMethod) == null) {
      synchronized (manageStockGrpc.class) {
        if ((getEmptyMethod = manageStockGrpc.getEmptyMethod) == null) {
          manageStockGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<warehouse_CA.manageStock.Message, warehouse_CA.manageStock.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.manageStock", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.manageStock.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  warehouse_CA.manageStock.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new manageStockMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static manageStockStub newStub(io.grpc.Channel channel) {
    return new manageStockStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static manageStockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new manageStockBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static manageStockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new manageStockFutureStub(channel);
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static abstract class manageStockImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *rpc method for server streaming calls
     * </pre>
     */
    public void stockCheck(warehouse_CA.manageStock.WarehouseStockRequest request,
        io.grpc.stub.StreamObserver<warehouse_CA.manageStock.WarehouseStockResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStockCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public void productConditionChecker(warehouse_CA.manageStock.ListRequest request,
        io.grpc.stub.StreamObserver<warehouse_CA.manageStock.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProductConditionCheckerMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public void empty(warehouse_CA.manageStock.Message request,
        io.grpc.stub.StreamObserver<warehouse_CA.manageStock.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStockCheckMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                warehouse_CA.manageStock.WarehouseStockRequest,
                warehouse_CA.manageStock.WarehouseStockResponse>(
                  this, METHODID_STOCK_CHECK)))
          .addMethod(
            getProductConditionCheckerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                warehouse_CA.manageStock.ListRequest,
                warehouse_CA.manageStock.ListResponse>(
                  this, METHODID_PRODUCT_CONDITION_CHECKER)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                warehouse_CA.manageStock.Message,
                warehouse_CA.manageStock.Empty>(
                  this, METHODID_EMPTY)))
          .build();
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class manageStockStub extends io.grpc.stub.AbstractStub<manageStockStub> {
    private manageStockStub(io.grpc.Channel channel) {
      super(channel);
    }

    private manageStockStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected manageStockStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new manageStockStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc method for server streaming calls
     * </pre>
     */
    public void stockCheck(warehouse_CA.manageStock.WarehouseStockRequest request,
        io.grpc.stub.StreamObserver<warehouse_CA.manageStock.WarehouseStockResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStockCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public void productConditionChecker(warehouse_CA.manageStock.ListRequest request,
        io.grpc.stub.StreamObserver<warehouse_CA.manageStock.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProductConditionCheckerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public void empty(warehouse_CA.manageStock.Message request,
        io.grpc.stub.StreamObserver<warehouse_CA.manageStock.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class manageStockBlockingStub extends io.grpc.stub.AbstractStub<manageStockBlockingStub> {
    private manageStockBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private manageStockBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected manageStockBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new manageStockBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc method for server streaming calls
     * </pre>
     */
    public java.util.Iterator<warehouse_CA.manageStock.WarehouseStockResponse> stockCheck(
        warehouse_CA.manageStock.WarehouseStockRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStockCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public warehouse_CA.manageStock.ListResponse productConditionChecker(warehouse_CA.manageStock.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getProductConditionCheckerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public warehouse_CA.manageStock.Empty empty(warehouse_CA.manageStock.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class manageStockFutureStub extends io.grpc.stub.AbstractStub<manageStockFutureStub> {
    private manageStockFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private manageStockFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected manageStockFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new manageStockFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse_CA.manageStock.ListResponse> productConditionChecker(
        warehouse_CA.manageStock.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProductConditionCheckerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *rpc method that does not return any response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<warehouse_CA.manageStock.Empty> empty(
        warehouse_CA.manageStock.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STOCK_CHECK = 0;
  private static final int METHODID_PRODUCT_CONDITION_CHECKER = 1;
  private static final int METHODID_EMPTY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final manageStockImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(manageStockImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STOCK_CHECK:
          serviceImpl.stockCheck((warehouse_CA.manageStock.WarehouseStockRequest) request,
              (io.grpc.stub.StreamObserver<warehouse_CA.manageStock.WarehouseStockResponse>) responseObserver);
          break;
        case METHODID_PRODUCT_CONDITION_CHECKER:
          serviceImpl.productConditionChecker((warehouse_CA.manageStock.ListRequest) request,
              (io.grpc.stub.StreamObserver<warehouse_CA.manageStock.ListResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((warehouse_CA.manageStock.Message) request,
              (io.grpc.stub.StreamObserver<warehouse_CA.manageStock.Empty>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class manageStockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    manageStockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return warehouse_CA.manageStock.manageStockImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("manageStock");
    }
  }

  private static final class manageStockFileDescriptorSupplier
      extends manageStockBaseDescriptorSupplier {
    manageStockFileDescriptorSupplier() {}
  }

  private static final class manageStockMethodDescriptorSupplier
      extends manageStockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    manageStockMethodDescriptorSupplier(String methodName) {
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
      synchronized (manageStockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new manageStockFileDescriptorSupplier())
              .addMethod(getStockCheckMethod())
              .addMethod(getProductConditionCheckerMethod())
              .addMethod(getEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
