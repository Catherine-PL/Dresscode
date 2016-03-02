package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;

public class Season implements Serializable {
	private String id;
	private String description;
	private int wind;
	protected HashMap<String,String> dates = new HashMap<String,String>();
	protected HashMap<String,String> temperatures = new HashMap<String,String>();
	protected HashMap<String,String> precipitations = new HashMap<String,String>();
	protected ArrayList<Item> items = new ArrayList<Item>();
	protected ArrayList<Outfit> outfits = new ArrayList<Outfit>();
	
	
	boolean delete()
	{
		//TODO
		return false;
	}
	
	public String getId()
	{
		return id;
	}
	private boolean setId(String _id)
	{
		//TODO checking
		id=_id;
		return true;
	}
	public String getDesription()
	{
		return description;
	}
	private boolean setDescription(String _desc)
	{
		//TODO checking
		description=_desc;
		return true;
	}
}
