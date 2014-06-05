package com.banking.app.dao;

import java.util.List;

import javassist.bytecode.Descriptor.Iterator;

import org.hibernate.Query;
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
		Session session=sessionFactory.getCurrentSession();
		  Transaction tx=session.beginTransaction();
		   session.save(customer);
		  tx.commit();
		
	}
	public boolean doLogin(Customer customer)
	{
		boolean userStatus=false;
		Session session=sessionFactory.getCurrentSession();
		 Transaction tx=session.beginTransaction();
		try{
		 Query query=session.createQuery(" FROM Customer C where C.user_name = :userName");
		query.setParameter("userName",customer.getUser_name());
		List<Customer> customers= query.list();
		for(Customer c:customers)
			{
			if(c.getUser_name().equals(customer.getUser_name()) && c.getPassword().equals(customer.getPassword()))
			{
				userStatus=true;
			}
			}
				tx.commit();
		}catch(Exception e){
			e.printStackTrace();
			tx.rollback();
		}
		return userStatus;
	}
	
}
