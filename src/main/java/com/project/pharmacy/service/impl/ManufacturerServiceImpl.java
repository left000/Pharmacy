package com.project.pharmacy.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.project.pharmacy.dto.ManufacturerDTO;
import com.project.pharmacy.generics.GenericServiceImpl;
import com.project.pharmacy.model.Manufacturer;
import com.project.pharmacy.repository.IManufacturerRepository;
import com.project.pharmacy.service.interfaces.IManufacturerService;

@Service
public class ManufacturerServiceImpl extends GenericServiceImpl<Manufacturer, ManufacturerDTO, Long> implements IManufacturerService {

	private IManufacturerRepository manufacturerRepository;
	private ModelMapper modelMapper;

    public ManufacturerServiceImpl(IManufacturerRepository manufacturerRepository, ModelMapper modelMapper) {
        super(manufacturerRepository, modelMapper, ManufacturerDTO.class, Manufacturer.class);
        this.manufacturerRepository = manufacturerRepository;
        this.modelMapper = modelMapper;
    }
	
}
