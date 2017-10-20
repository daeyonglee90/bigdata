package com.pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	@GetMapping("/join")
	public String joinForm()
	{
		return "thymeleaf/login/join";
	}
}
