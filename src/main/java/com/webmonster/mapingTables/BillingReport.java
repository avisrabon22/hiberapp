package com.webmonster.mapingTables;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class BillingReport {

	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		UsersPro user=(UsersPro)session.get(UsersPro.class, 1);
		System.out.println("Username:"+user.getUserID()+"."+user.getUsername());
		System.out.println("Your products: ");
		for (Product products:user.getProds()) {
			System.out.println(products.getProductId()+":"+products.getProductName());
			
		}
		
		
		
		tr.commit();
		session.close();
		factory.close();
	}
	
	
	
}
