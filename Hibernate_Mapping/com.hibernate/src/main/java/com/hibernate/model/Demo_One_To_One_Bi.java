package com.hibernate.model;

import jakarta.persistence.EntityManager;

public class Demo_One_To_One_Bi {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();

        em.getTransaction().begin();

        Citizen_One_To_One_Bi c = new Citizen_One_To_One_Bi();
        c.setCname("Manu Manjunatha");

        Passport_One_To_One_Bi passport = new Passport_One_To_One_Bi();
        passport.setPnumber("123456");

        // ASSOCIATE CITIZEN WITH PASSPORT
        passport.setCitizen(c);

        // ASSOCIATE PASSPORT WITH CITIZEN
        c.setPassport(passport);

        em.persist(passport);

        em.getTransaction().commit();

       

        em.getTransaction().begin();

        // CITIZEN CAN ACCESS PASSPORT

        Citizen_One_To_One_Bi cz = em.find(Citizen_One_To_One_Bi.class,1);

        System.out.println("Citizen id is " + cz.getCid());

        System.out.println("Citizen name is " + cz.getCname());

        System.out.println("Citizen passport number is " + cz.getPassport().getPnumber());

       

        // PASSPORT CAN ACCESS CITIZEN BECAUSE IT IS BIDIRECTIONAL

        Passport_One_To_One_Bi pt = em.find(Passport_One_To_One_Bi.class,1);

        System.out.println("Passport id is " + pt.getPid());

        System.out.println("Passport number is " + pt.getPnumber());

        System.out.println("Citizen name is " + pt.getCitizen().getCname());

       

        em.getTransaction().commit();
		
	}
	
}
