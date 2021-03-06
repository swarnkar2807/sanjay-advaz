package com.advanz.pojo;

import java.util.List;


public class Question {

	private int queId;
	private String queName;
	private String parentQue;
	private String typeOfAnswer;
	private List<Answer> answers;
	public int getQueId() {
		return queId;
	}
	public void setQueId(int queId) {
		this.queId = queId;
	}
	public String getQueName() {
		return queName;
	}
	public void setQueName(String queName) {
		this.queName = queName;
	}
	public String getParentQue() {
		return parentQue;
	}
	public void setParentQue(String parentQue) {
		this.parentQue = parentQue;
	}
	public String getTypeOfAnswer() {
		return typeOfAnswer;
	}
	public void setTypeOfAnswer(String typeOfAnswer) {
		this.typeOfAnswer = typeOfAnswer;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [queId=" + queId + ", queName=" + queName + ", parentQue=" + parentQue + ", typeOfAnswer="
				+ typeOfAnswer + ", answers=" + answers + "]";
	}
	
	
	
	
	
		
}
