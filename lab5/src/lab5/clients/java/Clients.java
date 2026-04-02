package lab5.clients.java;

import java.net.URI;

import lab5.api.java.Users;
import lab5.clients.grpc.GrpcUsersClient;
import lab5.clients.rest.RestUsersClient;

public class Clients {

	public static final ClientFactory<Users> UsersClient = new GenericClientFactory<Users>( Users.SERVICE_NAME, RestUsersClient::new, GrpcUsersClient::new );
	
	public static final ClientFactory<Users> UsersClientToo = new AbstractClientFactory<Users>( Users.SERVICE_NAME ) {

		Users createRestClient(URI serverURI) {
			return new RestUsersClient(serverURI);
		}

		Users createGrpcClient(URI serverURI) {
			return new GrpcUsersClient(serverURI);
		}
	};
}
