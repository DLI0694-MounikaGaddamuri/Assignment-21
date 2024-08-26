package com.example.FilterUsers.controller;

import com.example.FilterUsers.Users;
import com.example.FilterUsers.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FilterController {

    @Autowired
    private FilterService service;

    @GetMapping("/users")
    public List<Users> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/users/filter")
    public List<Users> getUsersByAgeAndCity(
            @RequestParam int age,
            @RequestParam String city
    ){
        return service.getUsersByAgeAndCity(age,city);
    }

}
