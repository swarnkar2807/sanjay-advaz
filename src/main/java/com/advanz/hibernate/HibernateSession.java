package com.advanz.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSession {
	public static SessionFactory sf;
	public static Session session;
	
	public static Session getHibernateSession(){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		
		session = sf.openSession();
		
		return session;
	}
	
	public static void closedConnection(){
		session.close();		sf.close();
	}
}
