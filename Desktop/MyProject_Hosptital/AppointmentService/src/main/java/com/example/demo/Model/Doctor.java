package com.example.demo.Model;

import jakarta.persistence.Entity;

@Entity
public class Doctor {
	private Long id;
	private String name;
	private String specialization;
	private String details;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Doctor(Long id, String name, String specialization, String details) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
		this.details = details;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	

}
