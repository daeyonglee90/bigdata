package com.pjt.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import groovy.transform.ToString;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
@ToString
@Entity
@Table(name="TBL_MEMBERS")
@EqualsAndHashCode(of="memberNo")
public class Member {

	public enum Gender {
		M, F
	}
	
	@Id
	@TableGenerator(name="idGen", table="id_gen", pkColumnName="seq_member_mno",
					valueColumnName="nextval", allocationSize=1, initialValue=1000)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="idGen")
	private Long memberNo;
	
	private String id;
	private String password;
	private String name;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Temporal(TemporalType.DATE)
	private Date birthday;
	private String email;
	private String telephone;
	private String point;
	@CreationTimestamp
	private Date create_date;
	@UpdateTimestamp
	private Date update_date;
	
	 
	
	
}
