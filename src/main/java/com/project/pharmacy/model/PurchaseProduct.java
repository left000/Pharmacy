package com.project.pharmacy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PurchaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "purchase_id")
    private Purchases purchases;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    private Integer quantity;

	public PurchaseProduct(Long id, Purchases purchases, Product product, Integer quantity) {
		super();
		this.id = id;
		this.purchases = purchases;
		this.product = product;
		this.quantity = quantity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPurchases(Purchases purchases) {
		this.purchases = purchases;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
    
    
}
