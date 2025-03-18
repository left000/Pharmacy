package com.project.pharmacy.dto;

import java.sql.Date;

import com.project.pharmacy.generics.BaseEntity;
import com.project.pharmacy.model.Manufacturer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class ManufacturerDTO extends BaseEntity<Long>{
	
	@NotNull
    private String name;
	@NotNull
    private String address;
	@NotNull
	@Email(message = "tiene que tener une email valida") // Solo en los logs / System.out
    private String email;
	@NotNull
    private String country;
	@NotNull
    private Date yearFounded;

    public ManufacturerDTO() {
    	super();
    }
    
    public ManufacturerDTO(Manufacturer manufacturer) {
        this.name = manufacturer.getName();
        this.address = manufacturer.getAddress();
        this.email = manufacturer.getEmail();
        this.country = manufacturer.getCountry();
        this.yearFounded = manufacturer.getYearFounded();
       
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
    
}