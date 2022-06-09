package com.kubernetes.example.kubernetesexample.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthRestController {

	@GetMapping(path = "health_check")
	@ResponseBody
	public String health() {
		return "working";
	}
}
