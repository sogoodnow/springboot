package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id)
	{
		User findone=this.repo.findOne(id);
		return findone;
	}

}
