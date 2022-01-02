package com.webmonster.mapingTables;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class BillDetails {
	public static void main(String[] args) {

		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		UsersPro user = new UsersPro();
		user.setUserID(11);
		user.setUsername("avisrabon22");
		Product pro = new Product();
		pro.setProductId(22);
		pro.setProductName("Ear rings");

		user.setProd(pro);

		Session session = factory.openSession();
		org.hibernate.Transaction tr = session.beginTransaction();

		session.save(user);
		session.save(pro);
		
		
		
		tr.commit();
		session.close();
		factory.close();

	}

}
