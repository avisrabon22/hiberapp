package com.webmonster.hiberCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.webmonster.mapmanytomany.EmpDetails;

//Start class**************************
public class SecondLevel {
//Main &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		// Session**************************************************************
		Session session = factory.openSession();
//	First*****************************
		EmpDetails emp = session.get(EmpDetails.class, 1);
		System.out.println(emp.getEmpName());
		session.close();

		Session session2 = factory.openSession();
//	Second*******************************
		EmpDetails emp1 = session2.get(EmpDetails.class, 1);
		System.out.println(emp1.getEmpName());
		session2.close();

	}
}
