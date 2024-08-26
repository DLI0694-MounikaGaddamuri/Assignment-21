package com.example.FilterUsers.service;


import com.example.FilterUsers.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilterService {

    List<Users> users = new ArrayList<>(Arrays.asList(
            new Users("Abc",21,"NewYork"),
            new Users("def",22,"Vizag"),
            new Users("ghi",23,"NewYork"))
    );


    public List<Users> getUsers() {
        return users;
    }

    public List<Users> getUsersByAgeAndCity(int age, String city) {
        List<Users> result= new ArrayList<>();

        result=users.stream().filter(u-> u.getAge()==age && u.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        return result;
    }
}
