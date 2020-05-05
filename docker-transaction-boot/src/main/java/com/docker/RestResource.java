package com.docker;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;


public class RestResource {
	private final static Logger LOG =LoggerFactory.getLogger(RestResource.class);
	@GetMapping("/start")
	// This is async call
	public void startApi() {
		
		System.out.println("RestResource :: start");
		
	}
	
}
