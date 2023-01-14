package com.masai.practice;

import java.util.Arrays;

public class StringDemo {
public static void main(String[] args) {
	String str1 = new String("Tech");
	String str2 = str1;
	str2 = str2 +"nologies";
//	Initially str1 and str2 both pointing to same object but as the str2 = str2 + "nologies"; executes then new object will be created and str2 will start
//	pointing to new object whose content is Technologies str1 will keep remain to earlier object whose content is Tech. 
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str2.equals(str1));
	byte brr[] = str2.getBytes();
	System.out.println(Arrays.toString(brr));
	char[] chararr = str1.toCharArray();
	System.out.println(Arrays.toString(chararr));
	String statement = "Shahid of age " + 16 + " Years has Scored " + 95.5 + "% in class 10th";
	System.out.println(statement);
	String state = "Shahid of age " + String.valueOf(16) + " years has Scored " + String.valueOf(95.5) + "% in class 10th";
	System.out.println(state);
	
	
	
}
}
