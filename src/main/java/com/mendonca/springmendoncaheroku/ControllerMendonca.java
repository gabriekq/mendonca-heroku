package com.mendonca.springmendoncaheroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControllerMendonca {

	@GetMapping("/home")
	public String getHello() {
		return "Hello Heroku by Mendonca";
	}
	
	
	
	
}
