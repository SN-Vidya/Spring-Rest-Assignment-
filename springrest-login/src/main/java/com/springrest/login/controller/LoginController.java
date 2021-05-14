package com.springrest.login.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.login.entity.User;
import com.springrest.login.service.UserService;

@RestController
public class LoginController {
	@Autowired
	UserService s;
	@PostMapping("/login")

	public String checkUser(@RequestBody User u1)
	{
		System.out.println(u1.getUserName()+" "+u1.getPassword());
		return s.check(u1);
		
	}
	
}

