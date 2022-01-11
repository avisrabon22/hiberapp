package com.webmonster.hql;

import java.util.List;

import org.hibernate.cfg.Configuration;

import com.webmonster.mapmanytomany.EmpDetails;

//import com.mysql.cj.Query;

//import com.mysql.cj.Session;

public class Hql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		org.hibernate.Session session = factory.openSession();

		
		String hql = "from EmpDetails where empID=:myempID";
		@SuppressWarnings("rawtypes")
		org.hibernate.query.Query Q = session.createQuery(hql);

		Q.setParameter("myempID", 2);

		@SuppressWarnings("unchecked")
		List<EmpDetails> list = Q.list();

		for (EmpDetails employees : list) {
			System.out.println(employees.getEmpID() + ":" + employees.getEmpName());
		}

		
		
		session.close();
		factory.close();
	}

}
