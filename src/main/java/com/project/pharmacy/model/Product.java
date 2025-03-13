package com.project.pharmacy.model;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.project.pharmacy.generics.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product extends BaseEntity<Long> {

	    private String name;
	    private Double price;
	    private Date expiration_date;
	    private String barcode;

	    @ManyToOne
	    @JoinColumn(name = "manufacturer_id")
	    private Manufacturer manufacturer; 

	    @ManyToOne
	    @JoinColumn(name = "category_id")
	    private Category category;

	    @ManyToOne
	    @JoinColumn(name = "supply_company_id")
	    private SupplierCompany company;

	    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	    private List<PharmacyProduct> pharmacyProducts = new ArrayList<PharmacyProduct>(); // Associazione con farmacie

    public Product() {
    	super();
    }
    

	public Product(String name, Double price, Date expiration_date, String barcode,
			String dosage, Category category, SupplierCompany company) {
		super();
		this.name = name;
		this.price = price;
		this.expiration_date = expiration_date;
		this.barcode = barcode;
		this.category = category;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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
		return expiration_date;
	}


	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}


	public String getBarcode() {
		return barcode;
	}


	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	
    
}