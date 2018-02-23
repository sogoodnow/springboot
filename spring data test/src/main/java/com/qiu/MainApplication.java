package com.qiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableJpaRepositories
public class MainApplication {

	@ResponseBody
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
