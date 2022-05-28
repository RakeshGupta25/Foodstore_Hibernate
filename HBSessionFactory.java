package com.foodstore.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBSessionFactory {
	
	private static SessionFactory factory;
	
	public static SessionFactory getFactory()
	{
		if(factory==null)
		{
			Configuration config = new Configuration().configure();
			factory = config.buildSessionFactory();
		}
		return factory;
	}

}
