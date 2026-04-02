package lab5.server.grpc.generated_java;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class GrpcUsersGrpc {

  private GrpcUsersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "GrpcUsers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser,
      lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult> getPostUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PostUser",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser,
      lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult> getPostUserMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser, lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult> getPostUserMethod;
    if ((getPostUserMethod = GrpcUsersGrpc.getPostUserMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getPostUserMethod = GrpcUsersGrpc.getPostUserMethod) == null) {
          GrpcUsersGrpc.getPostUserMethod = getPostUserMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser, lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PostUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("PostUser"))
              .build();
        }
      }
    }
    return getPostUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult> getGetUserMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs, lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult> getGetUserMethod;
    if ((getGetUserMethod = GrpcUsersGrpc.getGetUserMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getGetUserMethod = GrpcUsersGrpc.getGetUserMethod) == null) {
          GrpcUsersGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs, lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs, lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult> getUpdateUserMethod;
    if ((getUpdateUserMethod = GrpcUsersGrpc.getUpdateUserMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getUpdateUserMethod = GrpcUsersGrpc.getUpdateUserMethod) == null) {
          GrpcUsersGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs, lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs, lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult> getDeleteUserMethod;
    if ((getDeleteUserMethod = GrpcUsersGrpc.getDeleteUserMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getDeleteUserMethod = GrpcUsersGrpc.getDeleteUserMethod) == null) {
          GrpcUsersGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs, lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser> getSearchUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUsers",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser> getSearchUsersMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs, lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser> getSearchUsersMethod;
    if ((getSearchUsersMethod = GrpcUsersGrpc.getSearchUsersMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getSearchUsersMethod = GrpcUsersGrpc.getSearchUsersMethod) == null) {
          GrpcUsersGrpc.getSearchUsersMethod = getSearchUsersMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs, lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("SearchUsers"))
              .build();
        }
      }
    }
    return getSearchUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult> getGetUserPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserPhoto",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult> getGetUserPhotoMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs, lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult> getGetUserPhotoMethod;
    if ((getGetUserPhotoMethod = GrpcUsersGrpc.getGetUserPhotoMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getGetUserPhotoMethod = GrpcUsersGrpc.getGetUserPhotoMethod) == null) {
          GrpcUsersGrpc.getGetUserPhotoMethod = getGetUserPhotoMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs, lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("GetUserPhoto"))
              .build();
        }
      }
    }
    return getGetUserPhotoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult> getUpdateUserPhotoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUserPhoto",
      requestType = lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs.class,
      responseType = lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs,
      lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult> getUpdateUserPhotoMethod() {
    io.grpc.MethodDescriptor<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs, lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult> getUpdateUserPhotoMethod;
    if ((getUpdateUserPhotoMethod = GrpcUsersGrpc.getUpdateUserPhotoMethod) == null) {
      synchronized (GrpcUsersGrpc.class) {
        if ((getUpdateUserPhotoMethod = GrpcUsersGrpc.getUpdateUserPhotoMethod) == null) {
          GrpcUsersGrpc.getUpdateUserPhotoMethod = getUpdateUserPhotoMethod =
              io.grpc.MethodDescriptor.<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs, lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUserPhoto"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult.getDefaultInstance()))
              .setSchemaDescriptor(new GrpcUsersMethodDescriptorSupplier("UpdateUserPhoto"))
              .build();
        }
      }
    }
    return getUpdateUserPhotoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrpcUsersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcUsersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcUsersStub>() {
        @java.lang.Override
        public GrpcUsersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcUsersStub(channel, callOptions);
        }
      };
    return GrpcUsersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GrpcUsersBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcUsersBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcUsersBlockingV2Stub>() {
        @java.lang.Override
        public GrpcUsersBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcUsersBlockingV2Stub(channel, callOptions);
        }
      };
    return GrpcUsersBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrpcUsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcUsersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcUsersBlockingStub>() {
        @java.lang.Override
        public GrpcUsersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcUsersBlockingStub(channel, callOptions);
        }
      };
    return GrpcUsersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrpcUsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GrpcUsersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GrpcUsersFutureStub>() {
        @java.lang.Override
        public GrpcUsersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GrpcUsersFutureStub(channel, callOptions);
        }
      };
    return GrpcUsersFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void postUser(lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostUserMethod(), responseObserver);
    }

    /**
     */
    default void getUser(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    default void searchUsers(lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUsersMethod(), responseObserver);
    }

    /**
     */
    default void getUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserPhotoMethod(), responseObserver);
    }

    /**
     */
    default void updateUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserPhotoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GrpcUsers.
   */
  public static abstract class GrpcUsersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GrpcUsersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GrpcUsers.
   */
  public static final class GrpcUsersStub
      extends io.grpc.stub.AbstractAsyncStub<GrpcUsersStub> {
    private GrpcUsersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcUsersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcUsersStub(channel, callOptions);
    }

    /**
     */
    public void postUser(lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUsers(lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserPhotoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs request,
        io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserPhotoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GrpcUsers.
   */
  public static final class GrpcUsersBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GrpcUsersBlockingV2Stub> {
    private GrpcUsersBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcUsersBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcUsersBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult postUser(lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getPostUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult getUser(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult updateUser(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult deleteUser(lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<?, lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser>
        searchUsers(lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs request) {
      return io.grpc.stub.ClientCalls.blockingV2ServerStreamingCall(
          getChannel(), getSearchUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult getUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserPhotoMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult updateUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserPhotoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service GrpcUsers.
   */
  public static final class GrpcUsersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GrpcUsersBlockingStub> {
    private GrpcUsersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcUsersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcUsersBlockingStub(channel, callOptions);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult postUser(lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult getUser(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult updateUser(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult deleteUser(lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser> searchUsers(
        lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult getUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserPhotoMethod(), getCallOptions(), request);
    }

    /**
     */
    public lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult updateUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserPhotoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GrpcUsers.
   */
  public static final class GrpcUsersFutureStub
      extends io.grpc.stub.AbstractFutureStub<GrpcUsersFutureStub> {
    private GrpcUsersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrpcUsersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GrpcUsersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult> postUser(
        lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult> getUser(
        lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult> updateUser(
        lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult> deleteUser(
        lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult> getUserPhoto(
        lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserPhotoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult> updateUserPhoto(
        lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserPhotoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_POST_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_SEARCH_USERS = 4;
  private static final int METHODID_GET_USER_PHOTO = 5;
  private static final int METHODID_UPDATE_USER_PHOTO = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_POST_USER:
          serviceImpl.postUser((lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult>) responseObserver);
          break;
        case METHODID_SEARCH_USERS:
          serviceImpl.searchUsers((lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser>) responseObserver);
          break;
        case METHODID_GET_USER_PHOTO:
          serviceImpl.getUserPhoto((lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult>) responseObserver);
          break;
        case METHODID_UPDATE_USER_PHOTO:
          serviceImpl.updateUserPhoto((lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs) request,
              (io.grpc.stub.StreamObserver<lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPostUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser,
              lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult>(
                service, METHODID_POST_USER)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs,
              lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult>(
                service, METHODID_GET_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs,
              lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs,
              lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getSearchUsersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs,
              lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser>(
                service, METHODID_SEARCH_USERS)))
        .addMethod(
          getGetUserPhotoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs,
              lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult>(
                service, METHODID_GET_USER_PHOTO)))
        .addMethod(
          getUpdateUserPhotoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs,
              lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult>(
                service, METHODID_UPDATE_USER_PHOTO)))
        .build();
  }

  private static abstract class GrpcUsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrpcUsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return lab5.server.grpc.generated_java.UsersProtoBuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrpcUsers");
    }
  }

  private static final class GrpcUsersFileDescriptorSupplier
      extends GrpcUsersBaseDescriptorSupplier {
    GrpcUsersFileDescriptorSupplier() {}
  }

  private static final class GrpcUsersMethodDescriptorSupplier
      extends GrpcUsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GrpcUsersMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GrpcUsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrpcUsersFileDescriptorSupplier())
              .addMethod(getPostUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getSearchUsersMethod())
              .addMethod(getGetUserPhotoMethod())
              .addMethod(getUpdateUserPhotoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
