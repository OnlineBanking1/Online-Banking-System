package com.banking.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banking.app.dao.CustomerDao;
import com.banking.app.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao; 
	
public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
@Transactional
public void addCustomer(Customer customer)
{
	customerDao.addCustomer(customer);
}
public boolean doLogin(Customer customer)
{
	boolean userStatus=customerDao.doLogin(customer);
	return userStatus;
}

}
