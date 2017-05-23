package com.advanz.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.advanz.dto.QuestionDto;
import com.advanz.pojo.Question;

public class QuestionManager {

	public void saveObject(QuestionDto queObject){
		Session session = HibernateSession.getHibernateSession();
		Transaction txn = session.beginTransaction();
		
		
		session.save(queObject);
		txn.commit();
		HibernateSession.closedConnection();
	}
	public Question getQuestion(){
		return null;
	}
	public int getQueId(String que) {
		Session session = HibernateSession.getHibernateSession();
		String sql = "from QuestionDto q where q.queName = :queName";
		Query query = session.createQuery(sql);
		query.setParameter("queName", que);
		List result = query.list();
		QuestionDto dto =  ((QuestionDto)result.get(0));
		return dto != null ? dto.getQueId():0;
	}
}
