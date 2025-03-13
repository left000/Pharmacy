package com.project.pharmacy.model;

import java.util.ArrayList;
import java.util.List;

import com.project.pharmacy.generics.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pharmacy extends BaseEntity<Long> {

    private String name;
    private String address;
    private String telf;
    private String email;
    private String opening_hours;
    private String license_number;
    private String city;

    @OneToMany(mappedBy = "pharmacy")
    private List<Purchases> purchases = new ArrayList<Purchases>();

    @OneToMany(mappedBy = "pharmacy", cascade = CascadeType.ALL)
    private List<PharmacyProduct> pharmacyProducts = new ArrayList<PharmacyProduct>(); // Associazione tra farmacia e prodotti

    
	public Pharmacy() {
		super();
	}


	public Pharmacy(String name, String address, String telf, String email, String opening_hours,
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


	public List<Purchases> getPurchases() {
		return purchases;
	}


	public void setPurchases(List<Purchases> purchases) {
		this.purchases = purchases;
	}


	public List<PharmacyProduct> getPharmacyProducts() {
		return pharmacyProducts;
	}


	public void setPharmacyProducts(List<PharmacyProduct> pharmacyProducts) {
		this.pharmacyProducts = pharmacyProducts;
	}
	
	
	
}
