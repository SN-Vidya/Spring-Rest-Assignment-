package com.springrest.pincode.springrestpincode.service;
import org.springframework.stereotype.Service;

import com.springrest.pincode.springrestpincode.entity.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}

