package com.SpringPractice;

public class B {
	private A a1;

	//constructor injecton point
	public B(A a1) {
		this.a1=a1;
	}
	
	public void showB() {
		System.out.println("inside showB of B");
		System.out.println(a1);	
	}
}
