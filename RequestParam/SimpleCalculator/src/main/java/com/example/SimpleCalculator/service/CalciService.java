package com.example.SimpleCalculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalciService {

    public double calculate(String operation, int num1, int num2) {
        double result=0;
        switch(operation.toLowerCase()){
            case "add":
                result= num1+num2;
                break;

            case "subtract":
                result= num1-num2;
                break;

            case "multiply":
                result= num1*num2;
                break;

            case "divide":
                if(num2!=0)
                    result= num1/num2;
                else {
                    throw new IllegalArgumentException("Invalid denominator!");
                }
        }
        return  result;
    }
}
