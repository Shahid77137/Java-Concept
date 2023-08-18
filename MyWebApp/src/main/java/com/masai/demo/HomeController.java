package com.masai.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@GetMapping("home")
	public String home()
	{
		System.out.println("hi");
		return "home.jsp";
	}
}
