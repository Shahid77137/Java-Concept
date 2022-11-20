package com.SpringPractice.Injecting_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo6 {
public static void main(String[] args) {
		
		
		//activate the spring container by locating the spring configuration file..
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
				
		A a =  ctx.getBean("ai18",A.class);//pulling the A obj
		
		a.show();

	}
}
