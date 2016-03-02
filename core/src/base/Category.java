package base;

import java.util.ArrayList;
import java.io.Serializable;

public class Category implements Serializable {
	private String id;
	private String description;
	private Category superCategory;
	protected ArrayList<Category> noMixCategories = new ArrayList<Category>();
	protected ArrayList<Category> subCategories = new ArrayList<Category>();
	protected ArrayList<Item> items = new ArrayList<Item>();
	protected ArrayList<Outfit> outfits = new ArrayList<Outfit>();
	
	
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
	
	boolean delete()
	{
		//TODO
		return false;
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
