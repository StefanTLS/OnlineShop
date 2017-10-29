package com.sci.onlineshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sci.onlineshop.model.Product;

@Repository
public interface ProductDao {

    void addProduct(Product product);
    
    void editProduct(Product product);

    Product getProductById(int id);

    List<Product> getAllProducts();

    void deleteProduct(int id);
}