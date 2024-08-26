package com.example.SimpleCalculator.controller;

import com.example.SimpleCalculator.service.CalciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciController {

    @Autowired
    private CalciService service;

    @GetMapping("/calculator")
    public double calculate(@RequestParam String operation,
                            @RequestParam int num1,
                            @RequestParam int num2){
        return service.calculate(operation,num1,num2);

    }
}
