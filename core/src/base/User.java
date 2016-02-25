package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class User implements Managable{

	private String id;
	private String password;
	protected HashMap<String,Item> items= new HashMap<String,Item>();
	protected HashMap<String,Outfit> outfits= new HashMap<String,Outfit>();
	protected HashMap<String,Season> seasons= new HashMap<String,Season>();
	protected HashMap<String,Category> categories= new HashMap<String,Category>();
	
	
	User(String _id, String _password)
	{
		setId(_id);
		setPassword(_password);
	}

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
	private boolean setPassword(String _password)
	{
		//TODO checking
		password=_password;
		return true;
	}
	public String getPassword()
	{
		return password;
	}

	@Override
	public boolean addItem(String _id, String _description, ArrayList<Item> _subitems, ArrayList<Category> _categories, ArrayList<Season> _seasons) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addOutfit(String _id, String _description, ArrayList<Item> _items, ArrayList<Category> _categories, ArrayList<Season> _seasons)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addCategory(String _id, String _description, ArrayList<Category> _noMixCategories, Category _supCategory) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSeason(String _id, String _description, int _wind, HashMap<String, String> _dates, HashMap<String, String> _temps,
			HashMap<String, String> _precs)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Outfit getRandomOutfit(Season season, OutfitType type)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<String, Wearable> getWearableSortedBy(HashMap<String, Wearable> _elem, SortType _stype, SortDir _sdir)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Wearable> getWearableFromSeason(HashMap<String, Wearable> _elem, Season season) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Wearable> getWearableFromCategory(HashMap<String, Wearable> _elem, Category category) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteWearable(Wearable _elem) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean markWearable(Wearable _elem) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rateWearable(Wearable _elem, int rate) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
}
