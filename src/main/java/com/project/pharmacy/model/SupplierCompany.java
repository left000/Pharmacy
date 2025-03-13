package com.project.pharmacy.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SupplierCompany {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String adress;
	private String telf;
	
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<Product>();

    public SupplierCompany() {
    	super();
    }
    
	public SupplierCompany(Long id, String name, String adress, String telf) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.telf = telf;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}
    
    
}
