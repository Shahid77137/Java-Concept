package com.SpringPractice.Destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5 {
	public static void main(String[] args) {
		//activate the spring container by locating the spring configuration file..
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		A obj =  ctx.getBean("a16",A.class);
		obj.funA();
		ClassPathXmlApplicationContext ctx2= (ClassPathXmlApplicationContext)ctx;
		ctx2.close();
	}
}
