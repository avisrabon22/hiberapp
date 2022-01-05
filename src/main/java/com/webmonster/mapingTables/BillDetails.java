package com.webmonster.mapingTables;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class BillDetails {
	public static void main(String[] args) {

		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		UsersPro krishna = new UsersPro();
		krishna.setUserID(1);
		krishna.setUsername("kishu007");

//		**************************************

		Product pro = new Product();
		pro.setProductId(2);
		pro.setProductName("Body Spray");
		pro.setUsers(krishna);

		Product pro1 = new Product();
		pro1.setProductId(3);
		pro1.setProductName("T-Shirt");
		pro1.setUsers(krishna);

		Product pro2 = new Product();
		pro2.setProductId(4);
		pro2.setProductName("Air-buds");
		pro2.setUsers(krishna);

		List<Product> pros = new ArrayList<Product>();
		pros.add(pro);
		pros.add(pro1);
		pros.add(pro2);
		krishna.setProds(pros);
		
		
		
		

		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		session.save(krishna);
		session.save(pro);
		session.save(pro1);
		session.save(pro2);

		tr.commit();

//fetching **************************************************
//		UsersPro newUser = session.get(UsersPro.class, 1);
//		System.out.println(newUser.getUserID());
//		System.out.println(newUser.getUsername());

		session.close();
		factory.close();
	}

}
