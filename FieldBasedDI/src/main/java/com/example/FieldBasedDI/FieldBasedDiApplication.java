package com.example.FieldBasedDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FieldBasedDiApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(FieldBasedDiApplication.class, args);
		Car object = context.getBean(Car.class);
		object.build();
	}

}
