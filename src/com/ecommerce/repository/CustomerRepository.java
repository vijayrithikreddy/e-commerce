package com.ecommerce.repository;

import com.ecommerce.model.Customer;
import com.ecommerce.util.CsvParser;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private final List<Customer> customers;
    CsvParser csvParser;

    public CustomerRepository(List<Customer> customers) throws IOException{
        this.csvParser = new CsvParser();
        this.customers = initialCustomers();
    }

    public List<Customer> initialCustomers() throws IOException {
        return csvParser.getCustomersFromCsv();
    }

    public List<Customer> getAll() {
        return customers;
    }

    public Optional<Customer> getCustomerById(int id) {
        return customers.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst();
    }

    public Customer save(Customer customer) {
        this.customers.add(customer);
        return customer;
    }

    public Customer update(int id, Customer updatedCustomer) {
        customers.replaceAll(c -> c.getId() == id ? updatedCustomer : c);
        return updatedCustomer;
    }

    public boolean delete(int id) {
        return customers.removeIf(c -> c.getId() == id);
    }
    public boolean delete(Customer customer){
        return customers.removeIf(c -> c.getId() == customer.getId());
    }
}

