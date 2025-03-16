package com.project.pharmacy.dto;

import java.io.Serializable;

import com.project.pharmacy.generics.BaseEntity;

public class CategoryDTO extends BaseEntity<Serializable>{

	private String name;
	private String description;

	public CategoryDTO() {
		super();
	}

	public CategoryDTO(String name, String description) {
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
