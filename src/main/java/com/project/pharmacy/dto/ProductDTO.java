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
    private ManufacturerDTO manufacturer;  
    private SupplierCompanyDTO company;

	public ProductDTO() {
		super();
	}

	public ProductDTO(String name, Double price, Date expirationDate, String barcode,
			ManufacturerDTO manufacturer, SupplierCompanyDTO company) {
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

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public ManufacturerDTO getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(ManufacturerDTO manufacturer) {
		this.manufacturer = manufacturer;
	}

	public SupplierCompanyDTO getCompany() {
		return company;
	}

	public void setCompany(SupplierCompanyDTO company) {
		this.company = company;
	}


}
