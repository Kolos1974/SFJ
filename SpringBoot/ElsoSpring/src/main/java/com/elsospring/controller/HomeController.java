package com.elsospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elsospring.service.SpyService;

@RestController
public class HomeController {

	private SpyService spyService;
	
	@Autowired
	public void setSpyService(SpyService spyService) {
		this.spyService = spyService;
	}


	@RequestMapping("/")
	public String index() {
		return spyService.iSaySomething(); 
	}
	
	
}
