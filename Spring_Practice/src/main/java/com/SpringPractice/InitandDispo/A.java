package com.SpringPractice.InitandDispo;

public class A {
private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void mySetup() {
		System.out.println("Inside mySetup method to write any initialization logic...");
		System.out.println("message is: "+message);
	}
	
	public void funA() {	
		System.out.println("Inside funA of A");
	}
}
