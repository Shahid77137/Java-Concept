package com.SpringPractice.constructorInjectionMap;

public class Students {
	private int roll;
	private String name;
	private int marks;
	
	
	//constructor injection point
	public Students(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	public void displayDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}
	
	
	@Override
	public boolean equals(Object obj) {
	
		Students s1= this;
		Students s2=(Students)obj;
		
		if(s1.roll == s2.roll && s1.name.equals(s2.name) && s1.marks == s2.marks)
			return true;
		else
			return false;
		
		
		
	}
	
	@Override
	public int hashCode() {
	
		return this.roll;
	}
}
