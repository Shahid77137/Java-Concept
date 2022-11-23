package com.masai.DBUtils;

import java.util.Scanner;

import com.masai.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Utils {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		
		Student student = new Student(20, "Soumit", 500);
		
        em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		

		
		
		
		
		// find
		
		Student studenttwo = em.find(Student.class, 20);
		
		if(studenttwo != null) {
			System.out.println(studenttwo);
		}else {
			System.out.println("Student doesn't exists");
		}
		
		
		// Update
		
		System.out.println("Enter roll to give grace marks ");
		int roll=sc.nextInt();
		
		Student studentfour =em.find(Student.class, roll); //if it returns the obj then the obj will be in p.state
		
		
		if(studentfour == null){
			System.out.println("Student does not exist..");
		}
		else
		{
			
			System.out.println("Enter the grace marks");
			int marks=sc.nextInt();
			
			em.getTransaction().begin();
			
			studentfour.setMarks(studentfour.getMarks()+marks);
			
			em.getTransaction().commit();
			
			System.out.println("Marks is graced...");
			
		}
		
		
		// update new process
		
		
		Student s= em.find(Student.class, 20); //persistence state
		
		em.clear(); //detached state
	
		em.getTransaction().begin();
	
		s.setMarks(500);
	
		//em.persist(s);// it will throw duplicate ID related exception
		em.merge(s); //persistence state
	
		em.getTransaction().commit();
	
		em.close();
	
		System.out.println("done");
		
		
		
		
		// delete
		
        
		
		System.out.println("Enter roll to delete ");
		int rolls =sc.nextInt();
		
		Student studentthree = em.find(Student.class, rolls);
		
		if(student != null){
			
			em.getTransaction().begin();
			
			em.remove(student);
			
			em.getTransaction().commit();
			
			
			System.out.println("Student removed....");
			
		}else
			System.out.println("Student not found...");
		
		
		em.close();
		
	}
	
}
