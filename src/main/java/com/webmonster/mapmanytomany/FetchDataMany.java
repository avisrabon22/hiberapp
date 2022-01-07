package com.webmonster.mapmanytomany;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchDataMany {

	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		// Session**************************************************************
		Session session = factory.openSession();
//		org.hibernate.Transaction tr = session.beginTransaction();

//		Fetching***************************************************
		EmpDetails emps = session.get(EmpDetails.class, 1);
		System.out.println(emps.getEmpName());

//		for (ProjectDetails projects : emps.getProjects()) {
//
//			System.out.println(projects.getProName());
//
//		}

		
		
		session.close();
		factory.close();
	}
}
