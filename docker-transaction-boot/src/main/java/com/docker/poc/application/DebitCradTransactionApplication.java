package com.docker.poc.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:camel-context.xml")
@ComponentScan("com.docker")
public class DebitCradTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebitCradTransactionApplication.class, args);
	}

}
