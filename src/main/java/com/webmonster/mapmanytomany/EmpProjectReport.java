package com.webmonster.mapmanytomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class EmpProjectReport {
	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		EmpDetails avijit = new EmpDetails();
		EmpDetails krishan = new EmpDetails();

		avijit.setEmpID(1);
		avijit.setEmpName("Avijit Maity");
		krishan.setEmpID(2);
		krishan.setEmpName("Krishna Biswas");

		ProjectDetails chatsys = new ProjectDetails();
		ProjectDetails employeesys = new ProjectDetails();

		chatsys.setProId(2002);
		chatsys.setProName("Chat System");
		employeesys.setProId(3003);
		employeesys.setProName("Employee System");

		List<EmpDetails> employees = new ArrayList<EmpDetails>();
		List<ProjectDetails> projects = new ArrayList<ProjectDetails>();

		employees.add(avijit);
		employees.add(krishan);
//		*******************************
		projects.add(chatsys);
		projects.add(employeesys);

		// Assigns********************************
		avijit.setProjects(projects);
		krishan.setProjects(projects);

		// Session**************************************************************
		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();
//	Save section****************************************************	
		session.save(avijit);
		session.save(krishan);
		session.save(chatsys);
		session.save(employeesys);

//	Close section**************************************************
		tr.commit();
		session.close();
		factory.close();
	}

}
