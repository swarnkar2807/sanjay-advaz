package com.advanz.spring.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class QuestionDaoImpl implements QuestionDao{

	JdbcTemplate template;
	
	public QuestionDaoImpl(DataSource ds){
		template = new JdbcTemplate(ds);
	}
	public int addNewQuestion() {
//		
		return 0;
	}

}
