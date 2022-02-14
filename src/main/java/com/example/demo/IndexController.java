package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IndexController {

	@GetMapping("/hello")
	public String index ()
	{
		return "Hello";
	}
}
