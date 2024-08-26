package com.example.FilterUsers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Users {

    Users(){}

    private String name;
    private int age;
    private String city;

//    public Users(int age, String city, String name) {
//        this.age = age;
//        this.city = city;
//        this.name = name;
//    }
}
