package com.example.FieldBasedDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;


    public void build(){
        engine.name="V8";
        System.out.println("This is: "+engine.name);
    }
}
