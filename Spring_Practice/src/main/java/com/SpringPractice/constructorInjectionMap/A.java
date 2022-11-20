package com.SpringPractice.constructorInjectionMap;

import java.util.Map;

public class A {
private Map<Students, String> theMap;
	

	public void setTheMap(Map<Students,String> theMap) {
		this.theMap = theMap;
	}



	public void show() {
		
		System.out.println("inside showA of A ");
	
		System.out.println(theMap);
		
	}
}
