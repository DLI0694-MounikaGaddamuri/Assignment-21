package com.example.SimpleCalculator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Calculator {
    public Calculator(){}

    private int num1;
    private int num2;
}
