package com.project.pharmacy.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Manufacturer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	private String email;
	private String country;
	private Date yearFounded;
	
    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.ALL)
	private List<Product> products  = new ArrayList<Product>();

    public Manufacturer() {
    	super();
    }
    
	public Manufacturer(Long id, String name, String address, String email, String country, Date yearFounded) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.country = country;
		this.yearFounded = yearFounded;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getYearFounded() {
		return yearFounded;
	}

	public void setYearFounded(Date yearFounded) {
		this.yearFounded = yearFounded;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

    

}
