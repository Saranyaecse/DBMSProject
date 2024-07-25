package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import model.Category;

public class CategoryDAO {
	private final MongoCollection<Document> collection;
	
	public CategoryDAO(MongoDatabase db)
	{
		this.collection = db.getCollection("category");
		
	}

	public void addCategory(Category category)
	{
		Document doc = new Document("categoryName", category.getCategoryName()); // if you add more column then use append
		collection.insertOne(doc);
	
	}
	
	public List<Category> getAllCategories()
	{
		List<Category> categories = new ArrayList<>();
		for(Document doc: collection.find())
		{
			Category category = new Category(doc.getObjectId("_id"),doc.getString("categoryName"));
			categories.add(category);
		}
		return categories;
	}
	
	public void updateCategory(Category category)
	{
		Document doc = new Document("categoryName", category.getCategoryName());
		collection.updateOne(new Document("_id", category.getCategory_id()),new Document("$set",doc));
	}
}
