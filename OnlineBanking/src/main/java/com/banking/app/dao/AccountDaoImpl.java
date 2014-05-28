package com.banking.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.banking.app.model.Account;

public class AccountDaoImpl {
 private SessionFactory sessionFactory;

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
 
public void addAccount(Account account){
	account.setAccount_id(1);
	Session session=getSessionFactory().getCurrentSession();
	Transaction tx=session.beginTransaction();
	session.save(account);
	tx.commit();
	
}
}
