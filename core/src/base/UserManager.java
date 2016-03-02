package base;

import java.util.Arrays;
import java.util.HashMap;
import java.io.Serializable;

public class UserManager implements Serializable{
	private User loggedUser;
	protected HashMap<String,User> users= new HashMap<String,User>();
	
	
	public int createUser(String _id, String _password, String _password2)
	{
		if(!(_password.equals(_password2))) return 1;
		if(users.containsKey(_id)) return 2;
		users.put(_id,new User(_id,_password));
		return 0;
	}
	public  boolean deleteUser(User user)
	{
	//TODO
		return false;
	}
	
	public int loginUser(String _id, String _password)
	{
	//TODO
		//check if user exists
		if(!(users.containsKey(_id))) return 2;
		//check password
		if(!(users.get(_id).getPassword().equals(_password))) return 1;
		loggedUser=users.get(_id);
		return 0;
	}
	
	public boolean logoutUser()
	{
	//TODO
		return false;
	}
}
