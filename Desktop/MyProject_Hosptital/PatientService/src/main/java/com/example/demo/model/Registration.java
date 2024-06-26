package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int regId;
	private String username;
	private String password;
	
	
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Registration(int regId, String username, String password) {
		super();
		this.regId = regId;
		this.username = username;
		this.password = password;
	}

	public int getRegId() {
		return regId;
	}
	public void setRegId(int regId) {
		this.regId = regId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
