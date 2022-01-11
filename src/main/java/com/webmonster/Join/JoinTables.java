package com.webmonster.Join;

import java.util.Arrays;
import java.util.List;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JoinTables {

	public static void main(String[] args) {
//		String delete = "delete from EmpDetails where empID=?";
		String join = "select emp.empID, emp.empName, pros.ProName from EmpDetails as emp INNER JOIN emp.projects as pros";
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

//        @SuppressWarnings("rawtypes")
//			org.hibernate.Query query=session.createQuery(delete);	

		Query query=session.createQuery(join);
		List<Object []> empdetails=query.getResultList();
		
		for (Object [] listEmp:empdetails) {
	       System.out.println(Arrays.toString(listEmp));
		}
		
		
		
		
		
		session.close();
		factory.close();
	}

}
