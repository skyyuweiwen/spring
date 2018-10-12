package com.example.restart.service;

import java.util.List;

import com.example.restart.entity.Product;

public interface ProductService {

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
    int delete(Integer id) ;

    /**
     * @param id
     * @return product
     */
    Product findProductById(Integer id);

    /**
     * @return all the product
     */
    List<Product> findProductList();
}
