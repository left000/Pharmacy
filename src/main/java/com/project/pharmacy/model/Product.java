package com.project.pharmacy.model;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.pharmacy.generics.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product extends BaseEntity<Long> {

	private String name;
	private Double price;
	private Date expirationDate;
	private String barcode; 	    
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manufacturer_id")
	private Manufacturer manufacturer; 	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supply_company_id")
	private SupplierCompany company; 

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<PharmacyProduct> pharmacyProducts = new ArrayList<PharmacyProduct>(); 

	@ManyToMany
	@JoinTable(
			name = "product_category",
			joinColumns = @JoinColumn(name = "product_id"),
			inverseJoinColumns = @JoinColumn(name = "category_id")
			)
	private List<Category> categories = new ArrayList<Category>();


	public Product() {
		super();
	}

	public Product(String name, Double price, Date expirationDate, String barcode,
			Manufacturer manufacturer, SupplierCompany company) {
		super();
		this.name = name;
		this.price = price;
		this.expirationDate = expirationDate;
		this.barcode = barcode;
		this.manufacturer = manufacturer;
		this.company = company;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public SupplierCompany getCompany() {
		return company;
	}

	public void setCompany(SupplierCompany company) {
		this.company = company;
	}


	public Date getExpiration_date() {
		return expirationDate;
	}


	public void setExpiration_date(Date expirationDate) {
		this.expirationDate = expirationDate;
	}


	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public List<PharmacyProduct> getPharmacyProducts() {
		return pharmacyProducts;
	}

	public void setPharmacyProducts(List<PharmacyProduct> pharmacyProducts) {
		this.pharmacyProducts = pharmacyProducts;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}