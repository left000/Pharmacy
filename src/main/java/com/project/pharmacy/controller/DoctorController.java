package com.project.pharmacy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.pharmacy.dto.DoctorDTO;
import com.project.pharmacy.generics.GenericController;
import com.project.pharmacy.service.interfaces.IDoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController extends GenericController<DoctorDTO, Long>{

	private IDoctorService doctorService;
	
	public DoctorController(IDoctorService doctorService) {
		super(doctorService);
		this.doctorService = doctorService;
	}

	
}
