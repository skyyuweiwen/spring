package com.example.restart.service;

import java.util.List;

import com.example.restart.entity.Product;

public interface ProductService {

    int add(Product product);
    int update(Product product);
    int delete(Integer id);
    Product findProductById(Integer id);
    List<Product> findProductList();
}
