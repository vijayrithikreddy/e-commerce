package com.ecommerce.util;

import com.ecommerce.model.Product;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Address;
import com.ecommerce.enums.Gender;
import com.ecommerce.enums.Status;
import com.ecommerce.enums.Membership;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {
    public List<Product> getProductsFromCsv() throws IOException {
        List<Product> products = new ArrayList<>();
        File file = new File("C:\\Users\\Rithik Reddy\\Downloads\\products.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();
        String productData = br.readLine();

        while (productData != null){
            String[] split = productData.split(",");
            Product product = new Product();
            product.setId(Integer.parseInt(split[0]))
                    .setName(split[1])
                    .setMaxRetailPrice(Integer.parseInt(split[2]))
                    .setDiscountPercentage(Float.parseFloat(split[3]))
                    .setAvailable(Boolean.parseBoolean(split[4]))
                    .setCompany(split[5])
                    .setCategory(split[6])
                    .setManufacturedYear(Integer.parseInt(split[7]));
            products.add(product);
            productData = br.readLine();
        }
        return products;
    }

    public List<Customer> getCustomersFromCsv() throws IOException {
        List<Customer> customers = new ArrayList<>();

        File file = new File("C:\\Users\\Rithik Reddy\\Downloads\\customers.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));

            br.readLine(); // skip header
            String data = br.readLine();

            while (data != null) {
                String[] split = data.split(",");


                Address residential = parseAddress(split[7]);


                Address shipping = parseAddress(split[8]);

                // Customer
                Customer customer = new Customer()
                        .setId(Integer.parseInt(split[0]))
                        .setName(split[1])
                        .setEmail(split[2])
                        .setAge(Integer.parseInt(split[3]))
                        .setGender(Gender.valueOf(split[4].toUpperCase()))
                        .setStatus(Status.valueOf(split[5].toUpperCase()))
                        .setMembershipType(Membership.valueOf(split[6].toUpperCase()))
                        .setResdentialAddress(residential)   // update name if you fix spelling
                        .setShippingAddress(shipping);

                customers.add(customer);
                data = br.readLine();
            }

        return customers;
    }
    public Address parseAddress(String address){
        String[] split = address.split(":");
        Address address1 = new Address();
        address1.setHouseNo(split[0])
                .setStreetName(split[1])
                .setArea(split[2])
                .setCity(split[3])
                .setPincode(Integer.parseInt(split[4]));
        return address1;
    }
}
