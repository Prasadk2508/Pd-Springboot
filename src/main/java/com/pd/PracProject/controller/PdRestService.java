package com.pd.PracProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pd.PracProject.entity.UserDetails;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PdRestService {
	
//	@RequestMapping(method = RequestMethod.GET,value = "/message")
	@GetMapping("/message")
	public String getMessage(){
		return "Hello there..";
	}
	
	@GetMapping("/userdetails")
	public UserDetails getUserDetails() {
		return new UserDetails("Pd","K","Pune");
	}
	
	
	
	
	

}
