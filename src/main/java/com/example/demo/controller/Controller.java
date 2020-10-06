package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="hola")
public class Controller {
	
	@GetMapping
	public String getHello() {
		return "Hola DEVS";
	}

}
