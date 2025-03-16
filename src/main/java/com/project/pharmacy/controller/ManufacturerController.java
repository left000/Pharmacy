package com.project.pharmacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.dto.ManufacturerDTO;
import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.service.interfaces.IManufacturerService;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController extends GenericController<ManufacturerDTO, Long>{

	private IManufacturerService manufacturerService;
	
	public ManufacturerController(IManufacturerService manufacturerService) {
		super(manufacturerService);
		this.manufacturerService = manufacturerService;
	}

}
