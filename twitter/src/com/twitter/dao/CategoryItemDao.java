package com.twitter.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import com.twitter.model.CategoryItem;
//our DAO class
public class CategoryItemDao {
	private static CategoryItemDao instance = new CategoryItemDao();
	private Map<String, List<CategoryItem>> categoryItems;	
	private CategoryItemDao(){		
		categoryItems = new HashMap<String, List<CategoryItem>>();
		List<CategoryItem> romance = new ArrayList<CategoryItem>();
		romance.add(new CategoryItem("romantic I say", "url for rom1", "/resources/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom2", "url for rom2", "/resources/images/rom2.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom3", "/resources/images/rom3.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom4", "/resources/images/rom4.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom5", "/resources/images/rom2.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom6", "/resources/images/rom6.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom7", "/resources/images/rom7.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom8", "/resources/images/rom8.jpg"));
		categoryItems.put("romance", romance);
		List<CategoryItem> commedy = new ArrayList<CategoryItem>();
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm1.jpg"));
		commedy.add(new CategoryItem("Desc for rom2", "url for rom2", "/resources/images/comm2.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm3.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm4.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm5.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm6.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm7.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/comm8.jpg"));
		categoryItems.put("commedy", commedy);
		List<CategoryItem> sciFiction = new ArrayList<CategoryItem>();
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom2", "url for rom2", "/resources/images/sci2.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci3.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci4.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci5.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci6.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci7.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sci8.jpg"));
		categoryItems.put("sciFiction", sciFiction);
		List<CategoryItem> sitCom = new ArrayList<CategoryItem>();
		sitCom.add(new CategoryItem("Desc for rom1", "url for sitcome1","/resources/images/sitcome1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom2", "url for rom2", "/resources/images/sitcome2.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sitcome3.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sitcome4.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sitcome5.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sitcome6.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sitcome7.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resources/images/sitcome8.jpg"));
		categoryItems.put("sitCom", sitCom);
	}
	
	public static CategoryItemDao getInstance(){
		return instance;
	}
	
	
	public List<CategoryItem> getCategoryItems(String categoryName){
		return categoryItems.get(categoryName);
	}

}
