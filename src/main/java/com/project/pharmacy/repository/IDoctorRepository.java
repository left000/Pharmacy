package com.project.pharmacy.repository;

import org.springframework.stereotype.Repository;

import com.project.pharmacy.generics.GenericRepository;
import com.project.pharmacy.model.Doctor;

@Repository
public interface IDoctorRepository extends GenericRepository<Doctor, Long>{

}
