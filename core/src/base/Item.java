package base;

import java.util.ArrayList;

public class Item implements Wearable{
	ArrayList<Category> categories = new ArrayList<Category>();
	ArrayList<Season> seasons = new ArrayList<Season>();
	
	@Override
	public ArrayList<Category> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Season> getSeasons() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isCategory(Category cat) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isSeason(Season sea) {
		// TODO Auto-generated method stub
		return false;
	}

}
