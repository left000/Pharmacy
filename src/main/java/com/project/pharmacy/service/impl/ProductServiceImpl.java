package com.project.pharmacy.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Product;
import com.project.pharmacy.repository.IProductRepository;
import com.project.pharmacy.service.interfaces.IProductService;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Long> implements IProductService{
	
    private IProductRepository productRepository;

	public ProductServiceImpl(IProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository; 
    }

	@Override
	public List<Product> findByCategory(String category) {
		return null;
	}
	
}
