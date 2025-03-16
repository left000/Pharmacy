package com.project.pharmacy.dto;

import java.io.Serializable;

import com.project.pharmacy.generics.BaseEntity;

public class DoctorDTO extends BaseEntity<Serializable> {
	
	private String name;
	private String surname;
	private String telf;
	private String email;
	
	public DoctorDTO() {
		super();
	}
	
	public DoctorDTO(String name, String surname, String telf, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.telf = telf;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
