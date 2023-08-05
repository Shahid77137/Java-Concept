package com.masai.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.masai.demo.model.Alien;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien,Integer>
{

}
