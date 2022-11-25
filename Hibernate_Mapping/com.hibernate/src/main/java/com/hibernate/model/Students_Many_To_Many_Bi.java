package com.hibernate.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Students_Many_To_Many_Bi {

        @Id
        @Column(name = "SID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int sid;
       
        @Column(name = "SNAME")
        private String sname;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(name = "STUDENTCOURSE", joinColumns = { @JoinColumn(name = "SID") }, inverseJoinColumns = { @JoinColumn(name = "CID") })
        private Set<Course_Many_To_Many_Bi> courses;

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public Set<Course_Many_To_Many_Bi> getCourses() {
			return courses;
		}

		public void setCourses(Set<Course_Many_To_Many_Bi> courses) {
			this.courses = courses;
		}

				//getters and setters
        
}