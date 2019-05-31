package com.me.mov.dao;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Dao {
	
	private static final Logger log = Logger.getAnonymousLogger();
	private static SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	protected Transaction tx = null;
	public Dao() {
		
	}
	
	public Session getSession() throws Exception{
		Session session = sessionFactory.openSession();
		return session ;
	}
	
	public void begin() throws Exception {
		try {
			getSession().beginTransaction();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			log.log(Level.WARNING, "transaction cannot be created or transaction is null", e);
		}
	}
		
	
	public void commit() throws Exception {
		
		getSession().getTransaction().commit();
		
	}
	public  void close() throws Exception {
        getSession().close();
       
    }
	public void rollback() throws Exception {
		getSession().getTransaction().rollback();
	}
}
