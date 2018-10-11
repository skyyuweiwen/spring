package com.example.restart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restart.entity.Product;
import com.example.restart.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Product> getAccounts(){
        return productService.findProductList();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") int id){
        return productService.findProductById(id);
        
    }


}
