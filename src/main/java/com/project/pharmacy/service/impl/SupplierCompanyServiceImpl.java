package com.project.pharmacy.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.SupplierCompanyDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.SupplierCompany;
import com.project.pharmacy.repository.ISupplierCompanyRepository;
import com.project.pharmacy.service.interfaces.ISupplierCompanyService;

@Service
public class SupplierCompanyServiceImpl extends GenericServiceImpl<SupplierCompany,SupplierCompanyDTO, Long> implements ISupplierCompanyService {

	private ISupplierCompanyRepository supplierCompanyRepository; 
	private ModelMapper modelMapper;

	public SupplierCompanyServiceImpl(ISupplierCompanyRepository supplierCompanyRepository, ModelMapper modelMapper) {
		super(supplierCompanyRepository, modelMapper, SupplierCompanyDTO.class, SupplierCompany.class);
		this.supplierCompanyRepository = supplierCompanyRepository;
	}
	
}
