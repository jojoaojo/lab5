package lab5.api.rest;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import lab5.api.User;

@Path(RestUsers.PATH)
public interface RestUsers {

	final static String PATH = "/users";
	final static String QUERY = "query";
	final static String NAME = "name";
	final static String PWD = "pwd";
	final static String PHOTO = "photo";

	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	String postUser(User user);

	@GET
	@Path("/{" + NAME +"}")
	@Produces(MediaType.APPLICATION_JSON)
	User getUser(@PathParam(NAME) String name, @QueryParam(PWD) String pwd);

	@PUT
	@Path("/{" + NAME +"}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	User updateUser(@PathParam(NAME) String name, @QueryParam(PWD) String pwd, User info);

	@DELETE
	@Path("/{" + NAME + "}")
	@Produces(MediaType.APPLICATION_JSON)
	User deleteUser(@PathParam(NAME) String name, @QueryParam(PWD) String pwd);

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	List<User> searchUsers(@QueryParam(QUERY) String pattern);

	@GET
	@Path("/{" + NAME + "}/" + PHOTO)
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	byte[] getUserPhoto(@PathParam(NAME) String name, @QueryParam(PWD) String pwd);

	@PUT
	@Path("/{" + NAME + "}/" + PHOTO)
	@Consumes(MediaType.APPLICATION_OCTET_STREAM)
	@Produces(MediaType.APPLICATION_JSON)
	User updateUserPhoto(@PathParam(NAME) String name, @QueryParam(PWD) String pwd, byte[] photo);
}
