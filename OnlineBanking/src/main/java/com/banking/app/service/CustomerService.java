package com.banking.app.service;

import com.banking.app.model.Customer;

public interface CustomerService {
public void addCustomer(Customer customer);
public boolean doLogin(Customer customer);
}
