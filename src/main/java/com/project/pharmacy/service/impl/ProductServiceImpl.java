package com.project.pharmacy.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.ProductDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Product;
import com.project.pharmacy.repository.IProductRepository;
import com.project.pharmacy.service.interfaces.IProductService;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product,ProductDTO, Long> implements IProductService{
	
    private IProductRepository productRepository;
	private ModelMapper modelMapper; 

	public ProductServiceImpl(IProductRepository productRepository, ModelMapper modelMapper) {
        super(productRepository, modelMapper, ProductDTO.class, Product.class);
        this.productRepository = productRepository; 
    }

}
