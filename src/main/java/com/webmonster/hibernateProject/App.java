package com.webmonster.hibernateProject;


import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        Configuration cfg= new Configuration();
        cfg.configure();
        
     org.hibernate.SessionFactory factory=cfg.buildSessionFactory();
     System.out.println(factory);
     System.out.println(factory.isClosed());
    }
}
