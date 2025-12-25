package com.kmc.oop.test.lab2;

public class Car {
    String brand;
    String model;
    int year;
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
        void displayDetails() {
            System.out.println(" \nbrand :"+ brand +" \nmodel :"+ model +" \nyear :" +year);
}
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        car1.displayDetails();
    }
}

