package com.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "CITIZEN")
public class Citizen_One_To_One_Bi {

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "CID")
        private int cid;

        @Column(name = "CNAME")
        private String cname;

        @OneToOne
        @PrimaryKeyJoinColumn
        private Passport passport;

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

		public Passport getPassport() {
			return passport;
		}

		public void setPassport(Passport passport) {
			this.passport = passport;
		}

				//getters and setters

}