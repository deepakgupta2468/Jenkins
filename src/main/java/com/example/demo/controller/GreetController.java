package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Greet")
public class GreetController {
	
	@GetMapping("/hi")
	 public String greet() {
		return "Hi Everyone, I'm Deepak";
	}

}
