package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category>categories = new ArrayList<>();
	
	static {
		Category category =new Category();
		
		// adding first category
		category.setId(1);
		category.setName("TV");
		category.setDescription("description about you");
		category.setImageUrl("CAT_1.png");
		categories.add(category);
		
category =new Category();
		
		// adding 2nd category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("description about you");
		category.setImageUrl("CAT_2.png");
		categories.add(category);
		
		
category =new Category();
		
		// adding 3rd category
		category.setId(3);
		category.setName("Loptop");
		category.setDescription("description about you");
		category.setImageUrl("CAT_3.png");
		categories.add(category);
		
category =new Category();
		
		// adding 4th category
		category.setId(4);
		category.setName("Cloth");
		category.setDescription("description about you");
		category.setImageUrl("CAT_4.png");
		categories.add(category);
	
	}
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
