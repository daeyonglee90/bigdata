package com.pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board")
@Controller
public class BoardController {

	@GetMapping("/list")
	public String mainlist()
	{
		return "jsp/board/list";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "jsp/board/register";
	}
}
