package com.ecommerce.service;

import com.ecommerce.exception.CustomerExistsException;
import com.ecommerce.exception.CustomerNotFoundException;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getCustomerById() throws CustomerNotFoundException;
    void addCustomer() throws CustomerExistsException;
    Customer updateCustomer();
    void deleteCustomer();

}
