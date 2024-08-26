package com.example.UserDetailsById.services;

import com.example.UserDetailsById.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    List<Users> users = new ArrayList<>(Arrays.asList(
            new Users(1,"Mounika","Vizag"),
            new Users(2,"Prasanna","Vizag"),
            new Users(3,"Madhu","Hyd")
    ));


    public List<Users> getUsers() {
        return users;
    }

    public List<Users> getUsersById(int id) {
        List<Users> result = new ArrayList<>();
        result= users.stream().filter(u-> u.getId()==id).collect(Collectors.toList());
        return result;
    }
}
