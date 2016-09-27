package com.twitter.model;

public class CategoryItem {
	private String itemDescription;
	private String itemURL;
	private String itemImageSrc;
	
	public CategoryItem(){}
	public CategoryItem(String itemDescr, String itemUrl, String itemImageSrc){
		this.itemImageSrc =itemImageSrc;
		this.itemDescription = itemDescr;
		this.itemURL = itemUrl;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemURL() {
		return itemURL;
	}
	public void setItemURL(String itemURL) {
		this.itemURL = itemURL;
	}
	public String getItemImageSrc() {
		return itemImageSrc;
	}
	public void setItemImageSrc(String itemImageSrc) {
		this.itemImageSrc = itemImageSrc;
	}
	
	

}
