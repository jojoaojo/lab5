package lab5.clients.java;

import java.net.URI;

import lab5.Discovery;

/* 
 * This class exemplifies a generic client factory. 
 * Check Clients.java to see how it can be instantiated.
 * 
*/
public abstract class AbstractClientFactory<T> implements ClientFactory<T> {

	private static final String REST = "/rest";
	private static final String GRPC = "/grpc";
	private static final Object DOMAIN_DELIMITER = "@";

	private final String serviceName;
	
	public AbstractClientFactory( String serviceName) {
		this.serviceName = serviceName;
	}
	
	public T get(String domain) {
		var sn = "%s%s%s".formatted(serviceName, DOMAIN_DELIMITER, domain);
		return newClient(Discovery.knownUrisOf(sn, 1)[0] );
	}
	
	private T newClient( URI serverURI ) {
		var path = serverURI.getPath();
		if (path.endsWith(REST))
			return createRestClient( serverURI );
		if (path.endsWith(GRPC))
			return createGrpcClient( serverURI );		
		throw new RuntimeException("Unknown service type..." + serverURI);	
	}
		
	abstract T createRestClient( URI serverURI );

	abstract T createGrpcClient( URI serverURI );
}
