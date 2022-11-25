package com.hibernate.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee_One_to_One_Uni  {


        @Id
        @Column(name = "EMPID")
        private int empid;
       
        private String name;

        @OneToOne(cascade = CascadeType.ALL )
        @JoinColumn(name = "EMPID")
        private Employeedetail employeedetails;

		public int getEmpid() {
			return empid;
		}

		public void setEmpid(int empid) {
			this.empid = empid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Employeedetail getEmployeedetails() {
			return employeedetails;
		}

		public void setEmployeedetails(Employeedetail employeedetails) {
			this.employeedetails = employeedetails;
		}

			//getters and setters

        
        
}