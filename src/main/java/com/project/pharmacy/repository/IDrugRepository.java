package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Drug;

@Repository
public interface IDrugRepository extends GenericRepository<Drug, Long>{
	// Create Native Query 
}
