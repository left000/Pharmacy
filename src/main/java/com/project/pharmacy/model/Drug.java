package com.project.pharmacy.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Drug extends Product {
   
	private String activeIngredient;
    private String dosage;
    private Boolean prescriptionRequired;

    @OneToMany(mappedBy = "drug")
    private List<PrescriptionDrug> prescriptionDrugs = new ArrayList<PrescriptionDrug>();  // Lista di prescrizioni associate a questo farmaco

    public Drug() {
    	super();
    }
    
    
	public Drug(String name, Double price, Date expirationDate, String barcode, String dosage, 
			SupplierCompany company, String activeIngredient, Boolean prescriptionRequired
			) {
		super(name, price, expirationDate, barcode, company);
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

	public List<PrescriptionDrug> getPrescriptionDrugs() {
		return prescriptionDrugs;
	}

	public void setPrescriptionDrugs(List<PrescriptionDrug> prescriptionDrugs) {
		this.prescriptionDrugs = prescriptionDrugs;
	}

  
    
    
}

