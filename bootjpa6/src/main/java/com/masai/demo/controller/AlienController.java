package com.masai.demo.controller;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.masai.demo.dao.AlienRepo;
import com.masai.demo.model.Alien;

@RestController
public class AlienController
{
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@PostMapping(path="/alien",consumes= {"application/json"})
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	@GetMapping(path="/aliens")
	public List<Alien> getAliens()
	{
		return repo.findAll();
		
		
	}
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}
}
