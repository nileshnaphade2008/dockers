package com.docker;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Consumes("application/json")
@Produces("application/json")
public class RestResource {
	private final static Logger LOG =LoggerFactory.getLogger(RestResource.class);
	@GET
	@Path("/start")
	// This is async call
	public void startApi() {
		
		LOG.info("RestResource :: start");
		
	}
	
}
