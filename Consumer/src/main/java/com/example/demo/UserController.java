package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	
	@Autowired
	private RestTemplate template;
	@Autowired
	private DiscoveryClient dsclient;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id)
	{
		return this.template.getForObject("http://127.0.0.1:8080/"+id, User.class);
	}
	@GetMapping("/instance")
	public List<ServiceInstance> showInfo()
	{
		return this.dsclient.getInstances("SP-user2");
	}
}
