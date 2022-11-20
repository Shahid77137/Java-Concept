package com.SpringPractice.constructorInjection;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo7 {

	public static void main(String[] args) {

		// activate the spring container by locating the spring configuration file..

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		College collage = ctx.getBean("cl1", College .class);

		List<Student> students = collage.getStudents();

		System.out.println("Collage name is " + collage.getCollageName());

		System.out.println("-----------------------------");

		students.forEach(new Consumer<Student>() {
			public void accept(Student student) {

				student.displayDetails();
				System.out.println("==================");
			}
		});

	}

}
