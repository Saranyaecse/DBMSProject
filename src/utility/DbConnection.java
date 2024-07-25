package utility;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class DbConnection {
	
	public static MongoDatabase getDatabase(String dbName)
	{
		MongoClient mongoClient = new MongoClient("localhost",27017);
		MongoDatabase db = mongoClient.getDatabase(dbName);
		return db;
	}
	
}
