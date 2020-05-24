package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

	
	@GetMapping("/greeting")
	public String testing() {
		
		return "greeting.html";
	}
	
	@GetMapping("/")
    public String index(Model model) {

        return "index.html";
    }
}
