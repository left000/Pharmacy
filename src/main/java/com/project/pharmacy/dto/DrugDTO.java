package com.project.pharmacy.dto;


import com.project.pharmacy.model.Product;

import jakarta.validation.constraints.NotNull;

public class DrugDTO extends Product{

	
	@NotNull
	private String activeIngredient;
	@NotNull
    private String dosage;
	@NotNull
    private Boolean prescriptionRequired;
	
    public DrugDTO() {
    	super();
    }
    
    public DrugDTO(String activeIngredient, String dosage, Boolean prescriptionRequired) {
		super();
		this.activeIngredient = activeIngredient;
		this.dosage = dosage;
		this.prescriptionRequired = prescriptionRequired;
	}

	public String getActiveIngredient() {
		return activeIngredient;
	}

	public void setActiveIngredient(String activeIngredient) {
		this.activeIngredient = activeIngredient;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public Boolean getPrescriptionRequired() {
		return prescriptionRequired;
	}

	public void setPrescriptionRequired(Boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}
	
}
