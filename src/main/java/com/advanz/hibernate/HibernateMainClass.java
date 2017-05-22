package com.advanz.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.advanz.pojo.Answer;
import com.advanz.pojo.Question;


public class HibernateMainClass {

	public static void main(String[] a){
		HibernateMainClass hbm= new HibernateMainClass();
		hbm.saveObject();
		
//		hbm.getObject();
	}
	
	public void saveObject(){
		Session session = HibernateSession.getHibernateSession();
		Transaction txn = session.beginTransaction();
		
//		Employee emp = new Employee();
//		annotation.hibernate.Employee emp = new annotation.hibernate.Employee();
		
		Question que = new Question();
//		que.setId(id);
		que.setParentQue(0);
		que.setQueName("JAVA is OOPS");
		que.setTypeOfAnswer("MultiLine");
		Answer answers = new Answer();
		answers.setAnswerName("Object orientd langauage");
		Answer answers1 = new Answer();
		answers1.setAnswerName("Oooooo");
		
		
		List<Answer> ansList = new ArrayList<Answer>();
		ansList.add(answers);
		ansList.add(answers1);
		que.setAnswers(ansList);
		
		
		session.save(que);
		txn.commit();
//		session.close();
		HibernateSession.closedConnection();
	}
	
//	
}


