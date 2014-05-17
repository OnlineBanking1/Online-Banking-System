package com.banking.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.banking.app.model.Customer;

public class CustomerDaoImpl  implements CustomerDao {

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
		sessionFactory.openSession().save(customer);
	}
	
}
