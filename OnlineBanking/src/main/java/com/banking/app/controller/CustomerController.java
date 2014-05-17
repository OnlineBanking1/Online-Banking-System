package com.banking.app.controller;


//rahul123

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.app.model.Customer;
import com.banking.app.service.CustomerService;
import com.banking.app.service.CustomerServiceImpl;


@Controller

public class CustomerController {
	@Autowired
	private CustomerService customerService;
	Customer customer= new Customer();
	
	
	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addCustomer()
	{
	customer.setAddress1("P");
	customer.setAddress2("");
	customer.setCity("p");
	customer.setEmail("email");
	customer.setLast_name("last_name");
	customer.setMobile("");
	customer.setReg_date(new Date());
	customer.setState("");
	customer.setZipCode(123);
	customerService.addCustomer(customer);
	return "home";
	}
	
}
