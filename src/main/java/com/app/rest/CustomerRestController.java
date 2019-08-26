package com.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cust")
public class CustomerRestController {

	@Value("${server.port}")
	private String port;

	public String showDetails() {
		return "Welcome to Customer Service:"+port;
	}
}
