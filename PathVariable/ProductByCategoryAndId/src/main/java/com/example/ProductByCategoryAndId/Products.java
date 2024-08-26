package com.example.ProductByCategoryAndId;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Products {

    private int id;
    private String name;
    private String category;

    Products(){}

}
