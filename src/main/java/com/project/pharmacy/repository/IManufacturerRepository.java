package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Manufacturer;
 
@Repository
public interface IManufacturerRepository extends GenericRepository<Manufacturer,Long >{

}
