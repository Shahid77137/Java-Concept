package com.masai.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.masai.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
