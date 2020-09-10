package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
	
		Configuration cf=new Configuration();
		cf.configure("configuration.xml");
		
		SessionFactory sf= cf.buildSessionFactory();
		
		Session se =sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Student vijay= new Student();
		vijay.setSid(6124);
		vijay.setSname("ajay");
		vijay.setMarks(540);
		
		Student kumar=new Student();
		kumar.setSid(6123);
		kumar.setSname("Vijay");
		kumar.setMarks(530);
		
		se.save(vijay);
		se.save(kumar);
		tx.commit();
		se.close();
		sf.close();
		
		
		

	}

}
