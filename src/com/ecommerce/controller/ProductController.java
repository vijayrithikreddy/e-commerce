package com.ecommerce.controller;

import com.ecommerce.model.Product;
import com.ecommerce.service.ProductServiceImpl;

import java.util.List;
import java.util.Map;

public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    public List<Product> getProductsByAvailability() {
        return productService.getProductsByAvailability();
    }

    public List<Product> getProductsByCategory(String category) {
        return productService.getProductsByCategory(category);
    }

    public List<Product> getProductsWithPriceAbove(int price) {
        return productService.getProductsWithPriceAbove(price);
    }

    public List<String> getProductNames() {
        return productService.getProductNames();
    }

    public long getCountOfProducts() {
        return productService.getCountOfProducts();
    }

    public boolean existsByCompany(String company) {
        return productService.existsByCompany(company);
    }

    public boolean areAllProductsAvailable() {
        return productService.areAllProductsAvailable();
    }

    public Product getFirstProduct() {
        return productService.getFirstProduct();
    }

    public List<String> getUniqueProductsByCategory() {
        return productService.getUniqueProductsByCategory();
    }

    public List<Product> getExpensiveProducts(int N) {
        return productService.getExpensiveProducts(N);
    }

    public List<Product> sortbyPriceAsc() {
        return productService.sortbyPriceAsc();
    }

    public List<Product> sortByPriceDesc() {
        return productService.sortByPriceDesc();
    }

    public double getTotalProductsValue() {
        return productService.getTotalProductsValue();
    }

    public double getTotalProductsDiscountedValue() {
        return productService.getTotalProductsDiscountedValue();
    }

    public List<Product> getProductsAfterYear(int year) {
        return productService.getProductsAfterYear(year);
    }

    public List<Product> getAvailableProductsWithPriceAbove(int price) {
        return productService.getAvailableProductsWithPriceAbove(price);
    }

    public Map<String, Long> countProductsInEachCategory() {
        return productService.countProductsInEachCategory();
    }

    public Map<String, List<Product>> groupByCategory() {
        return productService.groupByCategory();
    }
}