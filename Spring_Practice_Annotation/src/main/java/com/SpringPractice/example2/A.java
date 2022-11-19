package com.SpringPractice.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired
	private B b1;

	public void funA() {
		System.out.println("inside funA of A");
		System.out.println(b1);
	}
}
