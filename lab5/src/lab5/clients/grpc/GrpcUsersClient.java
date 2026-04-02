package lab5.clients.grpc;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

import lab5.api.User;
import lab5.api.java.Result;
import lab5.api.java.Result.ErrorCode;
import lab5.api.java.Users;
import lab5.server.grpc.generated_java.GrpcUsersGrpc;
import lab5.server.grpc.generated_java.UsersProtoBuf.GetUserArgs;
import lab5.server.grpc.generated_java.UsersProtoBuf.GetUserResult;
import lab5.server.util.DataModelAdaptor;

public class GrpcUsersClient extends GrpcClient implements Users {

	private static Logger Log = Logger.getLogger(GrpcUsersClient.class.getName());
	

	final GrpcUsersGrpc.GrpcUsersBlockingStub stub;

	public GrpcUsersClient(URI serverURI) {
		super( serverURI, Log );
		
		stub = GrpcUsersGrpc.newBlockingStub( channel );
	}

	@Override
	public Result<String> postUser(User user) {
		return super.processResponse( () -> stub.postUser(DataModelAdaptor.User_to_GrpcUser(user)).getUserAddress() );
	}

	@Override
	public Result<User> getUser(String userId, String password) {
		GetUserResult res = stub.getUser(GetUserArgs.newBuilder()
					.setName(userId).setPwd(password)
					.build());

		return super.processResponse( () -> DataModelAdaptor.GrpcUser_to_User(res.getUser()) );
	}

	@Override
	public Result<User> updateUser(String userId, String pwd, User user) {
		return super.processResponse( () -> {
			var res = stub.updateUser(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserArgs.newBuilder()
					.setName(userId).setPwd(pwd)
					.setInfo(DataModelAdaptor.User_to_GrpcUser(user))
					.build());
			return DataModelAdaptor.GrpcUser_to_User(res.getUser());
		});
	}

	@Override
	public Result<User> deleteUser(String userId, String pwd) {
		return super.processResponse( () -> {
			var res = stub.deleteUser(lab5.server.grpc.generated_java.UsersProtoBuf.DeleteUserArgs.newBuilder()
					.setName(userId).setPwd(pwd)
					.build());
			return DataModelAdaptor.GrpcUser_to_User(res.getUser());
		});
	}

	@Override
	public Result<List<User>> searchUsers(String pattern) {
		return super.processResponse( () -> {
			var iterator = stub.searchUsers(lab5.server.grpc.generated_java.UsersProtoBuf.SearchUsersArgs.newBuilder()
					.setQuery(pattern)
					.build());
			
			java.util.List<User> users = new java.util.ArrayList<>();
			iterator.forEachRemaining(grpcUser -> users.add(DataModelAdaptor.GrpcUser_to_User(grpcUser)));
			return users;
		});
	}

	@Override
	public Result<byte[]> getUserPhoto(String name, String pwd) {
		return super.processResponse( () -> {
			var res = stub.getUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.GetUserPhotoArgs.newBuilder()
					.setName(name).setPwd(pwd)
					.build());
			return res.getPhoto().toByteArray();
		});
	}

	@Override
	public Result<User> updateUserPhoto(String name, String pwd, byte[] photo) {
		return super.processResponse( () -> {
			var res = stub.updateUserPhoto(lab5.server.grpc.generated_java.UsersProtoBuf.UpdateUserPhotoArgs.newBuilder()
					.setName(name).setPwd(pwd)
					.setPhoto(com.google.protobuf.ByteString.copyFrom(photo))
					.build());
			return DataModelAdaptor.GrpcUser_to_User(res.getUser());
		});
	}

	
}
