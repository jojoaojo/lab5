package lab5.server.grpc;

import static lab5.server.util.DataModelAdaptor.GrpcUser_to_User;
import static lab5.server.util.DataModelAdaptor.User_to_GrpcUser;

import io.grpc.BindableService;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import lab5.api.java.Result.ErrorCode;
import lab5.api.java.Users;
import lab5.server.grpc.generated_java.GrpcUsersGrpc;
import lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserResult;
import lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoResult;
import lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult;
import lab5.server.grpc.generated_java.UsersProtoBuf.GrpcUser;
import lab5.server.grpc.generated_java.UsersProtoBuf.PostUserResult;
import lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoResult;
import lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserResult;
import lab5.server.java.JavaUsers;

public class GrpcUsersController extends GrpcController implements GrpcUsersGrpc.AsyncService, BindableService {

	Users impl = new JavaUsers();

	@Override
	public final ServerServiceDefinition bindService() {
		return GrpcUsersGrpc.bindService(this);
	}

	public void postUser(GrpcUser user, StreamObserver<PostUserResult> responseObserver) {
		super.toGrpcResult(responseObserver, impl.postUser(GrpcUser_to_User(user)),
				(userAddress) -> PostUserResult.newBuilder().setUserAddress(userAddress).build());
	}

	@Override
	public void getUser(GetUserArgs request, StreamObserver<GetUserResult> responseObserver) {
		super.toGrpcResult(responseObserver, impl.getUser(request.getName(), request.getPwd()),
				(user) -> GetUserResult.newBuilder().setUser(User_to_GrpcUser(user)).build());
	}

	@Override
	public void updateUser(UpdateUserArgs request, StreamObserver<UpdateUserResult> responseObserver) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());
	}

	@Override
	public void deleteUser(DeleteUserArgs request, StreamObserver<DeleteUserResult> responseObserver) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());
	}

	@Override
	public void searchUsers(SearchUsersArgs request, StreamObserver<GrpcUser> responseObserver) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());
	}

	@Override
	public void getUserPhoto(GetUserPhotoArgs request, StreamObserver<GetUserPhotoResult> responseObserver) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());
	}

	@Override
	public void updateUserPhoto(UpdateUserPhotoArgs request, StreamObserver<UpdateUserPhotoResult> responseObserver) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());
	}
}
