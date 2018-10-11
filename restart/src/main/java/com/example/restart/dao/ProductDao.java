package com.example.restart.dao;

import java.util.List;

import com.example.restart.entity.Product;

public interface  ProductDao {
    int add(Product product);
    int update(Product product);
    int delete(Integer id);
    Product findAllProductById(Integer id);
    List<Product> findProductList();
}
