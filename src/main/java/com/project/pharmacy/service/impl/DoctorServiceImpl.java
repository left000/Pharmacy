package com.project.pharmacy.service.impl;

import org.springframework.stereotype.Service;

import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Doctor;
import com.project.pharmacy.repository.IDoctorRepository;
import com.project.pharmacy.service.interfaces.IDoctorService;

@Service
public class DoctorServiceImpl extends GenericServiceImpl<Doctor, Long> implements IDoctorService{

	private IDoctorRepository doctorRepository;
	
	public DoctorServiceImpl(IDoctorRepository doctorRepository) {
		super(doctorRepository);
		this.doctorRepository = doctorRepository;
	}

	
	
}
