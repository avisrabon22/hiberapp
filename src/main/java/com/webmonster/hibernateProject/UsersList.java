package com.webmonster.hibernateProject;

import org.hibernate.cfg.Configuration;

public class UsersList {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		System.out.println("Started...");
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();

		org.hibernate.Session session = factory.openSession();

		Users user = session.get(Users.class, 3);
		System.out.println(user);
		Users user1 = session.load(Users.class, 4);
		System.out.println(user1);

		session.close();
		factory.close();
	}
}
