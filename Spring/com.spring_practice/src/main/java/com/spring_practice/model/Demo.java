package com.spring_practice.model;

public class Demo {

	public static void main(String[] args) {
		
        Travel tr=new Travel();
		
		tr.setV(new Car()); // injecting the dependency obj to the dependent, by calling setter method.
		
		tr.journey();
		
	}
	
}
