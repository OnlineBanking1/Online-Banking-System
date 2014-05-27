package com.banking.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.banking.app.model.Customer;
@Repository
public class CustomerDaoImpl  implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
	}


	public void addCustomer(Customer customer)
	{
		
		customer.setFirst_name("Ravi");
		Session session=sessionFactory.getCurrentSession();
		  Transaction tx=session.beginTransaction();
		   session.save(customer);
		  tx.commit();
		
	}
	
}
