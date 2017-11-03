package com.sci.onlineshop.dao;

import java.util.List;

import com.sci.onlineshop.model.Customer;

public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}