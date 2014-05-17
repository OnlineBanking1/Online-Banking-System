package com.banking.app.controller;


//rahul123

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.app.model.Customer;
import com.banking.app.service.CustomerService;


@Controller
@RequestMapping(value="/")
public class CustomerController {
	@Autowired
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
