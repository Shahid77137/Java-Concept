package com.spring_practice.model;

public class Travel {
 
    Vehicle v; //here we can store one of its implemented class obj.
	
	
	//constructor injection point
	/*public Travel(Vehicle v) {
		this.v=v;
	} */
	
	//setter injection point
	public void setV(Vehicle v) {
		this.v=v;
	}
	 	
	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
	}
	
}
