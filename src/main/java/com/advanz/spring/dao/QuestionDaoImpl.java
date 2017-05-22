package com.advanz.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class QuestionDaoImpl implements QuestionDao{

	JdbcTemplate template;
	
	public QuestionDaoImpl(DataSource ds){
		template = new JdbcTemplate(ds);
	}
	public int addNewQuestion() {
//		String sql = "insert into question (que_name, )" 
//		KeyHolder holder = new GeneratedKeyHolder();
//		template.update(new PreparedStatementCreator() {
//			String sql = "insert into question ()" 
//			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
//				PreparedStatement ps =con.prepareStatement(sql)
//				return null;
//			}
//		}, holder);
//		template.q
		return 0;
	}

}
