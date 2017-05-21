package com.advanz.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.advanz.pojo.Question;

public class QuestionBinder {

	public void saveObject(Question queObject){
		Session session = HibernateSession.getHibernateSession();
		Transaction txn = session.beginTransaction();
		
		
		Integer id = (Integer) session.save(queObject);
		txn.commit();
		HibernateSession.closedConnection();
	}
}
