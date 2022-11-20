package com.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {
	public static void main(String[] args) {
		// activate the spring container by locating the spring configuration file..
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = ctx.getBean("aid", A.class); // pulling the A obj
		a.showA();
	}
}
