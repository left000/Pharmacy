package com.project.pharmacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.dto.CategoryDTO;
import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.service.interfaces.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController extends GenericController<CategoryDTO, Long>{

	private ICategoryService categoryService;

	public CategoryController(ICategoryService categoryService) {
		super(categoryService);
		this.categoryService = categoryService;
	}
}
