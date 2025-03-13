package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Product;

@Repository
public interface ProductRepository extends GenericRepository<Product, Long> {
	
	// query nativa
	
}