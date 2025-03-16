package com.project.pharmacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.dto.DrugDTO;
import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.service.interfaces.IDrugService;

@RestController
@RequestMapping("/drug")
public class DrugController extends GenericController<DrugDTO, Long>{

	private IDrugService drugService;
	
	public DrugController(IDrugService drugService) { 
		super(drugService);
		this.drugService = drugService; 
	}
	

}
