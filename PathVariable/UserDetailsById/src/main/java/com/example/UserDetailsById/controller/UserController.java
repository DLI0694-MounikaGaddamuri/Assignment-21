package com.example.UserDetailsById.controller;


import com.example.UserDetailsById.Users;
import com.example.UserDetailsById.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public List<Users> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/users/{id}")
    public List<Users> getUsersById(@PathVariable int id){
        return service.getUsersById(id);
    }

}
