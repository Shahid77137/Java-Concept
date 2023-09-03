package com.masai.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.masai.demo.dao.AlienRepo;
import com.masai.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens()
	{
		return repo.findAll().toString();
		
		
	}
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid).toString();
		
		
	}
}
