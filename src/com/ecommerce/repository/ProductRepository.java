package com.ecommerce.repository;

import com.ecommerce.model.Product;
import com.ecommerce.util.CsvParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private final List<Product> products;

    public ProductRepository() throws IOException {
        CsvParser csvParser = new CsvParser();
        products = csvParser.getProductsFromCsv();
    }
    public List<Product> getAll(){
        return products;
    }
    public Optional<Product> getById(int id){
        return products.stream()
                .filter(c -> c.getId() == id)
                .findFirst();
    }
    public Product save(Product product){
        products.add(product);
        return product;
    }
    public Product update(int id, Product product){
       products.replaceAll(p -> p.getId() == id ? product : p);
       return product;
    }
    public boolean delete(int id){
       return products.removeIf(p -> p.getId() == id);
    }
    public boolean delete(Product product){
        return products.removeIf(p -> p.getId() == product.getId());
    }



}
