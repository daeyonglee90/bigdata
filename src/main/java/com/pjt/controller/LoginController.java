package com.pjt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjt.vo.MemberVO;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	@GetMapping("/join")
	public String joinGET()
	{
		return "thymeleaf/login/join";
	}
	
	@PostMapping("/join")
	public String joinPOST(@ModelAttribute("memberVO") MemberVO memberVO, Model model)
	{
		System.out.println("/login/join");
		
		
		
		
		return "redirect:/index";
	}
}
