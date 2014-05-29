package com.banking.app.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.banking.app.model.Customer;
@Component("UserValidation")
public class UserValidation {
public void validate(Object target, Errors errors)
{
	Customer customer= (Customer)target;
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user_name", "NotEmpty.customer.user_name", "Username must not be empty!!");
	if(!customer.getPassword().equals(customer.getConfirm_password()))
	{
		errors.rejectValue("password", "matchingPassword.customer.password", "Confirmed password does not match!");
	}
	
}
}
