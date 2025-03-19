package com.project.pharmacy.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.pharmacy.generics.BaseEntity;
import com.project.pharmacy.model.PharmacyProduct;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class PharmacyDTO extends BaseEntity<Serializable> {

	@NotNull
	private String name;
	@NotNull
	private String address;
	@NotNull
	private String telf;
	@NotNull
	@Email
	private String email;
	@NotNull
	private String opening_hours;
	@NotNull
	private String license_number;
	@NotNull
	private String city;
    @JsonIgnore
    private List<PharmacyProduct> pharmacyProducts; 	
    
	public PharmacyDTO() {
		super();
	}

	public PharmacyDTO(String name, String address, String telf, String email, String opening_hours,
			String license_number, String city) {
		super();
		this.name = name;
		this.address = address;
		this.telf = telf;
		this.email = email;
		this.opening_hours = opening_hours;
		this.license_number = license_number;
		this.city = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getOpening_hours() {
		return opening_hours;
	}
	public void setOpening_hours(String opening_hours) {
		this.opening_hours = opening_hours;
	}
	public String getLicense_number() {
		return license_number;
	}
	public void setLicense_number(String license_number) {
		this.license_number = license_number;
	}
	public String getCity() {
		return city;
		
	}
	public void setCity(String city) {
		this.city = city;
	}

	public List<PharmacyProduct> getPharmacyProducts() {
		return pharmacyProducts;
	}

	public void setPharmacyProducts(List<PharmacyProduct> pharmacyProducts) {
		this.pharmacyProducts = pharmacyProducts;
	}

	@Override
	public String toString() {
		return "PharmacyDTO [name=" + name + ", address=" + address + ", telf=" + telf + ", email=" + email
				+ ", opening_hours=" + opening_hours + ", license_number=" + license_number + ", city=" + city
				+ ", pharmacyProducts=" + pharmacyProducts + ", getId()=" + getId() + ", getClass()=" + getClass()
				+ "]";
	}

}
