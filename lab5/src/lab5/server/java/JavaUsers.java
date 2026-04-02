package lab5.server.java;

import java.util.List;
import java.util.logging.Logger;

import lab5.api.User;
import lab5.api.java.Result;
import lab5.api.java.Result.ErrorCode;
import lab5.api.java.Users;
import lab5.server.persistence.Hibernate;

public class JavaUsers implements Users {

	private static Logger Log = Logger.getLogger(JavaUsers.class.getName());

	private Hibernate hibernate;

	public JavaUsers() {
		hibernate = Hibernate.getInstance();
	}

	@Override
	public Result<String> postUser(User user) {
		Log.info("createUser : " + user);

		// Check if user data is valid
		if (user.getName() == null || user.getPwd() == null || user.getDisplayName() == null
				|| user.getDomain() == null) {
			Log.info("User object invalid.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		try {
			hibernate.persist(user);
		} catch (Exception e) {
			e.printStackTrace(); //Most likely the exception is due to the user already existing...
			Log.info("User already exists.");
			return Result.error(ErrorCode.CONFLICT);
		}

		return Result.ok(user.getName());
	}

	@Override
	public Result<User> getUser(String userId, String password) {
		Log.info("getUser : user = " + userId + "; pwd = " + password);

		// Check if user is valid
		if (userId == null || password == null) {
			Log.info("UserId or password null.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		User user = null;
		try {
			user = hibernate.get(User.class, userId);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		// Check if user exists and password is correct...
		if (user == null || !user.getPwd().equals(password)) {
			Log.info("Password is incorrect");
			return Result.error(ErrorCode.FORBIDDEN);
		}

		return Result.ok(user);

	}

	@Override
	public Result<User> updateUser(String userId, String password, User user) {
		Log.info("updateUser : user = " + userId + "; pwd = " + password);

		// Check if parameters are valid
		if (userId == null || password == null) {
			Log.info("UserId or password null.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		User existingUser = null;
		try {
			existingUser = hibernate.get(User.class, userId);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		// Check if user exists and password is correct
		if (existingUser == null) {
			Log.info("User not found.");
			return Result.error(ErrorCode.NOT_FOUND);
		}

		if (!existingUser.getPwd().equals(password)) {
			Log.info("Password is incorrect.");
			return Result.error(ErrorCode.FORBIDDEN);
		}

		// Update fields if provided (non-null)
		if (user.getPwd() != null)
			existingUser.setPwd(user.getPwd());
		if (user.getDisplayName() != null)
			existingUser.setDisplayName(user.getDisplayName());
		if (user.getPhoneNumbers() != null)
			existingUser.setPhoneNumbers(user.getPhoneNumbers());
		if (user.getPhoto() != null)
			existingUser.setPhoto(user.getPhoto());

		try {
			hibernate.update(existingUser);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		return Result.ok(existingUser);
	}

	@Override
	public Result<User> deleteUser(String userId, String password) {
		Log.info("deleteUser : user = " + userId + "; pwd = " + password);

		// Check if parameters are valid
		if (userId == null || password == null) {
			Log.info("UserId or password null.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		User user = null;
		try {
			user = hibernate.get(User.class, userId);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		// Check if user exists and password is correct
		if (user == null) {
			Log.info("User not found.");
			return Result.error(ErrorCode.NOT_FOUND);
		}

		if (!user.getPwd().equals(password)) {
			Log.info("Password is incorrect.");
			return Result.error(ErrorCode.FORBIDDEN);
		}

		try {
			hibernate.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		return Result.ok(user);
	}

	@Override
	public Result<List<User>> searchUsers(String pattern) {
		Log.info("searchUsers : pattern = " + pattern);

		// Check if pattern is valid
		if (pattern == null) {
			Log.info("Pattern is null.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		try {
			// Search for users where name contains pattern (case-insensitive)
			// Using JPQL with string formatting (safe with proper escaping)
			String jpqlQuery = String.format("SELECT u FROM User u WHERE LOWER(u.name) LIKE LOWER('%%%s%%')", 
					pattern.replace("'", "''"));
			List<User> users = hibernate.jpql(jpqlQuery, User.class);

			// Set password to empty string for all users
			users.forEach(u -> u.setPwd(""));

			return Result.ok(users);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}
	}

	@Override
	public Result<byte[]> getUserPhoto(String name, String pwd) {
		Log.info("getUserPhoto : user = " + name);

		// Check if parameters are valid
		if (name == null || pwd == null) {
			Log.info("Name or password null.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		User user = null;
		try {
			user = hibernate.get(User.class, name);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		// Check if user exists
		if (user == null) {
			Log.info("User not found.");
			return Result.error(ErrorCode.NOT_FOUND);
		}

		// Check if password is correct
		if (!user.getPwd().equals(pwd)) {
			Log.info("Password is incorrect.");
			return Result.error(ErrorCode.FORBIDDEN);
		}

		// Check if user has a photo
		if (user.getPhoto() == null || user.getPhoto().length == 0) {
			Log.info("User has no photo.");
			return Result.error(ErrorCode.NOT_FOUND);
		}

		return Result.ok(user.getPhoto());
	}

	@Override
	public Result<User> updateUserPhoto(String name, String pwd, byte[] photo) {
		Log.info("updateUserPhoto : user = " + name);

		// Check if parameters are valid
		if (name == null || pwd == null || photo == null) {
			Log.info("Name, password or photo null.");
			return Result.error(ErrorCode.BAD_REQUEST);
		}

		User user = null;
		try {
			user = hibernate.get(User.class, name);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		// Check if user exists
		if (user == null) {
			Log.info("User not found.");
			return Result.error(ErrorCode.NOT_FOUND);
		}

		// Check if password is correct
		if (!user.getPwd().equals(pwd)) {
			Log.info("Password is incorrect.");
			return Result.error(ErrorCode.FORBIDDEN);
		}

		// Update photo
		user.setPhoto(photo);

		try {
			hibernate.update(user);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error(ErrorCode.INTERNAL_ERROR);
		}

		return Result.ok(user);
	}

}
