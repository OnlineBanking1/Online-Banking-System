package com.banking.app.service;

import com.banking.app.dao.CustomerDao;
import com.banking.app.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao; 
public void addCustomer(Customer customer)
{
	customerDao.addCustomer(customer);
}
}
