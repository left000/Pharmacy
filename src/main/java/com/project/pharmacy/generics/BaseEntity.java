package com.project.pharmacy.generics;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract  class BaseEntity<ID extends Serializable> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

	
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + "]";
	}
	
}
