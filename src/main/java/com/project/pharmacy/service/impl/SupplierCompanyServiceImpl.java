package com.project.pharmacy.service.impl;

import org.springframework.stereotype.Service;

import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.SupplierCompany;
import com.project.pharmacy.repository.ISupplierCompanyRepository;
import com.project.pharmacy.service.interfaces.ISupplierCompanyService;

@Service
public class SupplierCompanyServiceImpl extends GenericServiceImpl<SupplierCompany, Long> implements ISupplierCompanyService {

	private ISupplierCompanyRepository supplierCompanyRepository; 
	
	public SupplierCompanyServiceImpl(ISupplierCompanyRepository supplierCompanyRepository) {
		super(supplierCompanyRepository);
		this.supplierCompanyRepository = supplierCompanyRepository;
	}
	
}
