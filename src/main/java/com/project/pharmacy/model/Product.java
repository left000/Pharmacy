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

	    @ManyToMany
		@JoinTable(
				name = "product_category",
				joinColumns = @JoinColumn(name = "product_id"),
				inverseJoinColumns = @JoinColumn(name = "category_id")
				)
		private List<Category> categories = new ArrayList<Category>();

	    
	    @ManyToOne
	    @JoinColumn(name = "manufacturer_id")
	    private Manufacturer manufacturer; 

	    @ManyToOne
	    @JoinColumn(name = "supply_company_id")
	    private SupplierCompany company;

	    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	    private List<PharmacyProduct> pharmacyProducts = new ArrayList<PharmacyProduct>(); // Associazione con farmacie

    public Product() {
    	super();
    }
    

	public Product(String name, Double price, Date expirationDate, String barcode, SupplierCompany company) {
		super();
		this.name = name;
		this.price = price;
		this.expirationDate = expirationDate;
		this.barcode = barcode;
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
	
    
}