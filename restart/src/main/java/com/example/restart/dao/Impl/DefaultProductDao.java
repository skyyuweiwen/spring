package com.example.restart.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.restart.dao.ProductDao;
import com.example.restart.entity.Product;

@Repository
public class DefaultProductDao implements ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Cacheable("product")
    public int add(Product product) {
        return jdbcTemplate.update("insert into product(id, name, price, description) value(?, ?, ?, ?)",
                product.getId(), product.getName(), product.getPrice(), product.getDescription());
    }

    @Override
    @CachePut("product")
    public int update(Product product) {
        return jdbcTemplate.update("UPDATE product SET name=? ,price=? ,description=? where id=?",
                 product.getName(), product.getPrice(), product.getDescription(), product.getId());
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE from product where id=?", id);
    }

    @Override
    public Product findAllProductById(Integer id) {
        List<Product> productList = jdbcTemplate.query("select * from product where id=?", new Object[]{id}, new BeanPropertyRowMapper(Product.class));
        if(productList!=null && productList.size()>0)
            return productList.get(0);
        else
            return null;
    }

    @Override
    public List<Product> findProductList() {
        List<Product> productList = jdbcTemplate.query("select * from product", new Object[]{}, new BeanPropertyRowMapper(Product.class));
        if(productList!=null && productList.size()>0)
            return productList;
        else
            return null;
    }

}
