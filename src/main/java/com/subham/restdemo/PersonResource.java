package com.subham.restdemo;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.subham.business.PersonService;
import com.subham.pojo.Person;

@Path("/")
public class PersonResource {
	private static final PersonService service = new PersonService();

	/*
	 * request method {GET}
	 * get list of all person
	*/
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllPerson(){
		return service.getListOfPerson();
	}
	
	/*
	 * request method {POST}
	 * a person at database
	 * return list
	*/
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Person storePerson(	@HeaderParam("name") String name, 
								@HeaderParam("age") int age, 
								@HeaderParam("address") String address) {
		Person person = service.personBuilder.name(name).address(address).age(age).build();
		
		/*----------------- DEBUGGING statement-----------------*/
		//System.out.println(person);
		
		return service.addPerson(person);
	}
	
	/*
	 * request method {GET}
	 * get person given id
	*/
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson(@PathParam("id") int id) {
		return service.getPerson(id);
	}
	
	/*
	 * request method {DELETE}
	 * delete person given id
	*/
	@Path("{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> deletePerson(@PathParam("id") int id){
		service.removePerson(id);
		return service.getListOfPerson();
	}
	
	/*
	 * request method {DELETE}
	 * delete person given id
	*/
	@Path("{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> putPerson(	@PathParam("id") int id,
									@HeaderParam("name") String name, 
									@HeaderParam("age") int age, 
									@HeaderParam("address") String address){
		Person person = service.personBuilder.name(name).address(address).age(age).build();
		service.putPerson(id, person);
		return service.getListOfPerson();
	}
	
}
