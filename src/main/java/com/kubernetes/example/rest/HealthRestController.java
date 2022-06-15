package com.kubernetes.example.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kubernetes.example.data.MockData;
import com.kubernetes.example.domain.Customer;

@RestController
public class HealthRestController {

	@GetMapping(path = "health_check")
	@ResponseBody
	public String health() {
		return "working";
	}
	
	@PostMapping(path = "/push")
	public void pushMessage() {
		
	}
	
	@GetMapping(path = "/pop")
	public void popMessage() {
		
	}
	
	@ResponseBody
	@GetMapping(path = "/")
	public List<Customer> findCustomer() {
		return MockData.createCustomers();
	}
}
