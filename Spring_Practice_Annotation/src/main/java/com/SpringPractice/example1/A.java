package com.SpringPractice.example1;

import org.springframework.stereotype.Service;

@Service(value = "a1")
public class A {

	public void funA() {	
		System.out.println("inside funA of A");
	}
	
}
