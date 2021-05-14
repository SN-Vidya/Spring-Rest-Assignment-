package com.springrest.login.service;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.login.entity.User;

@Service
public class ServiceUserImpl implements UserService {

	List<User> users;

	public ServiceUserImpl() {
		users = new ArrayList<>();
		users.add(new User("Bindu", "Password123"));
		users.add(new User("Vidya", "Password1234"));
		users.add(new User("Pooja", "Password0123"));
		users.add(new User("Manu", "Password1023"));
		users.add(new User("Anu", "Password1203"));
		
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}

