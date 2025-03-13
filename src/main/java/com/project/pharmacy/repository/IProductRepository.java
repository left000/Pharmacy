package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Product;

@Repository
public interface IProductRepository extends GenericRepository<Product, Long> {
	// Create Native Query
}