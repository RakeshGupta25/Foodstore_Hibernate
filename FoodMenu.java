package com.foodstore.test;

import java.util.List;
import java.util.Scanner;

import com.foodstore.dao.FoodDao;
import com.foodstore.dao.impl.FoodDaoHibernateImpl;
import com.foodstore.pojo.Food;

public class FoodMenu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		int foodId;
		double foodPrice;
		String foodName,foodType,foodDescription;
		
		
		boolean flag=false;
		Food food=null;
		FoodDao foodDao = new FoodDaoHibernateImpl();
		
		List<Food> flist = null;
		
		System.out.println("------------------------Welcome to food menu--------------------");
		
		System.out.println("1.Add Food");
		System.out.println("2.Update Food");
		System.out.println("3.Delete Food");
		System.out.println("4.Show All Food");
		System.out.println("5.Show Food By ID");
		System.out.println("Select your choice");
		
		choice = sc.nextInt();
		switch (choice) {
		case 1: {
			
			
			System.out.println("Enter Food Details ");
			System.out.println("Name:- ");
			sc.nextLine();
			foodName = sc.nextLine();
			System.out.println("Price:- ");
			foodPrice =sc.nextDouble();
			System.out.println("Type:- ");
			foodType = sc.next();
			System.out.println("Description:- ");
			sc.nextLine();
			foodDescription = sc.nextLine();
			
			
			food = new Food(foodName,foodPrice,foodType,foodDescription);
			
			flag = foodDao.add(food);
			
			if(flag)
				System.out.println("Food is Added... ");
			else
				System.out.println("Food is Not Added");
			break;
		}
		
			case 2:
				System.out.println("OLD Food Details as follow ");
				System.out.println(food);
				System.out.println("Enter Updated Food Details ");
				System.out.println("Name:- ");
				sc.nextLine();
				foodName =sc.nextLine();
				System.out.println("Price:- ");
				foodPrice = sc.nextDouble();
				System.out.println("Type:- ");
				foodType = sc.next();
				System.out.println("Description:- ");
				sc.nextLine();
				foodDescription = sc.nextLine();
				
				food = new Food(foodName,foodPrice,foodType,foodDescription);
				
				foodDao.update(food);
					
				break;
				
			case 3:
				
					System.out.println("Enter the Id of the food to Delete");
					int foodID = sc.nextInt(); 
					//foodDao.delete(foodID);
					
					food = new Food();
					
					flag = foodDao.delete(foodID);
					
					if(flag)
						System.out.println("Food is Deleted... ");
					else
						System.out.println("Food is Not Deleted");
					break;
					
					
				
					
				
			case 4:
				
				
				flist = foodDao.all();
				if(flist!=null && !flist.isEmpty())
				{
					System.out.println("-------------------------------Food List------------------------------");
					for(Food food2:flist)
					{
						System.out.println(food2);
						System.out.println("-----------------------------------------------");
					}
				}
				
				else {
					System.out.println("No food Item.........");
				}
				break;
				
				
			case 5:
				break;			
			
		
		default:
		
			System.out.println("Enter valid Input...");
		
		

	}
	}
}
