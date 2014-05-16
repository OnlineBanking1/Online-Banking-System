package com.banking.app.service;

import org.springframework.transaction.annotation.Transactional;

import com.banking.app.dao.CustomerDao;
import com.banking.app.model.Customer;
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao; 
public void addCustomer(Customer customer)
{
	customerDao.addCustomer(customer);
}
}
