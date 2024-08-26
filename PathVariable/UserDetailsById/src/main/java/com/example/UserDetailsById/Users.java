package com.example.UserDetailsById;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Users {

    public Users(){}

    private int id;
    private String name;
    private String city;

}
