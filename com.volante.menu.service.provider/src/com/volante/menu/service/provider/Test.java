package com.volante.menu.service.provider;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.Arrays;
import org.apache.felix.dm.annotation.api.Component;

@Component(provides=Object.class)
@Path("test")
public class Test {

	@GET
	@Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
   public List<Test2> list(@PathParam ("id") int id) {
		
		return Arrays.asList(new Test2(id, "2111"));
	}
	
}

class Test2{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Test2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}