package com.example.domain;

import java.util.Date;

import javax.validation.constraints.*;

public class Customer {
	
	@NotNull
	@Size(min = 6, max = 50)
	private String username;
	
	@NotNull
	private String address;
	
	@Past
	private Date birthdate;
	
	@NotNull
	@Size(min = 6, max = 50)
	private String password;
	
	@NotNull
	private String sex;
	
	public Customer(){}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
