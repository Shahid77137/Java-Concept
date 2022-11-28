package com.goldilocks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MemoryMap {
	public static Map<String,Integer> students=new LinkedHashMap<>();
	public static boolean isNumberic(String word) {
		try {
			Integer.parseInt(word);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice="";
		do {
			System.out.println("Please Choose a option");
			System.out.println("Type 1 to add new Person to the data");
			System.out.println("Type 2 to show all the data at once");
			System.out.println("Type 3 to get the age using the person name");
			System.out.println("Type 0 to exit");
			choice=sc.nextLine();
			if(choice.equals("1")) {
				System.out.println("Type the Student Name");
				String name=sc.nextLine();
				System.out.println("Enter the the age of the Student should be between 15-45");
				String age=sc.next();
				sc.nextLine();
				while(!isNumberic(age)||Integer.parseInt(age)>40||Integer.parseInt(age)<12) {
					System.out.println("Please Provide valid age , age should between 12 to 40 only and check the format as well");
					age=sc.next();
					sc.nextLine();
				}
				students.put(name,Integer.parseInt(age));
			}else if(choice.equals("2")) {
				if(students.isEmpty()) {
					System.out.println("Student data is empty");
				}else {
					int index=1;
					System.out.println("Index"+"\t\t"+"Name"+"\t\t"+"Age");
					students.forEach((name,age)->{
						System.out.println(index+"\t\t"+name+"\t\t"+age);
					});
				}
				
			}else if(choice.equals("3")) {
				System.out.println("Type the name of the students to get the age");
				String name=sc.nextLine();
				if(students.containsKey(name)) {
					System.out.println("Student name is "+name+" and his/her age is "+students.get(name));
				}else {
					System.out.println("Student not found");
				}
				
			}
		}while(!choice.equals("0"));
		System.out.println("Thank You");
	}
}
