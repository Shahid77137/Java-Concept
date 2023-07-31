package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hello1")
	public String sayHello1() {
		return "Welcome to the Spring Security One";
	}
	
	@GetMapping("/hello2")
	public String sayHello2() {
		return "Welcome to the Spring Security Two";
	}
}
