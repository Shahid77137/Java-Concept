package com.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyBusinessClass mb = ctx.getBean(MyBusinessClass.class, "mb");

		mb.fun1();
	}

}
