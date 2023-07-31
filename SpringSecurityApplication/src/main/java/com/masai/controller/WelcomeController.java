package com.masai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@PostMapping("/welcomePost")
	public ResponseEntity<String> welcomePHandler(){
		return new ResponseEntity<>("Welcome to Masai Application WelcomePost EndPoint", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcomeHandler(){
		return new ResponseEntity<>("Welcome to Masai Application Welcome EndPoint", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<String> adminHandler(){
		return new ResponseEntity<>("Welcome to Masai Application admin EndPoint", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/user")
	public ResponseEntity<String> userHandler(){
		return new ResponseEntity<>("Welcome to Masai Application user EndPoint", HttpStatus.ACCEPTED);
	}
	
}
