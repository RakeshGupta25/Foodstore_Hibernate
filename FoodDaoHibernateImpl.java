package com.foodstore.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.foodstore.dao.FoodDao;
import com.foodstore.pojo.Food;
import com.foodstore.utility.HBSessionFactory;




public class FoodDaoHibernateImpl implements FoodDao {
	
	
	SessionFactory factory = HBSessionFactory.getFactory();
	Session session=null;
	Transaction transaction=null;

	@Override
	public boolean add(Food food) {
		
		session = factory.openSession();
		transaction = session.beginTransaction();
		
		int i =(int)session.save(food);
		
		transaction.commit();
		session.close();
		
		if(i>0)
		{
			System.out.println("Food is create with Food Id:- "+i);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Food food) {
		
		session = factory.openSession();
		transaction = session.beginTransaction();
		
		session.update(food);
		transaction.commit();
		session.close();
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(int foodId) {
		session = factory.openSession();
		transaction = session.beginTransaction();
		
		Food food = new Food();
		food.setFoodId(foodId);
		
		session.delete(food);
		
		transaction.commit();
		session.close();
		
		return true;
	}

	@Override
	public List<Food> all() {

		session = factory.openSession();
		transaction = session.beginTransaction();
		Query<Food> hqlquery = session.createQuery("from food",Food.class);
		List<Food> flist =hqlquery.list();		
		transaction.commit();
		session.close();
		
		return flist;
	}

	@Override
	public Food get(int foodId) {
		

		session = factory.openSession();
		transaction = session.beginTransaction();
		
		Food food =session.get(Food.class,foodId);
		return food;
	}

				
	

}
