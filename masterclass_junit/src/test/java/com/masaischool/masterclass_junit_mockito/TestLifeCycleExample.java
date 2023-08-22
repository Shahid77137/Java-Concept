package com.masaischool.masterclass_junit_mockito;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifeCycleExample {
	@BeforeAll
	static void init() {
		System.out.println("Inside @BeforeAll");
	}
	
	@BeforeEach
	void start() {
		System.out.println("Inside @BeforeEach");
	}
	
	@Test
	void testOne() {
		System.out.println("Inside @Test testOne");
	}
	
	@Test
	void testTwo() {
		System.out.println("Inside @Test testTwo");
	}
	
	@Test
	void testThree() {
		System.out.println("Inside @Test testThree");
	}
	
	@AfterEach
	void stop() {
		System.out.println("Inside @AfterEach");
	}
	
	@AfterAll
	static void destroy() {
		System.out.println("Inside @AfterAll");
	}
}

//Output
//Inside @BeforeAll
//Inside @BeforeEach
//Inside @Test testOne
//Inside @AfterEach
//Inside @BeforeEach
//Inside @Test testTwo
//Inside @AfterEach
//Inside @BeforeEach
//Inside @Test testThree
//Inside @AfterEach
//Inside @AfterAll