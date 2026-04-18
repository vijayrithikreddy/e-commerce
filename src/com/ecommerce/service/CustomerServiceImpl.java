package com.ecommerce.service;

import com.ecommerce.model.Customer;
import com.ecommerce.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.getAll();
    }


}
