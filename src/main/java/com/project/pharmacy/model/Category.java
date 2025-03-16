package com.project.pharmacy.model;


import java.util.ArrayList;
import java.util.List;

import com.project.pharmacy.generics.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


@Entity
public class Category extends BaseEntity<Long> {

    private String name;
    private String description;
	
	@ManyToMany(mappedBy = "categories")
	private List<Product> products = new ArrayList<Product>();
	
    public Category() {
    	super();
    }
	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
    
	
}
