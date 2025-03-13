package com.project.pharmacy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PrescriptionDrug {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "prescription_id")
	private Prescription prescription;
	
	@ManyToOne
	@JoinColumn(name = "drug_id")
	private Drug drug;
	
	private Integer quantity;

	public PrescriptionDrug() {
		super();
	}
	public PrescriptionDrug(Long id, Prescription prescription, Drug drug, Integer quantity) {
		super();
		this.id = id;
		this.prescription = prescription;
		this.drug = drug;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Prescription getPrescription() {
		return prescription;
	}
	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}
	public Drug getDrug() {
		return drug;
	}
	public void setDrug(Drug drug) {
		this.drug = drug;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
