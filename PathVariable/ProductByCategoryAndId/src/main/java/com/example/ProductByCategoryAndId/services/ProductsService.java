package com.example.ProductByCategoryAndId.services;

import com.example.ProductByCategoryAndId.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductsService {

    List<Products> products = new ArrayList<>(Arrays.asList(
            new Products(101,"Computer","Electronics"),
            new Products(102,"Desktop","Electronics"),
            new Products(103,"Book","Stationary")
    ));


    public List<Products> getProducts() {
        return products;
    }

    public List<Products> getProductByIdAndCategory(int id, String category) {
        List<Products> result = new ArrayList<>();
        result=products.stream().filter(p->p.getId()==id && p.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
        return result;
    }
}
