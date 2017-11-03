package com.sci.onlineshop.service;

import java.util.List;

import com.sci.onlineshop.model.Customer;

public interface CustomerService {

	void addCustomer(Customer customer);

	Customer getCustomerById(int customerId);

	List<Customer> getAllCustomers();

	Customer getCustomerByUsername(String username);
}
