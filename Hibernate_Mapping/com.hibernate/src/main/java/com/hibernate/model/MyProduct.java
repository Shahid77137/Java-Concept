package com.hibernate.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class MyProduct {
	
    @Id
    private long productId;
    private String name;

	public MyProduct() {
		super();
	}
	public MyProduct(long productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


    
    
    
}
