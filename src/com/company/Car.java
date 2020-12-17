package com.company;

public class Car {


    private String brand;
    private String model;
    private String colour;
    private int year;
    private long kilometers;


    public Car(String brand, String model, String colour, int year, long kilometers) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.year = year;
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public long getKilometers() {
        return kilometers;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
