package org.example;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(){
        System.out.println("Hello!");
    }

    public void build(){
        engine.setName("V8");
        System.out.println("The name of engine is: "+engine.getName());
    }

}
