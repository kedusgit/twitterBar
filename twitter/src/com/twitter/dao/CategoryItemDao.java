package com.twitter.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import com.twitter.model.CategoryItem;

public class CategoryItemDao {
	private static CategoryItemDao instance = new CategoryItemDao();
	private Map<String, List<CategoryItem>> categoryItems;	
	private CategoryItemDao(){		
		categoryItems = new HashMap<String, List<CategoryItem>>();
		List<CategoryItem> romance = new ArrayList<CategoryItem>();
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom2", "url for rom2", "/resrouce/images/rom2.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		romance.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		categoryItems.put("romance", romance);
		List<CategoryItem> commedy = new ArrayList<CategoryItem>();
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		commedy.add(new CategoryItem("Desc for rom2", "url for rom2", "/resrouce/images/rom2.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		commedy.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		categoryItems.put("commedy", commedy);
		List<CategoryItem> sciFiction = new ArrayList<CategoryItem>();
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom2", "url for rom2", "/resrouce/images/rom2.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sciFiction.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		categoryItems.put("sciFiction", sciFiction);
		List<CategoryItem> sitCom = new ArrayList<CategoryItem>();
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom2", "url for rom2", "/resrouce/images/rom2.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		sitCom.add(new CategoryItem("Desc for rom1", "url for rom1", "/resrouce/images/rom1.jpg"));
		categoryItems.put("sitCom", sitCom);
	}
	
	public static CategoryItemDao getInstance(){
		return instance;
	}
	
	public List<CategoryItem> getCategoryItems(String categoryName){
		return categoryItems.get(categoryName);
	}

}
