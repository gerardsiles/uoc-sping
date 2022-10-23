package com.example.ParaCasa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class controller {
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
