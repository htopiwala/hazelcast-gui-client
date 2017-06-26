package com.hazelcast.gui.client.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String param) {
		String output = "Hello, "+param;
		return Response.status(200).entity(output).build();
	}
}
