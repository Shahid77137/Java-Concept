package com.SpringPractice.daoApp2;

public class Demo3 {
	private A a1;
	private A a2;
	private B b1;
	
	public Demo3() {
		System.out.println("inside zero argument constructor..");
	}
	
	public Demo3(B b1, A a1) {
		this.b1=b1;
		this.a1=a1;
		System.out.println("inside 2 argument constructor..");
	}
	
	public Demo3(B b1, A a1,A a2) {
		this.b1=b1;
		this.a1=a1;
		this.a2=a2;
		System.out.println("inside 3 argument constructor..");
	}

	public void showDetails() {
		System.out.println("inside showDetails....");
		System.out.println("b1 is :"+ b1);
		System.out.println("a1 is :"+ a1);
		System.out.println("a2 is :"+ a2);
	}
}
