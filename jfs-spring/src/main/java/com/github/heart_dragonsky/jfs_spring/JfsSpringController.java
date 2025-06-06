package com.github.heart_dragonsky.jfs_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JfsSpringController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot backend of the JFS application!";
	}

}