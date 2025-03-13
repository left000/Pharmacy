package com.project.pharmacy.model;

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
public class Purchases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double totalPrice;
    private String dataTime;
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "pharmamcy_id")
    private Pharmacy pharmacy;
    
    @ManyToOne
	@JoinColumn(name = "prescription_id")
	private Prescription prescription;
    
    @OneToMany(mappedBy = "purchases", cascade = CascadeType.ALL)
    private List<PurchaseProduct> purchaseProducts = new ArrayList<PurchaseProduct>();

    public Purchases() {
    	super();
    }
    
	public Purchases(Long id, Pharmacy pharmacy, String dataTime,String paymentMethod, Double totalPrice ) {
		super();
		this.id = id;
		this.pharmacy = pharmacy;
		this.dataTime = dataTime;
		this.totalPrice = totalPrice;
		this.paymentMethod = paymentMethod;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pharmacy getPharmacy() {
		return pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}

	public String getDataTime() {
		return dataTime;
	}

	public void setDataTime(String dataTime) {
		this.dataTime = dataTime;
	}

	public List<PurchaseProduct> getPurchaseProducts() {
		return purchaseProducts;
	}

	public void setPurchaseProducts(List<PurchaseProduct> purchaseProducts) {
		this.purchaseProducts = purchaseProducts;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
    
	
    
}

