package com.project.pharmacy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.PharmacyDTO;
import com.project.pharmacy.dto.PharmacyProductDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Pharmacy;
import com.project.pharmacy.repository.IPharmacyRepository;
import com.project.pharmacy.service.interfaces.IPharmacyService;

@Service
public class PharmacyService extends GenericServiceImpl<Pharmacy, PharmacyDTO, Long> implements IPharmacyService {

	private IPharmacyRepository pharmacyRepository;
	private ModelMapper modelMapper;

	public PharmacyService(IPharmacyRepository pharmacyRepository, ModelMapper modelMapper) {
		super(pharmacyRepository, modelMapper, PharmacyDTO.class, Pharmacy.class);
		this.pharmacyRepository = pharmacyRepository;
		this.modelMapper = modelMapper;
	}

}
