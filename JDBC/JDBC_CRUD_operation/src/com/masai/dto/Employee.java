package com.masai.dto;

import java.time.LocalDate;

public interface Employee {

	public String getEmpId();
	public void setEmpId(String empId);
	public String getName();
	public void setName(String name);
	public double getSalary();
	public void setSalary(double salary);
	public LocalDate getDate();
	public void setDate(LocalDate date);
	
}
