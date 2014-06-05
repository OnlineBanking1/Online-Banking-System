package com.banking.app.dao;



import com.banking.app.model.Customer;

public interface CustomerDao {

	public void addCustomer(Customer customer);
	public boolean doLogin(Customer customer);
}
