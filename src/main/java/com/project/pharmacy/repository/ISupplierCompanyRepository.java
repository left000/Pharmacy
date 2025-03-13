package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.SupplierCompany;

@Repository
public interface ISupplierCompanyRepository extends GenericRepository<SupplierCompany, Long> {

}
