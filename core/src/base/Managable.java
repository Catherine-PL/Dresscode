package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public interface Managable {
	
	public enum OutfitType {
	    EXISTING, NEW 
	}
	public enum SortType {
	    ID,CATEGORY,SEASON,RATE,WEAR_HISTORY 
	}
	public enum SortDir {
	    ASCENDING, DESCENDING
	}
	
	boolean addItem(String _id, String _description, ArrayList<Item> _subitems,  ArrayList<Category> _categories, ArrayList<Season> _seasons);
	boolean addOutfit(String _id, String _description, ArrayList<Item> _items,  ArrayList<Category> _categories, ArrayList<Season> _seasons);
	boolean addCategory(String _id, String _description, ArrayList<Category> _noMixCategories, Category  _supCategory);
	boolean addSeason(String _id, String _description, int _wind, HashMap<String,String> _dates, HashMap<String,String> _temps,
			HashMap<String,String> _precs);
	Outfit getRandomOutfit(Season season, OutfitType type);
	TreeMap<String,Wearable> getWearableSortedBy(HashMap<String,Wearable> _elem, SortType _stype, SortDir _sdir);
	HashMap<String,Wearable> getWearableFromSeason(HashMap<String,Wearable> _elem, Season season);
	HashMap<String,Wearable> getWearableFromCategory(HashMap<String,Wearable> _elem, Category category);
	boolean deleteWearable(Wearable _elem);
	boolean markWearable(Wearable _elem);
	boolean rateWearable(Wearable _elem, int rate);
	
}
