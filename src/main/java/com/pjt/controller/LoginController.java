package com.pjt.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import lombok.extern.java.Log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pjt.domain.Member;
import com.pjt.persistence.MemberRepository;

@RequestMapping("/login")
@Controller
@Log
public class LoginController {
	
	@Inject
	MemberRepository memberRepo;
	
	@GetMapping("/join")
	public String joinGET()
	{
		return "thymeleaf/login/join";
	}
	
	@PostMapping("/join")
	public String joinPOST(@ModelAttribute("member") Member member,
							@RequestParam("year") String year,
							@RequestParam("month") String month,
							@RequestParam("day") String day,
							RedirectAttributes rttr)
	{
		System.out.println("/login/join");
		
		log.info("#### /login/join Start ####");
		
		log.info("#### member.getId() = " + member.getId());
		log.info("#### member.getPw() = " + member.getPw());
		log.info("#### member.getName() = " + member.getName());
		log.info("#### member.getGender() = " + member.getGender());
		//log.info("#### member.getBirthday() = " + memberVO.getBirthday());
		log.info("#### year = " + year);
		log.info("#### month = " + month);
		log.info("#### day = " + day);
		log.info("#### member.getEmail() = " + member.getEmail());
		log.info("#### member.getTel() = " + member.getTel());
		log.info("#### member.getPoint() = " + member.getPoint());
		
		
		member.setBirthday(transformStringToDate(year+month+day));
		
		memberRepo.save(member);
		
		rttr.addFlashAttribute("msg", "success");
		
		log.info("#### /login/join End ####");
		
		
		return "redirect:/index";
	}

	private Date transformStringToDate(String date) {
		
		Date parseDate = null;
		
		try 
		{
			parseDate = new SimpleDateFormat("yyyyMMdd").parse(date);
		}
		catch (ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return parseDate;
	}
}
