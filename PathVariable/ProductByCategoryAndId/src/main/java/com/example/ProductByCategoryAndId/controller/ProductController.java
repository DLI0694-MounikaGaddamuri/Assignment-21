package com.example.ProductByCategoryAndId.controller;

import com.example.ProductByCategoryAndId.Products;
import com.example.ProductByCategoryAndId.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductsService service;

    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{id}/{category}")
    public List<Products> getProductByIdAndCategory(@PathVariable int id, @PathVariable String category){
        return service.getProductByIdAndCategory(id,category);
    }

}
