package controller;

import java.util.List;

import com.mongodb.DB;
import com.mongodb.client.MongoDatabase;

import dao.CategoryDAO;
import model.Category;
import utility.DbConnection;
 
public class BugTrackingController {
	
	private final CategoryDAO categoryDAO;
	public BugTrackingController()
	{
		MongoDatabase db = DbConnection.getDatabase("BugTrackingSystem");
		this.categoryDAO = new CategoryDAO(db);
	}
	
	public void addCategory(Category category)
	{
		categoryDAO.addCategory(category);
	}
	
	public  List<Category> getAllCategories()
	{
		return categoryDAO.getAllCategories();
	}
	
	public void updateCategory(Category category)
	{
		categoryDAO.updateCategory(category);
	}
}
