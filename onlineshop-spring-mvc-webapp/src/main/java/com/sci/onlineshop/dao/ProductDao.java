package com.sci.onlineshop.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sci.onlineshop.model.Product;

public interface ProductDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);
}