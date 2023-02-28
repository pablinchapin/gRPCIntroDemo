package org.example.inventory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: inventory/item.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ItemServiceGrpc {

  private ItemServiceGrpc() {}

  public static final String SERVICE_NAME = "inventory.ItemService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.inventory.Item,
      org.example.inventory.ItemIdResponse> getCreateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createItem",
      requestType = org.example.inventory.Item.class,
      responseType = org.example.inventory.ItemIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.inventory.Item,
      org.example.inventory.ItemIdResponse> getCreateItemMethod() {
    io.grpc.MethodDescriptor<org.example.inventory.Item, org.example.inventory.ItemIdResponse> getCreateItemMethod;
    if ((getCreateItemMethod = ItemServiceGrpc.getCreateItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getCreateItemMethod = ItemServiceGrpc.getCreateItemMethod) == null) {
          ItemServiceGrpc.getCreateItemMethod = getCreateItemMethod =
              io.grpc.MethodDescriptor.<org.example.inventory.Item, org.example.inventory.ItemIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.Item.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.ItemIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("createItem"))
              .build();
        }
      }
    }
    return getCreateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.inventory.ItemIdRequest,
      org.example.inventory.Item> getReadItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readItem",
      requestType = org.example.inventory.ItemIdRequest.class,
      responseType = org.example.inventory.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.inventory.ItemIdRequest,
      org.example.inventory.Item> getReadItemMethod() {
    io.grpc.MethodDescriptor<org.example.inventory.ItemIdRequest, org.example.inventory.Item> getReadItemMethod;
    if ((getReadItemMethod = ItemServiceGrpc.getReadItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getReadItemMethod = ItemServiceGrpc.getReadItemMethod) == null) {
          ItemServiceGrpc.getReadItemMethod = getReadItemMethod =
              io.grpc.MethodDescriptor.<org.example.inventory.ItemIdRequest, org.example.inventory.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.ItemIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("readItem"))
              .build();
        }
      }
    }
    return getReadItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.inventory.Item> getListItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listItem",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.example.inventory.Item.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.example.inventory.Item> getListItemMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.example.inventory.Item> getListItemMethod;
    if ((getListItemMethod = ItemServiceGrpc.getListItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getListItemMethod = ItemServiceGrpc.getListItemMethod) == null) {
          ItemServiceGrpc.getListItemMethod = getListItemMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.example.inventory.Item>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.Item.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("listItem"))
              .build();
        }
      }
    }
    return getListItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.inventory.Item,
      com.google.protobuf.Empty> getUpdateItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateItem",
      requestType = org.example.inventory.Item.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.inventory.Item,
      com.google.protobuf.Empty> getUpdateItemMethod() {
    io.grpc.MethodDescriptor<org.example.inventory.Item, com.google.protobuf.Empty> getUpdateItemMethod;
    if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getUpdateItemMethod = ItemServiceGrpc.getUpdateItemMethod) == null) {
          ItemServiceGrpc.getUpdateItemMethod = getUpdateItemMethod =
              io.grpc.MethodDescriptor.<org.example.inventory.Item, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.Item.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("updateItem"))
              .build();
        }
      }
    }
    return getUpdateItemMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.inventory.ItemIdRequest,
      com.google.protobuf.Empty> getDeleteItemMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteItem",
      requestType = org.example.inventory.ItemIdRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.inventory.ItemIdRequest,
      com.google.protobuf.Empty> getDeleteItemMethod() {
    io.grpc.MethodDescriptor<org.example.inventory.ItemIdRequest, com.google.protobuf.Empty> getDeleteItemMethod;
    if ((getDeleteItemMethod = ItemServiceGrpc.getDeleteItemMethod) == null) {
      synchronized (ItemServiceGrpc.class) {
        if ((getDeleteItemMethod = ItemServiceGrpc.getDeleteItemMethod) == null) {
          ItemServiceGrpc.getDeleteItemMethod = getDeleteItemMethod =
              io.grpc.MethodDescriptor.<org.example.inventory.ItemIdRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteItem"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.inventory.ItemIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ItemServiceMethodDescriptorSupplier("deleteItem"))
              .build();
        }
      }
    }
    return getDeleteItemMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceStub>() {
        @java.lang.Override
        public ItemServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceStub(channel, callOptions);
        }
      };
    return ItemServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceBlockingStub>() {
        @java.lang.Override
        public ItemServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceBlockingStub(channel, callOptions);
        }
      };
    return ItemServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ItemServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ItemServiceFutureStub>() {
        @java.lang.Override
        public ItemServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ItemServiceFutureStub(channel, callOptions);
        }
      };
    return ItemServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ItemServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *create
     * </pre>
     */
    public void createItem(org.example.inventory.Item request,
        io.grpc.stub.StreamObserver<org.example.inventory.ItemIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateItemMethod(), responseObserver);
    }

    /**
     * <pre>
     *read
     * </pre>
     */
    public void readItem(org.example.inventory.ItemIdRequest request,
        io.grpc.stub.StreamObserver<org.example.inventory.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadItemMethod(), responseObserver);
    }

    /**
     */
    public void listItem(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.inventory.Item> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListItemMethod(), responseObserver);
    }

    /**
     * <pre>
     *update
     * </pre>
     */
    public void updateItem(org.example.inventory.Item request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateItemMethod(), responseObserver);
    }

    /**
     * <pre>
     *delete
     * </pre>
     */
    public void deleteItem(org.example.inventory.ItemIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteItemMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.inventory.Item,
                org.example.inventory.ItemIdResponse>(
                  this, METHODID_CREATE_ITEM)))
          .addMethod(
            getReadItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.inventory.ItemIdRequest,
                org.example.inventory.Item>(
                  this, METHODID_READ_ITEM)))
          .addMethod(
            getListItemMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.example.inventory.Item>(
                  this, METHODID_LIST_ITEM)))
          .addMethod(
            getUpdateItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.inventory.Item,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ITEM)))
          .addMethod(
            getDeleteItemMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.inventory.ItemIdRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class ItemServiceStub extends io.grpc.stub.AbstractAsyncStub<ItemServiceStub> {
    private ItemServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *create
     * </pre>
     */
    public void createItem(org.example.inventory.Item request,
        io.grpc.stub.StreamObserver<org.example.inventory.ItemIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *read
     * </pre>
     */
    public void readItem(org.example.inventory.ItemIdRequest request,
        io.grpc.stub.StreamObserver<org.example.inventory.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listItem(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.example.inventory.Item> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *update
     * </pre>
     */
    public void updateItem(org.example.inventory.Item request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *delete
     * </pre>
     */
    public void deleteItem(org.example.inventory.ItemIdRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ItemServiceBlockingStub> {
    private ItemServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *create
     * </pre>
     */
    public org.example.inventory.ItemIdResponse createItem(org.example.inventory.Item request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *read
     * </pre>
     */
    public org.example.inventory.Item readItem(org.example.inventory.ItemIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadItemMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.example.inventory.Item> listItem(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *update
     * </pre>
     */
    public com.google.protobuf.Empty updateItem(org.example.inventory.Item request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateItemMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *delete
     * </pre>
     */
    public com.google.protobuf.Empty deleteItem(org.example.inventory.ItemIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteItemMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ItemServiceFutureStub> {
    private ItemServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ItemServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *create
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.inventory.ItemIdResponse> createItem(
        org.example.inventory.Item request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *read
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.inventory.Item> readItem(
        org.example.inventory.ItemIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *update
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateItem(
        org.example.inventory.Item request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateItemMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *delete
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteItem(
        org.example.inventory.ItemIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteItemMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ITEM = 0;
  private static final int METHODID_READ_ITEM = 1;
  private static final int METHODID_LIST_ITEM = 2;
  private static final int METHODID_UPDATE_ITEM = 3;
  private static final int METHODID_DELETE_ITEM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ITEM:
          serviceImpl.createItem((org.example.inventory.Item) request,
              (io.grpc.stub.StreamObserver<org.example.inventory.ItemIdResponse>) responseObserver);
          break;
        case METHODID_READ_ITEM:
          serviceImpl.readItem((org.example.inventory.ItemIdRequest) request,
              (io.grpc.stub.StreamObserver<org.example.inventory.Item>) responseObserver);
          break;
        case METHODID_LIST_ITEM:
          serviceImpl.listItem((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.inventory.Item>) responseObserver);
          break;
        case METHODID_UPDATE_ITEM:
          serviceImpl.updateItem((org.example.inventory.Item) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ITEM:
          serviceImpl.deleteItem((org.example.inventory.ItemIdRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.inventory.ItemOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemService");
    }
  }

  private static final class ItemServiceFileDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier {
    ItemServiceFileDescriptorSupplier() {}
  }

  private static final class ItemServiceMethodDescriptorSupplier
      extends ItemServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemServiceFileDescriptorSupplier())
              .addMethod(getCreateItemMethod())
              .addMethod(getReadItemMethod())
              .addMethod(getListItemMethod())
              .addMethod(getUpdateItemMethod())
              .addMethod(getDeleteItemMethod())
              .build();
        }
      }
    }
    return result;
  }
}
