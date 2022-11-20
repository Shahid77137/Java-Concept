package com.SpringPractice.Injecting_Collections;

import java.util.List;

public class A {
	//collection type dependency
		private List<String> names;

		
		//setter injection point
		public void setNames(List<String> names) {
			this.names = names;
		}


		public void show() {
			
			System.out.println("inside showA of A ");
			System.out.println(names); 		

		}	
}
