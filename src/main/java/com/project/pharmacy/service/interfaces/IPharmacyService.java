package com.project.pharmacy.service.interfaces;


import org.springframework.stereotype.Repository;

import com.project.pharmacy.dto.PharmacyDTO;
import com.project.pharmacy.generics.IGenericService;

@Repository
public interface IPharmacyService extends IGenericService<PharmacyDTO, Long>{


}

