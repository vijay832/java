package com.school;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MainLogic {
	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("configuration.xml");

		SessionFactory sf = cf.buildSessionFactory();

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		
		/*
		 * Query qr=se.createQuery("delete from Student s where s.id=?");
		 * qr.setParameter(0,6126);
		 * 
		 * qr.executeUpdate();
		 * 
		 */

		
		
		/*
		 * Student vijay= new Student();
		 * 
		 * vijay.setId(6120); vijay.setSname("ajay"); vijay.setMarks(540);
		 * 
		 * Student kumar=new Student(); kumar.setId(6121); kumar.setSname("Vijay");
		 * kumar.setMarks(530);
		 * 
		 * 
		 * se.save(vijay); se.save(kumar);
		 */
		
		/*
		 * Criteria cr=se.createCriteria(Student.class);
		 * 
		 * cr.add(Restrictions.le("marks",530));
		 * cr.add(Restrictions.between("id", 6125,
		 * 6126)); cr.add(Restrictions.like("sname", "j%"));
		 * 
		 */
		
		Query qr=se.getNamedQuery("sql_store");
		List li =qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) {
			Object[]a=(Object[])i.next();
			System.out.println(a[0]+"  "+a[1]+"  "+a[2]);
		}
		 
		tx.commit();
	    se.close();
	    sf.close();

	}

}