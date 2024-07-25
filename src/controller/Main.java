package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.bson.types.ObjectId;

import model.Category;

public class Main {

	public static void main(String[] args) throws IOException {
		BugTrackingController controller = new BugTrackingController();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("BugTrackingsystem");
			System.out.println("1.Add Category");
			System.out.println("2.List All Categories");
			System.out.println("3.update Category");
			System.out.println("4.delete Category");
			System.out.println("5.Exit");
			
			
			int choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Enter categoryName");
				String categoryName = br.readLine();
				controller.addCategory(new Category(null,categoryName));
				break;
				
			case 2:
				List<Category> categories = controller.getAllCategories();
				categories.forEach(category->System.out.println("ID:"
						+category.getCategory_id()+"Name:"
						 +category.getCategoryName()));
				break;
			case 3:
				System.out.println("Enter category ID:");
				String categoryId = br.readLine();
				System.out.println("Enter new category name:");
				String name = br.readLine();
				controller.updateCategory(new Category(new ObjectId(categoryId),name));
				break;
			
			case 4:
				
			
				
			}
		}
	}

}
