package com.ecommerce.repository;

import com.ecommerce.model.Product;
import com.ecommerce.util.CsvParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products;

    public ProductRepository() throws IOException {
        CsvParser csvParser = new CsvParser();
        products = csvParser.getProductsFromCsv();
    }
    public List<Product> getAll(){
        return products;
    }
    public Product getById(int id){
        for (Product product : products){
            if (product.getId() == id)
                return product;
        }
        return null;
    }
    public Product save(Product product){
        products.add(product);
        return product;
    }
    public Product update(int id, Product product){
        Product temp = getById(id);
        int index =products.indexOf(temp);
        products.set(index,product);
        return product;
    }
    public boolean delete(int id){
        Product product = getById(id);
        products.remove(product);
        return true;
    }


}
