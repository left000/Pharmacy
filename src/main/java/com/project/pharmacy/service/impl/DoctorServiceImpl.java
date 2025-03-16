package com.project.pharmacy.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.DoctorDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Doctor;
import com.project.pharmacy.repository.IDoctorRepository;
import com.project.pharmacy.service.interfaces.IDoctorService;

@Service
public class DoctorServiceImpl extends GenericServiceImpl<Doctor,DoctorDTO, Long> implements IDoctorService{

	private IDoctorRepository doctorRepository;
	private ModelMapper modelMapper;
	
	public DoctorServiceImpl(IDoctorRepository doctorRepository, ModelMapper modelMapper) {
		super(doctorRepository, modelMapper, DoctorDTO.class, Doctor.class);
		this.doctorRepository = doctorRepository;
	}

	
	
}
