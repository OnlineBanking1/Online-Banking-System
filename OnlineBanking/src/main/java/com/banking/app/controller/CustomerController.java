package com.banking.app.controller;


//rahul123

import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banking.app.model.Customer;
import com.banking.app.service.CustomerService;
import com.banking.app.service.CustomerServiceImpl;
import com.banking.app.validation.UserValidation;

@RequestMapping("/register")
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	Customer customer= new Customer();
	@Autowired
	private UserValidation userValidation;
	
	public UserValidation getUserValidation() {
		return userValidation;
	}

	public void setUserValidation(UserValidation userValidation) {
		this.userValidation = userValidation;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public String addCustomer(@Valid Customer customer, BindingResult result)
	{
		userValidation.validate(customer, result);
		if(result.hasErrors())
		{
			return "register";
		}
		else
		{
			customer.setUser_name(customer.getUser_name());
			customer.setPassword(customer.getPassword());
			customer.setAddress1(customer.getAddress1());
			customer.setAddress2(customer.getAddress2());
			customer.setCity(customer.getCity());
			customer.setEmail(customer.getEmail());
			customer.setFirst_name(customer.getFirst_name());
			customer.setLast_name(customer.getLast_name());
			customer.setMobile(customer.getMobile());
			customer.setReg_date(new Date());
			customer.setState(customer.getState());
			customer.setZipCode(customer.getZipCode());
			customerService.addCustomer(customer);
			return "home";
		}
	
	}
	@RequestMapping(method= RequestMethod.GET)
	public String showRegistration(ModelMap model)
	{
		Customer customer= new Customer();
		model.addAttribute("customer", customer);
		return "register";

	}
}
