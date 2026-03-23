package com.ecommerce.repository;

import com.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private final List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        intialProducts();
    }

    private void intialProducts() {
        Product p1 = new Product()
                .setId(1)
                .setName("iPhone 14")
                .setMaxRetailPrice(79999)
                .setDiscountPercentage(10.5f)
                .setRating(5)
                .setAvailable(true);

        Product p2 = new Product()
                .setId(2)
                .setName("Samsung Galaxy S23")
                .setMaxRetailPrice(74999)
                .setDiscountPercentage(12.0f)
                .setRating(4)
                .setAvailable(true);

        Product p3 = new Product()
                .setId(3)
                .setName("OnePlus 11")
                .setMaxRetailPrice(56999)
                .setDiscountPercentage(8.5f)
                .setRating(4)
                .setAvailable(true);

        Product p4 = new Product()
                .setId(4)
                .setName("Sony Headphones")
                .setMaxRetailPrice(19999)
                .setDiscountPercentage(15.0f)
                .setRating(5)
                .setAvailable(true);

        Product p5 = new Product()
                .setId(5)
                .setName("Dell Laptop")
                .setMaxRetailPrice(65999)
                .setDiscountPercentage(18.0f)
                .setRating(4)
                .setAvailable(false);

        Product p6 = new Product()
                .setId(6)
                .setName("HP Laptop")
                .setMaxRetailPrice(59999)
                .setDiscountPercentage(20.0f)
                .setRating(3)
                .setAvailable(true);

        Product p7 = new Product()
                .setId(7)
                .setName("Boat Earbuds")
                .setMaxRetailPrice(2999)
                .setDiscountPercentage(25.0f)
                .setRating(4)
                .setAvailable(true);

        Product p8 = new Product()
                .setId(8)
                .setName("Smartwatch")
                .setMaxRetailPrice(4999)
                .setDiscountPercentage(30.0f)
                .setRating(3)
                .setAvailable(true);

        Product p9 = new Product()
                .setId(9)
                .setName("Nike Sneakers")
                .setMaxRetailPrice(8999)
                .setDiscountPercentage(10.0f)
                .setRating(5)
                .setAvailable(false);

        Product p10 = new Product()
                .setId(10)
                .setName("Backpack")
                .setMaxRetailPrice(1999)
                .setDiscountPercentage(35.0f)
                .setRating(4)
                .setAvailable(true);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        products.add(p7);
        products.add(p8);
        products.add(p9);
        products.add(p10);
    }
    //Read
    public List<Product> getAll() {
        return products;
    }
    public Product getById(int id){
        for (Product product : products){
            if (product.getId() == id ) return product;
        }
        return null;
    }
    //save
    public Product save(Product product){
        products.add(product);
        return product;
    }


   //Update
    public Product update(Product product){
        int id = product.getId();
        Product byId = getById(id);
        int index = products.indexOf(byId);
        products.set(index , product);
        return product;
    }
    public Product update(int id, Product product){
        Product byId = getById(id);
        if (byId == null) return null;
        int index = products.indexOf(byId);
        products.set(index , product);
        return product;
    }
    //delete
    public void delete(Product product){
        products.remove(product);
    }
    public void deleteById(int id){
        for (Product product : products){
            if (product.getId() == id) products.remove(product);
        }
    }

}
