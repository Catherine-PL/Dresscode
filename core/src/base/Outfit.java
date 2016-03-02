package base;

import java.util.ArrayList;
import java.io.Serializable;

public class Outfit implements Wearable, Serializable {
	private String id;
	private String description;
	private int rate;
	protected ArrayList<Category> categories = new ArrayList<Category>();
	protected ArrayList<Season> seasons = new ArrayList<Season>();
	protected ArrayList<Item> items = new ArrayList<Item>();
	protected ArrayList<String> wear_history = new ArrayList<String>();
	
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
	@Override
	public ArrayList<Category> getCategories()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Season> getSeasons()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRate() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isCategory(Category cat) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSeason(Season sea) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
