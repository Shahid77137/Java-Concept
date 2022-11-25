package com.hibernate.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;

public class Demo {

    public static void main(String[] args) {

           

            EntityManager em = EMUtil.provideEntityManager();

            em.getTransaction().begin();


            Phoneuser phoneUser = new Phoneuser();
            phoneUser.setUsername("AAA");
            phoneUser.setUseremail("AAA@mail.com");
            phoneUser.setUserid(1);

            Phone phone1=new Phone();
            phone1.setPhoneno(111111);
            phone1.setPhonetype("Mobile");
            phone1.setUserid(1);

            Phone phone2=new Phone();
            phone2.setPhoneno(1111);
            phone2.setPhonetype("LandLine");
            phone2.setUserid(1);

            List<Phone> list = new ArrayList<Phone>();
            list.add(phone1);
            list.add(phone2);

            phoneUser.setPhoneTables(list);

            em.persist(phoneUser);

            em.getTransaction().commit();

           

            em.getTransaction().begin();

            // User can access Phone Number

            Phoneuser u = em.find(Phoneuser.class, 1);

            System.out.println("userId is "+u.getUserid());
            System.out.println("UserName is "+u.getUsername());

            List<Phone> list1 = u.getPhoneTables();

            for(Phone p:list1){

                    System.out.println("Phone Number is "+p.getPhoneno());

                    System.out.println("phone Type is "+p.getPhonetype());

            }



            //Phone Number cannot access User Details

            /*Phone ph=(Phone)ses.load(Phone.class, new Integer(1));

            System.out.println("Phone Number is "+ph.getPhoneno());

            System.out.println("phone Type is "+ph.getPhonetype());

            */

    }

}
