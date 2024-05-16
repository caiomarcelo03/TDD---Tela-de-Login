package loginscreen;

/**
* A simple class for user authentication, simulating a user database.
*/

import java.util.HashMap;
import java.util.Map;

public class LoginScreen {
	private Map<String, String> userDatabase;
	
	/**
	 * Constructs a new LoginScreen instance and initializes the user database. For
	 * example purposes, it preloads the database with some sample users.
	 */
	
	public LoginScreen() {
		userDatabase = new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}
	
	/**
	 * Attemtps to authenticate a user based on their usrname and password.
	 * 
	 * @param username The username of the user attemptin to login.
	 * @param password The password entered by the user.
	 * @return {@code true} if authentication is successfull, {@code false}
	 *         otherwise
	 */



	public boolean login(String username, String password) {
		if (userDatabase.containsKey(username)) {
			String storedPassword = userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true; // Authentication succesful
			}
		}
		return false; // Authentication failed
	}
	
	
	/**
	 *  Adds a new user to the user database. Plese note that this method is not
	 *  recommended for use in a production enviroment as it lacks proper security
	 *  measures
	 * @param username The username of the new user.
	 * @param password The passowrd of the new user.
	 */
	
	public void addUser(String username, String password) {

		userDatabase.put(username, password);

	}

}