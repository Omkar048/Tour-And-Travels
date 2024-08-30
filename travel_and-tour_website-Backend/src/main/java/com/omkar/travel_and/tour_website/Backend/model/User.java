package com.omkar.travel_and.tour_website.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uid;
	private String name,Addreess,emailId,gender,mobileNO,password;
	private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String addreess, String emailId, String gender, String mobileNO, String password,
			int age) {
		super();
		this.name = name;
		Addreess = addreess;
		this.emailId = emailId;
		this.gender = gender;
		this.mobileNO = mobileNO;
		this.password = password;
		this.age = age;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddreess() {
		return Addreess;
	}
	public void setAddreess(String addreess) {
		Addreess = addreess;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(String mobileNO) {
		this.mobileNO = mobileNO;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
