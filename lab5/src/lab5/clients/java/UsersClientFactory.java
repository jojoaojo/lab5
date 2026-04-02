package lab5.clients.java;

import java.net.URI;

import lab5.Discovery;
import lab5.api.User;
import lab5.api.java.Result;
import lab5.api.java.Users;
import lab5.clients.grpc.GrpcUsersClient;
import lab5.clients.rest.RestUsersClient;

/* 
 * This class exemplifies a non-generic client factory for a specific service.
 * 
*/
public class UsersClientFactory {

	private static final String REST = "/rest";
	private static final String GRPC = "/grpc";
	private static final Object DOMAIN_DELIMITER = "@";
		
	static public Users get(String domain) {
		var sn = "%s%s%s".formatted(Users.SERVICE_NAME, DOMAIN_DELIMITER, domain);
		return newClient(Discovery.knownUrisOf(sn, 1)[0] );
	}
	
	static private Users newClient( URI serverURI ) {
		var path = serverURI.getPath();
		if (path.endsWith(REST))
			return new RestUsersClient(serverURI);
		if (path.endsWith(GRPC))
			return new GrpcUsersClient(serverURI);
		throw new RuntimeException("Unknown service type..." + serverURI);	
	}
	
	
	public static void main(String[] args ) {
		
		Users client = UsersClientFactory.get("some_domain");
		
		Result<User> u = client.getUser("name", "pwd");
		
		if( u.isOK() )
			System.out.println("Got user: " + u.value() );
		else
			System.out.println("Got error:" + u.error() );
	}
}
