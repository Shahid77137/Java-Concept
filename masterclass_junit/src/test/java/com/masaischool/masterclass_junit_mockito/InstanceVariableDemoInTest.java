package com.masaischool.masterclass_junit_mockito;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class InstanceVariableDemoInTest {
	static int i = 100;	//class variable, common variable for all the objects
	int j = 10;	//instance variable, separate for every object
	
	@BeforeEach
	void start() {
		System.out.println("#");
		i++;	//increasing the value of class variable
		j--;	//decreasing the value of instance variable
	}
	
	@Test
	void testOne() {
		System.out.println("Inside testOne, i = " + i + " j = " + j);
	}
	
	@Test
	void testTwo() {
		System.out.println("Inside testTwo, i = " + i + " j = " + j);
	}
	
	@AfterEach
	void stop() {
		System.out.println("$");
		i++;	//increasing the value of class variable
		j--;	//decreasing the value of instance variable
	}
}

//Output
//#
//Inside testOne, i = 101 j = 9
//$
//#
//Inside testTwo, i = 103 j = 9
//$

//Explanation: For every test method,
//A new object of test class will be created so instance variables will be created new for every test method
//means changes made in the instance variable for one test method is not applicable for another test method

//Note: If you want to create a common object for all the test methods then you have to add following code at the top of the Test class
//@TestInstance(Lifecycle.PER_CLASS)
//#
//Inside testOne, i = 101 j = 9
//$
//#
//Inside testTwo, i = 103 j = 7
//$