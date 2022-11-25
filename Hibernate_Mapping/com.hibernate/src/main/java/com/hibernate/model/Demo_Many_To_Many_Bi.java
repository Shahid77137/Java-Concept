package com.hibernate.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;

public class Demo_Many_To_Many_Bi {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();

		 

        em.getTransaction().begin();

        Course_Many_To_Many_Bi c1 = new Course_Many_To_Many_Bi();
        c1.setCname("JAVA");

        Course_Many_To_Many_Bi c2 = new Course_Many_To_Many_Bi();
        c2.setCname("SERVLET");

        Course_Many_To_Many_Bi c3 = new Course_Many_To_Many_Bi();
        c3.setCname("JSP");

        Students_Many_To_Many_Bi s1 = new Students_Many_To_Many_Bi();
        s1.setSname("Manu Manjunatha");

        Students_Many_To_Many_Bi s2 = new Students_Many_To_Many_Bi();
        s2.setSname("Advith Tyagraj");


        Set<Course_Many_To_Many_Bi> sc = new HashSet<Course_Many_To_Many_Bi>();
        sc.add(c1);
        sc.add(c2);
        sc.add(c3);

        Set<Students_Many_To_Many_Bi> ss = new HashSet<Students_Many_To_Many_Bi>();
        ss.add(s1);
        ss.add(s2);

        // ASSOCIATING STUDENT WITH COURSE

        c1.setStudents(ss);
        c2.setStudents(ss);
        c3.setStudents(ss);

        // ASSOCIATING COURSE WITH STUDENT
        s1.setCourses(sc);
        s2.setCourses(sc);

        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();



        em.getTransaction().begin();

        // STUDENT CAN ACCESS COURSE

        Students_Many_To_Many_Bi s = em.find(Students_Many_To_Many_Bi.class, 1);

        System.out.println("Student id is " + s.getSid());

        System.out.println("Student name is " + s.getSname());

        Set<Course_Many_To_Many_Bi> z = s.getCourses();

        for (Course_Many_To_Many_Bi course : z) {

                System.out.println("This student has joined for following courses " + course.getCname());

        }


        // COURSE CAN ACCESS STUDENT

        Course_Many_To_Many_Bi c = em.find(Course_Many_To_Many_Bi.class, 1);

        System.out.println("Course id is " + c.getCid());

        System.out.println("Course name is " + c.getCname());

        Set<Students_Many_To_Many_Bi> students = c.getStudents();

        for (Students_Many_To_Many_Bi stu : students) {

                System.out.println("Following students have joined for this course " + stu.getSname());

        }

        em.getTransaction().commit();
		
	}
	
}
