package com.project.pharmacy.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.DrugDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Drug;
import com.project.pharmacy.repository.IDrugRepository;
import com.project.pharmacy.service.interfaces.IDrugService;

@Service
public class DrugServiceImpl extends GenericServiceImpl<Drug,DrugDTO, Long> implements IDrugService{

	private IDrugRepository drugRepository;
	private ModelMapper modelMapper;
	
	public DrugServiceImpl(IDrugRepository drugRepository, ModelMapper modelMapper) {
		super(drugRepository, modelMapper, DrugDTO.class, Drug.class);
		this.drugRepository = drugRepository;
	}

}
