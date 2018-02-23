package com.qiu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qiu.dao.UsersDao;
import com.qiu.domain.Users;

@RestController
public class UserController {
	@Autowired
	private Users users;
	@Autowired
	private UsersDao usersdao;
	
	@RequestMapping("/show")
	@ResponseBody
	public List<Users> showall()
	{		
		List<Users> aa =usersdao.findAll();
		return aa;
	}

}
