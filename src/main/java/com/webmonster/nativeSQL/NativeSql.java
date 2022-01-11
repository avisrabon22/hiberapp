package com.webmonster.nativeSQL;

import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
//import com.webmonster.mapmanytomany.EmpDetails;

public class NativeSql {

	public static void main(String[] args) {
		String qr = "select * from EmpDetails";
		System.out.println("Project started...");
		Configuration cfg = new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory factory = cfg.buildSessionFactory();
		// Session**************************************************************
		Session session = factory.openSession();

		@SuppressWarnings("rawtypes")
		NativeQuery nq = session.createSQLQuery(qr);
		@SuppressWarnings("unchecked")
		List<Object[]> list = nq.list();

		for (Object[] emp : list) {
			System.out.println(Arrays.deepToString(emp));

		}

		
		
		session.close();
		factory.close();
	}

}
