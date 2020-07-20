package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class UserTable {
	
	@Id
	@Column(name = "ID", length = 10, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 200)
	private String userName;
	
	@Column(length = 200)
	private String name;
	
	@Column(length = 200)
	private String lastName;
	
	@Column(length = 30)
	private String contactPhone;
	
	@Column(length = 2000)
	private String contactAdress;
	
	@Column(length = 300)
	private String contactMail;
	
	@Temporal(TemporalType.DATE)
	private Date userBirthDate;
	
	private Date insertDateTime;
	
	private Date updateDateTime;
	
	public UserTable() {
	}

}
