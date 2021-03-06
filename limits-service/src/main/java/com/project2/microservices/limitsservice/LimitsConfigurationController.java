package com.project2.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	public Configuration configuration;
	
	@GetMapping(path = "/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		// return new LimitConfiguration(1000, 100);
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
