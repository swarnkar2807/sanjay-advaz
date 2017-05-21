package com.advanz.pojo;

import java.util.List;

public class Question {

	private int id;
	private String queName;
	private int parentQue;
	private String typeOfAnswer;
	private List<String> answers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return queName;
	}
	public void setQuestion(String question) {
		this.queName = question;
	}
	public int getParentQue() {
		return parentQue;
	}
	public void setParentQue(int parentQue) {
		this.parentQue = parentQue;
	}
	public String getTypeOfAnswer() {
		return typeOfAnswer;
	}
	public void setTypeOfAnswer(String typeOfAnswer) {
		this.typeOfAnswer = typeOfAnswer;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
		
}
