package com.advanz.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.advanz.pojo.Question;

@Path("/sanjay")
public class QuestionAPI {

	@Path("/addQuestions")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addQuestions(Question question){
		System.out.println(question.getId());
		System.out.println(question.getParentQue());
		System.out.println(question.getQuestion());
		System.out.println(question.getTypeOfAnswer());
//		System.out.println(question.getAnswers().toString());
		for(String a: question.getAnswers()){
			System.out.println(a);
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
