package com.subham.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Gateway {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String nothing() {return "<h1> ERROR </h1>";}
	
	@Path("test")
    public Test getTest() {
        return new Test();
    }
	
	@Path("persons")
	public PersonResource getPersonResource() {
		return new PersonResource();
	}
}
