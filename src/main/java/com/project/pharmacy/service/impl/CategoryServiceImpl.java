package com.project.pharmacy.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.CategoryDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Category;
import com.project.pharmacy.repository.ICategoryRepository;
import com.project.pharmacy.service.interfaces.ICategoryService;

@Service
public class CategoryServiceImpl extends GenericServiceImpl<Category, CategoryDTO, Long> implements ICategoryService{

	private ICategoryRepository categoryRepository;
	private ModelMapper modelMapper; 
	
	public CategoryServiceImpl(ICategoryRepository categoryRepository, ModelMapper modelMapper) {
		super(categoryRepository, modelMapper, CategoryDTO.class, Category.class);
		this.categoryRepository = categoryRepository;
		this.modelMapper = modelMapper;
	}	

}
