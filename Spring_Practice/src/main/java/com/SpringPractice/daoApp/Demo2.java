package com.SpringPractice.daoApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
public static void main(String[] args) {
	
	ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	PresentationBean pbean =  ctx.getBean("pb",PresentationBean.class);
	
	pbean.present();
}
	
}
