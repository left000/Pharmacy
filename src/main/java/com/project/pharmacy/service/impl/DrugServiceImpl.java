package com.project.pharmacy.service.impl;

import org.springframework.stereotype.Service;

import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Drug;
import com.project.pharmacy.repository.IDrugRepository;
import com.project.pharmacy.service.interfaces.IDrugService;

@Service
public class DrugServiceImpl extends GenericServiceImpl<Drug, Long> implements IDrugService{

	private IDrugRepository drugRepository;

	public DrugServiceImpl(IDrugRepository drugRepository) {
		super(drugRepository);
		this.drugRepository = drugRepository;
	}

}
