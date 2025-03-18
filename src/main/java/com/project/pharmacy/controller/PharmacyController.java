package com.project.pharmacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.dto.PharmacyDTO;
import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.service.interfaces.IPharmacyService;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController extends GenericController<PharmacyDTO, Long>{

	private IPharmacyService pharmacyService;
	
	public PharmacyController(IPharmacyService pharmacyService) {
		super(pharmacyService);
		this.pharmacyService = pharmacyService;
	}
	

}
