package com.Microsoft.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/microsoft")
public class Customer {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	@GetMapping("/hello ")
	public String hello() {
		return "hello";
	}
}
