package model;

import org.bson.types.ObjectId;

public class Category {
	private ObjectId category_id;
	private String categoryName;
	
//defult constructor	
	public Category() {
		super();
	}

//parameterized constructor
	public Category(ObjectId category_id, String categoryName) {
		super();
		this.category_id = category_id;
		this.categoryName = categoryName;
	}


	public ObjectId getCategory_id() {
		return category_id;
	}

// getter and setter
	public void setCategory_id(ObjectId category_id) {
		this.category_id = category_id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}
