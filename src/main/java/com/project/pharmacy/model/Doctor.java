package com.project.pharmacy.model;

import java.util.ArrayList;
import java.util.List;

import com.project.pharmacy.generics.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor extends BaseEntity<Long>{

	private String name;
	private String surname;
	private String telf;
	private String email;

	@OneToMany(mappedBy = "doctor")
	private List<Prescription> prescriptions = new ArrayList<Prescription>();

	@ManyToMany
	@JoinTable(
			name = "doctor_specialization",
			joinColumns = @JoinColumn(name = "doctor_id"),
			inverseJoinColumns = @JoinColumn(name = "specialization_id")
			)
	private List<Specialization> specializations = new ArrayList<Specialization>();

	@ManyToMany
	@JoinTable(
			name = "clinic_doctor",
			joinColumns = @JoinColumn(name = "doctor_id"), 
			inverseJoinColumns = @JoinColumn(name = "clinic_id"))
	private List<Clinic> clinics = new ArrayList<Clinic>();

	public Doctor(String name, String surname, String telf, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.telf = telf;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelf() {
		return telf;
	}

	public void setTelf(String telf) {
		this.telf = telf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public List<Specialization> getSpecializations() {
		return specializations;
	}

	public void setSpecializations(List<Specialization> specializations) {
		this.specializations = specializations;
	}

	public List<Clinic> getClinics() {
		return clinics;
	}

	public void setClinics(List<Clinic> clinics) {
		this.clinics = clinics;
	}


}
