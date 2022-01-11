package com.webmonster.pagi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Pagination {
	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		
		
		
		
		
		
		
		session.close();
		factory.close();
	}
	
	
	
}
