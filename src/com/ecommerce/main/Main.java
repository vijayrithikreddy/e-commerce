package com.ecommerce.main;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

import java.util.List;

public class Main {
    static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        List<Product> products = productRepository.getAll();

        for (Product product : products){
            System.out.println(product);
        }
        productRepository.getById(9);
    }
}
