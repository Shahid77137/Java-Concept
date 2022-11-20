package com.SpringPractice.daoApp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//activate the spring container by locating the spring configuration file..
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo3 d=  ctx.getBean("d1",Demo3.class);
		d.showDetails();
	}
}
