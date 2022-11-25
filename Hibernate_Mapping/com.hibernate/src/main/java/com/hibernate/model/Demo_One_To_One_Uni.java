package com.hibernate.model;

import jakarta.persistence.EntityManager;

public class Demo_One_To_One_Uni {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();

        em.getTransaction().begin();

        Employee_One_to_One_Uni emp = new Employee_One_to_One_Uni();

        emp.setName("Manu Manjunatha");

        emp.setEmpid(1);

        EmployeeDetails_One_To_One_Uni empdetail = new EmployeeDetails_One_To_One_Uni();

        empdetail.setAge(26);

        empdetail.setState("Karnataka");

        empdetail.setEmpid(1);

        emp.setEmployeedetails(empdetail);

         em.persist(emp);

        // Employee can access EmployeeDetails

         Employee_One_to_One_Uni e = em.find(Employee_One_to_One_Uni.class, 1);

        System.out.println(e.getName());

        System.out.println(e.getEmployeedetails().getState());

        // EmployeeDetails can not access Employee

        em.getTransaction().commit();
		
	}
	
}
