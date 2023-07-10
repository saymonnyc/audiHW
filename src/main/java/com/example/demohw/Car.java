package com.example.demohw;

public class Car {
    private Long id;
    private String model;
    private String number;
    private static Long counter = 0L;

    public Car(String model, String number) {
        this.id = ++counter;;
        this.model = model;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static Long getCounter() {
        return counter;
    }

    public static void setCounter(Long counter) {
        Car.counter = counter;
    }
}
