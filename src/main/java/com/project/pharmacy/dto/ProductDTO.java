package com.project.pharmacy.dto;

import java.io.Serializable;
import java.sql.Date;
import com.project.pharmacy.generics.BaseEntity;
import com.project.pharmacy.model.Manufacturer;
import com.project.pharmacy.model.SupplierCompany;

public class ProductDTO extends BaseEntity<Serializable>{

	private String name;
	private Double price;
	private Date expirationDate;
	private String barcode; 	    
	private Manufacturer manufacturer; 	
	private SupplierCompany company;

	public ProductDTO() {
		super();
	}

	public ProductDTO(String name, Double price, Date expirationDate, String barcode,
			Manufacturer manufacturer, SupplierCompany company) {
		super();
		this.name = name;
		this.price = price;
		this.expirationDate = expirationDate;
		this.barcode = barcode;
		this.manufacturer = manufacturer;
		this.company = company;
	}

	
}
