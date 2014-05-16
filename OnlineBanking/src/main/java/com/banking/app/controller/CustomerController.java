package com.banking.app.controller;


//ravi

import org.springframework.stereotype.Controller;


import com.banking.app.model.Customer;
import com.banking.app.service.CustomerService;


@Controller
public class CustomerController {
	
	private CustomerService customerService;
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String addCustomer(Customer customer)
	{
	customerService.addCustomer(customer);
	return "home";
	}
	
}
