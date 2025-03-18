package com.project.pharmacy.dto;

import java.io.Serializable;
import java.util.List;

import com.project.pharmacy.generics.BaseEntity;

import jakarta.validation.constraints.NotNull;

public class PharmacyProductDTO extends BaseEntity<Serializable> {

	@NotNull
	private String name;
	@NotNull
	private List<ProductDTO> products;

	public PharmacyProductDTO() {
		super();
	}
	public PharmacyProductDTO( String name, List<ProductDTO> products) {
		this.name = name;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

}
