package com.ecommerce.service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getProductsByAvailability(){
        return productRepository.getAll().stream()
                .filter(p -> p.isAvailable() == true)
                .toList();
    }
    public List<Product> getProductsByCategory(String category){
        return productRepository.getAll().stream()
                .filter(p -> p.getCategory().equals(category))
                .toList();
    }
    public List<Product> getProductsWithPriceAbove(int price){
        return productRepository.getAll().stream()
                .filter(p -> p.getMaxRetailPrice() > price)
                .toList();
    }
    public List<String> getProductNames(){
        return productRepository.getAll().stream()
                .map(p -> p.getName())
                .toList();
    }
    public int getCountOfProducts(){
        return (int) productRepository.getAll().stream()
                .count();
    }
    public boolean existsByCompany(String company){
        return productRepository.getAll().stream()
                .anyMatch(p -> p.getCompany().equals(company));
    }
    public boolean areAllProductsAvailable(){
        return productRepository.getAll().stream()
                .allMatch(p -> p.isAvailable());
    }
    public Product getFirstProduct(){
        return productRepository.getAll().stream()
                .findFirst().orElse(null);
    }
}
