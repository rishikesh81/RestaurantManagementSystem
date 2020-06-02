package com.restaurant.management.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String hello() {
		return "Welcome to the RMS....!";
	}
}
