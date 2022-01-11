package com.webmonster.hiberCache;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.webmonster.mapmanytomany.EmpDetails;

public class FirstLevel {

	public static void main(String[] args) {
		String qr = "select * from EmpDetails";
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		// Session**************************************************************
		Session session = factory.openSession();
	
	
	EmpDetails emp=session.get(EmpDetails.class,2);
	System.out.println(emp.getEmpName());
	System.out.println("Worked worked worked...");
	
	EmpDetails emp1=session.get(EmpDetails.class, 2);
	System.out.println(emp1.getEmpName());
	
	System.out.println(session.contains(emp1));
	
	
	session.close();
	}
	
	
}
