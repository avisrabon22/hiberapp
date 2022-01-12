package com.webmonster.criteria;

import java.util.List;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.webmonster.mapmanytomany.EmpDetails;

public class CriteriaDemo {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
        Criteria criteria=session.createCriteria(EmpDetails.class);
		criteria.add(Restrictions.gt("empID", 1));
        
        
        List<EmpDetails> emps=criteria.list();
		
		for(EmpDetails employee:emps) {
			
			System.out.println(employee.getEmpName());
		}
        
        
        
        
        
		session.close();
	}
}
