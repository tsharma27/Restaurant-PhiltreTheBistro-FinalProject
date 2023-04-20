package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Dish;
import com.demo.repository.DishRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DishController {
	
	@Autowired
	private DishRepository drepository;
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/insertdish")
	public Dish insertdish(@RequestBody Dish d1) {
		return this.drepository.save(d1);
	}
	
	@CrossOrigin(origins="http://localhost:4200")	
	@PostMapping("/updatedish")
	public Dish updatedish(@RequestBody Dish d2) {
		return this.drepository.save(d2);
	}
	
	@CrossOrigin(origins="http://localhost:4200")	
	@PostMapping("/deletedish")
	public void deletedish(@RequestBody Dish d3) {
		drepository.delete(d3);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/viewdish")
	public java.util.List<Dish> viewdish()
	{
		return drepository.findAll();
	}

}
