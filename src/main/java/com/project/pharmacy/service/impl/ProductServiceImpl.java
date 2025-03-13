package com.project.pharmacy.service.impl;

import org.springframework.stereotype.Service;

import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Product;
import com.project.pharmacy.repository.ProductRepository;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Long>{

	public ProductServiceImpl(ProductRepository productRepository) {
        super(productRepository);
    }
}
