package com.project.pharmacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.model.SupplierCompany;
import com.project.pharmacy.service.interfaces.ISupplierCompanyService;

@RestController
@RequestMapping("/company")
public class SupplierCompanyController extends GenericController<SupplierCompany, Long>{

	private ISupplierCompanyService supplierCompanyService;
	
	public SupplierCompanyController(ISupplierCompanyService supplierCompanyService) {
		super(supplierCompanyService);
		this.supplierCompanyService = supplierCompanyService;
	}

	
	
}
