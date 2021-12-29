package com.webmonster.hibernateProject;
//import####################################################
import org.hibernate.cfg.Configuration;

//main @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
public class App {
	public static void main(String[] args) {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();

		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
//     System.out.println(factory);
//     System.out.println(factory.isClosed());

		Users user = new Users();
		
		user.setId(1);
		user.setFullname("Avijit Maity");
		user.setEmail("avisrabon22@gmail.com");
		user.setPassword("Avijit@3834");
//######################################################################
		org.hibernate.Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();

	}
}
