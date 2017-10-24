package com.pjt.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pjt.domain.Member.Gender;

import groovy.transform.ToString;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
public class MemberVO {

	private String id;
	private String pw;
	private String name;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String year;
	private String month;
	private String day;
	@Temporal(TemporalType.DATE)
	private Date birthday;
	private String email;
	private String tel;
	private String point;
}
