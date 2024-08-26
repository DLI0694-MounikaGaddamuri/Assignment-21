package com.example.FieldBasedDI;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    String name;

    public Engine(){

    }
    public Engine(String name){
        this.name=name;
    }
}
