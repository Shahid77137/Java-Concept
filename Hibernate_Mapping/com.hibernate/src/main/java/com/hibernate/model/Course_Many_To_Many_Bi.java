package com.hibernate.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course_Many_To_Many_Bi {

        @Id
        @Column(name = "CID")
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int cid;

        @Column(name = "CNAME")
        private String cname;

        @ManyToMany(mappedBy = "courses",cascade=CascadeType.ALL)
        private Set<Student> students;

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}

		public String getCname() {
			return cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}
	
				//getters and setters

}