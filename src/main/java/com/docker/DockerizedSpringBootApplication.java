package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DockerizedSpringBootApplication {

	
	@GetMapping("/message")
	public String getMessage(String str)
	{
		return "Welcome to Docker Example " + str;
		//return "Welcome to Docker Example "  test branch
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerizedSpringBootApplication.class, args);
	}

}
