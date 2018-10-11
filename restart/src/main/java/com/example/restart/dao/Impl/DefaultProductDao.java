package com.example.restart.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.restart.dao.ProductDao;
import com.example.restart.entity.Product;

public class DefaultProductDao implements ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Product product) {
        return jdbcTemplate.update("insert into Product(id, name, price, description) value(?, ?, ?, ?)",
                product.getId(), product.getName(), product.getPrice(), product.getDescription());
    }

    @Override
    public int update(Product product) {
        return jdbcTemplate.update("UPDATE Product SET ID=? ,NAME=? ,PRICE=? ,DESCRIPTION=?",
                product.getId(), product.getName(), product.getPrice(), product.getDescription());
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE from TABLE Product where id=?", id);
    }

    @Override
    public Product findAllProductById(Integer id) {
        List<Product> productList = jdbcTemplate.query("select * from Product where id=?", new Object[]{id}, new BeanPropertyRowMapper(Product.class));
        if(productList!=null && productList.size()>0)
            return productList.get(0);
        else
            return null;
    }

    @Override
    public List<Product> findProductList() {
        List<Product> productList = jdbcTemplate.query("select * from Product", new Object[]{}, new BeanPropertyRowMapper(Product.class));
        if(productList!=null && productList.size()>0)
            return productList;
        else
            return null;
    }
}
