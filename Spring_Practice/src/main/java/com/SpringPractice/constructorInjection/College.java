package com.SpringPractice.constructorInjection;

import java.util.List;

public class College {

private String collageName;
	
	private List<Student> students;	


	public String getCollageName() {
		return collageName;
	}

	//constructor injection point for collageName
	public College(String collageName) {
		this.collageName = collageName;
	}

	//setter injection point for List
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}
	
}
