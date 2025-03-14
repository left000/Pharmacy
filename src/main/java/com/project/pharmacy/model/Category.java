package com.project.pharmacy.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    
	
	@ManyToMany(mappedBy = "categories")
	private List<Product> products = new ArrayList<Product>();
	
//    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
//    private List<Product> products = new ArrayList<>();

    public Category() {
    	super();
    }
	public Category(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
    
	
}
