package com.hibernate.model;

import jakarta.persistence.Entity;

@Entity
public class MyEmployee extends Person {
    private String company;
    // constructor, getters, setters 

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public MyEmployee(String company) {
		this.company = company;
	}

    

}
