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
            System.out.println(productService.getUniqueProductsByCategory());
            System.out.println(productService.getProductsAfterYear(2000));
            System.out.println(productService.getExpensiveProducts(10));
            System.out.println(productService.getTotalProductsValue());
            System.out.println(productService.getTotalProductsDiscountedValue());
            System.out.println(productService.groupByCategory());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
