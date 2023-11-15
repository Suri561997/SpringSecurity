package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/api/greeting")
	public String welcomePage(Authentication authentication) {
		return "Welcome "+authentication.getName()+" !!! ";
	}
	
}