package base;

import java.util.ArrayList;

public interface Wearable {
	ArrayList<Category> getCategories();
	ArrayList<Season> getSeasons();
	int getRate();
	boolean isCategory(Category cat);
	boolean isSeason(Season sea);
}
