package com.pjt.controller;

import lombok.extern.java.Log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pjt.domain.Member;
import com.pjt.vo.MemberVO;

@RequestMapping("/login")
@Controller
@Log
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
		
		log.info("#### /login/join Start ####");
		
		log.info("#### member.getId() = " + memberVO.getId());
		log.info("#### member.getPw() = " + memberVO.getPw());
		log.info("#### member.getName() = " + memberVO.getName());
		log.info("#### member.getGender() = " + memberVO.getGender());
		//log.info("#### member.getBirthday() = " + memberVO.getBirthday());
		log.info("#### member.getYear() = " + memberVO.getYear());
		log.info("#### member.getMonth() = " + memberVO.getMonth());
		log.info("#### member.getDay() = " + memberVO.getDay());
		log.info("#### member.getEmail() = " + memberVO.getEmail());
		log.info("#### member.getTel() = " + memberVO.getTel());
		log.info("#### member.getPoint() = " + memberVO.getPoint());
		
		log.info("#### /login/join End ####");
		
		
		return "redirect:/index";
	}
}
