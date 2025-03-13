package com.project.pharmacy.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Prescription {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateIssued; // data di emissione
	private Date validUntil; // valido fino 
	private String patientName;
	private String medicationDetails;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	@OneToMany(mappedBy = "prescription")
	private List<Purchases> purchases = new ArrayList<Purchases>();
	
	@OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
	private List<PrescriptionDrug> prescriptionDrugs = new ArrayList<PrescriptionDrug>();

	public Prescription() {
		super();
	}
	public Prescription(Long id, Date dateIssued, Date validUntil, String patientName, String medicationDetails,
			Doctor doctor) {
		super();
		this.id = id;
		this.dateIssued = dateIssued;
		this.validUntil = validUntil;
		this.patientName = patientName;
		this.medicationDetails = medicationDetails;
		this.doctor = doctor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateIssued() {
		return dateIssued;
	}
	public void setDateIssued(Date dateIssued) {
		this.dateIssued = dateIssued;
	}
	public Date getValidUntil() {
		return validUntil;
	}
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getMedicationDetails() {
		return medicationDetails;
	}
	public void setMedicationDetails(String medicationDetails) {
		this.medicationDetails = medicationDetails;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public List<Purchases> getPurchases() {
		return purchases;
	}
	public void setPurchases(List<Purchases> purchases) {
		this.purchases = purchases;
	}
	public List<PrescriptionDrug> getPrescriptionDrugs() {
		return prescriptionDrugs;
	}
	public void setPrescriptionDrugs(List<PrescriptionDrug> prescriptionDrugs) {
		this.prescriptionDrugs = prescriptionDrugs;
	}


	
}
