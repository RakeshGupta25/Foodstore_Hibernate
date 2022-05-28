package com.foodstore.pojo;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int foodId;
	
	private String foodName;
	private double foodPrice;
	private String foodType;
	private String foodDescription;
	
	
	
	public Food() {
		super();
		
	}
	
	



	public Food(String foodName, double foodPrice, String foodType, String foodDescription) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodType = foodType;
		this.foodDescription = foodDescription;
	}





	public Food(int foodId, String foodName, double foodPrice, String foodType, String foodDescription) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodType = foodType;
		this.foodDescription = foodDescription;
	}





	public int getFoodId() {
		return foodId;
	}



	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}



	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public double getFoodPrice() {
		return foodPrice;
	}



	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}



	public String getFoodType() {
		return foodType;
	}



	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}



	public String getFoodDescription() {
		return foodDescription;
	}



	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}





	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodType="
				+ foodType + ", foodDescription=" + foodDescription + "]";
	}
	
	
	
	
	
	
	
	
	
}
