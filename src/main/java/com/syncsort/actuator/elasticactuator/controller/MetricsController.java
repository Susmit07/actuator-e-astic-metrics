package com.syncsort.actuator.elasticactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MetricsController {
	
	@GetMapping(value = "employee/{name}")
	public String getName(@PathVariable("name") String name) {
		return "Hello "+name;
	}
	
	@GetMapping(value = "exceptionTest/{number}")
	public int getException(@PathVariable("number") int number) {
		return 12/number;
	}
}
