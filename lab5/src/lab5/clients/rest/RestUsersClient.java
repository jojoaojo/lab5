package lab5.clients.rest;

import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lab5.api.User;
import lab5.api.java.Result;
import lab5.api.java.Result.ErrorCode;
import lab5.api.java.Users;
import lab5.api.rest.RestUsers;

public class RestUsersClient extends RestClient implements Users {

	private static Logger Log = Logger.getLogger(RestUsersClient.class.getName());
		
	public RestUsersClient( URI serverURI ) {
		super( serverURI, Log );
		
		target = super.target.path( RestUsers.PATH );
	}
		
	public Result<String> postUser(User user) {		
		return super.reTry( () -> doPostUser( user ) );
		
	}

	public Result<User> getUser(String userId, String pwd) {
		return super.reTry( () -> doGetUser( userId, pwd ));
	}

	
	private Result<String> doPostUser(User user) {
		Response r = target.request()
				.accept( MediaType.APPLICATION_JSON)
				.post(Entity.entity(user, MediaType.APPLICATION_JSON));
				
		return super.processResponse(r, String.class);
	}
	
	
	private Result<User> doGetUser(String userId, String pwd) {
		Response r = target.path( userId )
				.queryParam(RestUsers.PWD, pwd).request()
				.accept(MediaType.APPLICATION_JSON)
				.get();

		return super.processResponse( r, User.class );
	}

	public Result<User> updateUser(String userId, String password, User user) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());		
	}

	public Result<User> deleteUser(String userId, String password) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());		
	}

	public Result<List<User>> searchUsers(String pattern) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());		
	}

	public Result<byte[]> getUserPhoto(String name, String pwd) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());		
	}

	public Result<User> updateUserPhoto(String name, String pwd, byte[] photo) {
		throw new RuntimeException(ErrorCode.NOT_IMPLEMENTED.toString());		
	}	
}
