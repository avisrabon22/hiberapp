package com.webmonster.hibernateProject;

import java.io.IOException;

//import####################################################
import org.hibernate.cfg.Configuration;

//main @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();

		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
//     System.out.println(factory);
//     System.out.println(factory.isClosed());

		Users user1 = new Users();
		Users user2 = new Users();
		
		

		user1.getId();
		user1.setFullname("Avijit Maity");
		user1.setEmail("avijit@gmail.com");
		user1.setPassword("Avi@3834");
		EmbedinUsers embd = new EmbedinUsers();
		embd.setPhoneNumberl(1234567890);
		embd.setDesignation("IT Lead");
		embd.setBloodGroup("B+");
		user1.setEmbed(embd);
//###########################################################################
		user2.getId();
		user2.setFullname("Krishna Biswas");
		user2.setEmail("krishna@gmail.com");
		user2.setPassword("kishu@123");
		EmbedinUsers embd1 = new EmbedinUsers();
		embd1.setPhoneNumberl(9090909090d);
		embd1.setDesignation("MEDICAL LAB");
		embd1.setBloodGroup("A+");
		user2.setEmbed(embd1);
		
		
		
		
		// FileInputStream fs = new FileInputStream("");
//		byte[] userImage = new byte[fs.available()];
//		fs.read(userImage);
//		user.setImage(userImage);
//######################################################################
		org.hibernate.Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(user1);
		session.save(user2);
		tx.commit();
		session.close();

	}
}
