package com.example.restart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.restart.dao.ProductDao;
import com.example.restart.entity.Product;
import com.example.restart.service.ProductService;

public class DefaultProductService implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public int add(Product product) {
        return getProductDao().add(product);
    }

    @Override
    public int update(Product product) {
        return getProductDao().update(product);
    }

    @Override
    public int delete(Integer id) {
        return getProductDao().delete(id);
    }

    @Override
    public Product findProductById(Integer id) {
        return getProductDao().findAllProductById(id);
    }

    @Override
    public List<Product> findProductList() {
        return getProductDao().findProductList();
    }

    public ProductDao getProductDao() {
        return productDao;
    }

}
