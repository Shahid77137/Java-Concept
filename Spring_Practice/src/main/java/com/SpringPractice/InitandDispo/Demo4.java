package com.SpringPractice.InitandDispo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo4 {
	public static void main(String[] args) {
		//activate the spring container by locating the spring configuration file..
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		A obj =  ctx.getBean("a1",A.class);
		obj.funA();
	}
}
