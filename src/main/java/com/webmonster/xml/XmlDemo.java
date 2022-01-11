package com.webmonster.xml;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class XmlDemo {
public static void main(String[] args) {
	System.out.println("Started project...");
	SessionFactory fact=new Configuration().configure().buildSessionFactory();
	
	EmpWithXML emp=new EmpWithXML(777,"Avijit Maity");
	
	
	
	Session session=fact.openSession();
	Transaction tr=session.beginTransaction();
	
	session.save(emp);
		
	tr.commit();
	session.close();
	fact.close();
}
}
