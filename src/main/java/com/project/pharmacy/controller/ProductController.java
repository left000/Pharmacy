package com.project.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.generics.IGenericService;
import com.project.pharmacy.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController extends GenericController<Product, Long>{

	public ProductController(IGenericService<Product, Long> genericService) {
		super(genericService);
	}
	

}

