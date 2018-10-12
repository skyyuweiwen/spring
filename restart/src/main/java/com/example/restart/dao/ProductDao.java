package com.example.restart.dao;

import java.util.List;

import com.example.restart.entity.Product;

public interface  ProductDao {
    /**
     * @param product
     * @return 1 if add success
     */
    int add(Product product);

    /**
     * @param product
     * @return 1 if update success
     */
    int update(Product product);

    /**
     * @param id
     * @return 1 if delete success
     */
    int delete(Integer id);

    /**
     * @param id
     * @return product
     */
    Product findAllProductById(Integer id);

    /**
     * @return all product in a list
     */
    List<Product> findProductList();
}
