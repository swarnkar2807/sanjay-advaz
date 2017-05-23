package com.advanz.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.advanz.dto.AnswerDto;
import com.advanz.dto.QuestionDto;
import com.advanz.hibernate.QuestionManager;
import com.advanz.pojo.Answer;
import com.advanz.pojo.Question;

@Path("/sanjay")
public class QuestionAPI {

	@Path("/addQuestion")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addQuestion(Question question){
		
		
		return Response.ok(Response.ok()).entity("Add SuccessFully").build();
		
	}
	@Path("/addQuestions")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addQuestions(List<Question> question){
		QuestionManager manager = new QuestionManager();
		QuestionDto dto = null;
		try {
			for (Question que : question) {
				System.out.println("question : " + que.getQueName());
				dto = new QuestionDto();
				dto.setQueName(que.getQueName());
				dto.setTypeOfAnswer(que.getTypeOfAnswer());
				List<AnswerDto> ansDtoList = new ArrayList<AnswerDto>();
				for (Answer ans : que.getAnswers()) {
					AnswerDto ansDto = new AnswerDto();
					ansDto.setAnswerName(ans.getAnswerName());
					ansDtoList.add(ansDto);
				}
				dto.setAnswers(ansDtoList);
				if (que.getParentQue() != null && !que.getParentQue().equals("")) {
					System.out.println("parent question : " + que.getParentQue().trim());
					int queId = manager.getQueId(que.getParentQue().trim());
					dto.setParentQue(queId);
				}
				manager.saveObject(dto);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Response.ok(Response.ok()).entity("Add SuccessFully").build();
		
	}
	@Path("/getName")
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Response getName(){
		List<String> aList =  new ArrayList<String>();
		aList.add("Sanjay");
		aList.add("Montu");
		aList.add("Ronak");
		return Response.ok(Response.ok()).entity("Sanjay").build();
		
	}
	
}
