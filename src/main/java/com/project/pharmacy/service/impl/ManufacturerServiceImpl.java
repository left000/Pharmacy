package com.project.pharmacy.service.impl;

import org.springframework.stereotype.Service;

import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Manufacturer;
import com.project.pharmacy.repository.IManufacturerRepository;
import com.project.pharmacy.service.interfaces.IManufacturerService;

@Service
public class ManufacturerServiceImpl extends GenericServiceImpl<Manufacturer, Long> implements IManufacturerService {

	private IManufacturerRepository manufacturerRepository;
	
	public ManufacturerServiceImpl(IManufacturerRepository manufacturerRepository) {
		super(manufacturerRepository);
		this.manufacturerRepository = manufacturerRepository;
	}

	
}
