package com.shivash.jenkin.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	@GetMapping("/")
	public String getAll() {
		
		return "hello , this is socker testing" ;
	}
	
}
