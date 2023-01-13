package com.masai.practice;

public class StringBuilder_SringBuffer {
public static void main(String[] args) {
	
//	Both StringBuilder and String buffer provides mutable sequence for characters;
//	Both StringBuilder and String buffer classes are final so they cann't inherited;
//	StringBuilder is faster than StringBuffer;
	StringBuilder sb = new StringBuilder("Technology");
	System.out.println(sb.length());
	System.out.println(sb.capacity());
//	sb.setLength(18);
	System.out.println(sb.length());
	System.out.println(sb.capacity());
	sb.setCharAt(0, 't');
	System.out.println(sb);
	System.out.println(sb.substring(5));
	System.out.println(sb.substring(0, 5));
	sb.append("ies");
	System.out.println(sb);
	sb.deleteCharAt(9);
    System.out.println(sb);
    sb.insert(9, 'y');
    System.out.println(sb);
    sb.delete(10, sb.length());
    System.out.println(sb);
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    sb.reverse();
    System.out.println(sb);
    
}
}
