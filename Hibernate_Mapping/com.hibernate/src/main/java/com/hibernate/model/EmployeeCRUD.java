package com.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;

public class EmployeeCRUD {

	public static void main(String[] args) {
		
		 EntityManager em = EMUtil.provideEntityManager();

         em.getTransaction().begin();

         Department dept = new Department();
         dept.setDname("Engineering");
        
         Employee emp1 = new Employee();
         emp1.setEname("Manu Manjunatha");
         emp1.setEmail("manu.m@java4coding.com");

         //ASSOCIATE DEPARTMENT WITH EMPLOYEE
         emp1.setDepartment(dept);

        
         Employee emp2 = new Employee();
         emp2.setEname("Advith");
         emp2.setEmail("advith@java4coding.com");

         //ASSOCIATE DEPARTMENT WITH EMPLOYEE
         emp2.setDepartment(dept);
        
         Employee emp3 = new Employee();
         emp3.setEname("Likitha Tyagraj");
         emp3.setEmail("likitha@java4coding.com");

         //ASSOCIATE DEPARTMENT WITH EMPLOYEE
         emp3.setDepartment(dept);

         Set<Employee> s = new HashSet<Employee>();
         s.add(emp1);
         s.add(emp2);
         s.add(emp3);

       
         //ASSOCIATE EMPLOYEES WITH DEPARTMENT
         dept.setEmployees(s);

         em.persist(dept);

         em.getTransaction().commit();

        

        

         em.getTransaction().begin();

         // DEPARTMENT CAN ACCESS EMPLOYEE

         Department d = em.find(Department.class, 1);

         System.out.println("Department id is " + d.getDeptid());

         System.out.println("Department name is " + d.getDname());

        

        

         Set<Employee> e = d.getEmployees();

        

         for (Employee emp : e) {

                 System.out.println("employee id is " + emp.getEmpid());

                 System.out.println("employee name is " + emp.getEname());

                 System.out.println("employee email is " + emp.getEmail());

         }



         // EMPLOYEE CAN ACCESS DEPARTMENT BECAUSE IT IS BIDRECTIONAL

         Employee emp = em.find(Employee.class, 2);

         System.out.println("Employee id is " + emp.getEmpid());

         System.out.println("Employee name is " + emp.getEname());

         System.out.println("Employee email is " + emp.getEmail());

        

         System.out.println("Employee Department is "+emp.getDepartment().getDeptid());

         System.out.println("Employee Department is "+emp.getDepartment().getDname());

        

         em.getTransaction().commit();
		
	}
	
}
