package base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer {

	public static void serializeUserManager(UserManager userManager){
		   
		
		   try{  
			FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir")+"\\usermanager.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject( userManager);
			oos.close();
			System.out.println("UserManager serialized");
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
		   }
	   }
	
	public static UserManager deserialzeUserManager(){
		   
		UserManager userManager;
		 
		   try{
			    
			   FileInputStream fin = new FileInputStream(System.getProperty("user.dir")+"\\usermanager.ser");
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   userManager = (UserManager) ois.readObject();
			   ois.close();
			  
			   return userManager;
			   
		   }catch(Exception ex){
			   ex.printStackTrace();
			   return null;
		   } 
	   } 
	
}
