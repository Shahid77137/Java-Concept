package com.masai.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.model.Course;
import com.masai.model.Student;

public interface CourseDao extends JpaRepository<Course, Integer>{

//	This is Hibernate Syntax Here no need to write Query manually
//	Hibernate take care of that
	public Course findByCourseName(String cname);
	
	
	
//	@Query("from Course where courseName=?1")  //Here we can not write simple query
//	We have to write JPA Query
	@Query("select c from Course c where c.courseName=?1")
	public Course getCourseByCname(String cname);
	
	@Query("select c.students from Course c where c.courseName=?1")
	public Set<Student> getStudentsByCname(String cname);
	
	
}




