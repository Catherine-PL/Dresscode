package base;

import java.util.HashMap;

public class UserManager {
	private User loggedUser;
	protected HashMap<String,User> users= new HashMap<String,User>();
	
	
	boolean createUser(String _id, String _password)
	{
	//TODO
		return false;
	}
	boolean deleteUser(User user)
	{
	//TODO
		return false;
	}
	
	boolean loginUser(String _id, String _password)
	{
	//TODO
		return false;
	}
	
	boolean logoutUser()
	{
	//TODO
		return false;
	}
}
