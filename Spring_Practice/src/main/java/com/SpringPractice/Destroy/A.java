package com.SpringPractice.Destroy;

public class A {
private String message;
	
	public void destroy() {	
		System.out.println("inside destroy method..here we can write resource releasing logic..");
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void mySetup() {
		System.out.println("inside mySetup method to write any initialization logic...");
		System.out.println("message is :"+message);
	}
	
	public void funA() {	
		System.out.println("inside funA of A");
	}
}
