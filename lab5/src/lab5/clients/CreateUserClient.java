package lab5.clients;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.logging.Logger;

import lab5.api.User;
import lab5.api.java.Result;
import lab5.api.java.Users;
import lab5.clients.java.Clients;

public class CreateUserClient {

	private static Logger Log = Logger.getLogger(CreateUserClient.class.getName());
	
	public static void main(String[] args) throws IOException {
		if( args.length < 5) {
			System.err.println( "Use: java " + CreateUserClient.class.getCanonicalName() + "name pwd displayName domain photo phonenumber1 phonenumber2 ... ");
			return;
		}
		
		String name = args[0];
		String pwd = args[1];
		String displayName = args[2];
		String domain = args[3];
		String filename = args[4];
		String[] phoneNumbers = Arrays.copyOfRange(args, 5, args.length);


		Path photoFilePath = Paths.get(filename);

		if(!Files.exists(photoFilePath)) {
			System.err.println("File " + filename + " does not exist.");
			System.exit(1);
		}

		byte[] photoData = Files.readAllBytes(photoFilePath);

		if(photoData.length == 0) {
			System.err.println("File " + filename + " has zero bytes (empty file).");
			System.exit(1);
		}

		User usr = new User( name, pwd, displayName, domain, photoData, Set.of(phoneNumbers ));
		
		Users client = Clients.UsersClient.get(domain);
				
		Result<String> result = client.postUser( usr );
		if( result.isOK()  )
			Log.info("Created user:" + result.value() );
		else
			Log.info("Create user failed with error: " + result.error());

	}
	
}

