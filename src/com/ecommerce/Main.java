package com.ecommerce;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductServiceImpl;

import java.util.List;

public class Main {
    static void main(String[] args) {
        try {
            ProductRepository productRepository = new ProductRepository();
            ProductServiceImpl productService = new ProductServiceImpl(productRepository);

            for (String product : productService.getProductNames())
                System.out.println(product);
            System.out.println(productService.getCountOfProducts());
            System.out.println(productService.existsByCompany("Sony"));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
