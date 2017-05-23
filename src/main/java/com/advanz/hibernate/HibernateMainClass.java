package com.advanz.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.advanz.dto.AnswerDto;
import com.advanz.dto.QuestionDto;
import com.advanz.pojo.Answer;
import com.advanz.pojo.Question;


public class HibernateMainClass {

	public static void main(String[] a){
//		HibernateMainClass hbm= new HibernateMainClass();
//		hbm.saveObject();
		QuestionManager manager = new QuestionManager();
		System.out.println(manager.getQueId("JAVA is OOPS"));
		
//		hbm.getObject();
	}
	
	public void saveObject(){
		Session session = HibernateSession.getHibernateSession();
		Transaction txn = session.beginTransaction();
		
		QuestionDto que = new QuestionDto();
		que.setParentQue(0);
		que.setQueName("JAVA is OOPS");
		que.setTypeOfAnswer("MultiLine");
		AnswerDto answers = new AnswerDto();
		answers.setAnswerName("Object orientd langauage");
		AnswerDto answers1 = new AnswerDto();
		answers1.setAnswerName("Oooooo");
		
		
		List<AnswerDto> ansList = new ArrayList<AnswerDto>();
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


