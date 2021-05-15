package com.springrest.pincode.springrestpincode.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.pincode.springrestpincode.entity.Pincode;
import com.springrest.pincode.springrestpincode.service.ServicePin;

@RestController
public class ControllerPincode {
	
	@Autowired
	ServicePin s;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}

