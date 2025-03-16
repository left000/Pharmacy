package com.project.pharmacy.dto;

import java.io.Serializable;

import com.project.pharmacy.generics.BaseEntity;

public class SupplierCompanyDTO extends BaseEntity<Serializable>{

	private String name;
	private String adress;
	private String telf;
	
    public SupplierCompanyDTO() {
    	super();
    }
    
	public SupplierCompanyDTO(String name, String adress, String telf) {
		super();
		this.name = name;
		this.adress = adress;
		this.telf = telf;
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

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}
	
	
}
