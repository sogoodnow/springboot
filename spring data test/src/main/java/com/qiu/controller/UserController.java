package com.qiu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiu.dao.UsersDao;
import com.qiu.domain.Users;
import com.qiu.properties.UserSetting;

@Controller
public class UserController {
	@Autowired
	private Users users;
	@Autowired
	private UsersDao usersdao;
//	@Autowired
//	private DictMapper dict;
	
//	@RequestMapping("/")
//	@ResponseBody
//	public List<Users> index(Model model)
//	{		
//		List<Users> aa =usersdao.findAll();
//		model.addAttribute("li",aa);
//		return aa;
//	}
	@Autowired 
	UserSetting usersetting;
	
	
	@RequestMapping("/")
	@ResponseBody
	public String index(Model model)
	{		

//		
//		List<Users> aa =usersdao.findAll();
//		model.addAttribute("li",aa);
		return usersetting.getAddress()+usersetting.getName();
	}

}
