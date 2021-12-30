package com.webmonster.hibernateProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

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

		Users user = new Users();
		user.getId();
		user.setFullname("Krishna Biswas");
		user.setEmail("krishnabiswas@gmail.com");
		user.setPassword("Kishu@3834");

		FileInputStream fs = new FileInputStream("src/main/java/ChildAvi.jpg");
		byte[] userImage = new byte[fs.available()];
		fs.read(userImage);
		user.setImage(userImage);
//######################################################################
		org.hibernate.Session session = factory.openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();

	}
}
