package com.goldilocks;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give here your input to Print output");
		System.out.println("If you want to stop typing write Cancel");
		String input;
		while(!(input=sc.nextLine()).equalsIgnoreCase("CANCEL")) {
			System.out.println(input);
		}
	}

}
