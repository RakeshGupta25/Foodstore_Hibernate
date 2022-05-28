package com.foodstore.dao;

import java.util.List;

import com.foodstore.pojo.Food;

public interface FoodDao {
	
	boolean add(Food food);
	boolean update(Food food);
	boolean delete(int foodId);
	List<Food> all();
	Food get(int foodId);
	
	

}
