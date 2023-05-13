package com.in28minutes.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.limitsservice.bean.Limits;
import com.in28minutes.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retieveLimits()
	{
	//	return new Limits(1,999);
		System.out.println("Min:"+configuration.getMin());
		return new Limits(configuration.getMin(), configuration.getMax());
	}

}
