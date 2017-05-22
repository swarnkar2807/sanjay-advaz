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
		for(Question q: question){
			
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
