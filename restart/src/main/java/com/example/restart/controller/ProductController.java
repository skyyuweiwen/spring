package com.example.restart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.restart.entity.Product;
import com.example.restart.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Product> getAccounts(){
        return productService.findProductList();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") int id){
        return productService.findProductById(id);
        
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
    public String updateProduct(@PathVariable("id")int id,
                                @RequestParam(value = "name", required = false)String name ,
                                @RequestParam(value = "price", required = false)String price,
                                @RequestParam(value = "description", required = false)String description){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);

        if(productService.update(product) == 1)
            return product.toString();
        else
            return "update fail";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addProduct(@RequestParam(value = "id")int id,
                             @RequestParam(value = "name")String name,
                             @RequestParam(value = "price")String price,
                             @RequestParam(value = "description", required = false)String description){
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);

        if(productService.add(product) == 1)
            return product.toString();
        else
            return "add fail";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable(value = "id")int id){
        if(productService.delete(id) == 1)
            return "delete success";
        else
            return "delete fail";

    }
}
