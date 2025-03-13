package com.project.pharmacy.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Clinic {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String address;
	private String city;
	
	@ManyToMany(mappedBy = "clinics")
	private List<Doctor> doctors = new ArrayList<Doctor>();
	
	public Clinic() {
		super();
	}

	public Clinic(Long id, String address, String city) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
	
}
