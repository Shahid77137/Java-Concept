package com.masai.practice;

public class CompareString {

	public static void main(String[] args) {
		System.out.println("Java".equals("Java"));
		System.out.println("Java".equals("java"));
		System.out.println("Java".equalsIgnoreCase("java"));
		System.out.println("Java".compareTo("Css"));
		System.out.println("Java".compareTo("java"));
		System.out.println("java".compareTo("Java"));
		System.out.println("Java".compareToIgnoreCase("java"));
		String st = new String("Tech");
		System.out.println(st.endsWith("ch"));
		System.out.println(st.startsWith("te"));
		System.out.println("technology".indexOf('n'));
		System.out.println("technology".indexOf('o'));
		System.out.println("technology".lastIndexOf('o'));
		
//		SubString Methods
        System.out.println("technology".substring(5));
        System.out.println("technology".substring(0, 4));

//      Replace Methode
        System.out.println("Look".replace('L', 'B'));
        System.out.println("Store".replaceAll("Store", "Flore"));
        System.out.println("java".toUpperCase());
        System.out.println("PYTHON".toLowerCase());
        
//      == operrator checks for Memory loction of two objects
//      where as equals() methods checks content of two string object
//      new keyword help to create an object 
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.err.println(s3 == s4);
        System.out.println(s3.equals(s4));
        String s5 = new String("Masai");
        String s6 = "Masai";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));
        
        
	}
	
}
