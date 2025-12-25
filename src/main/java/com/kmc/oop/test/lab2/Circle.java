package com.kmc.oop.test.lab2;

public class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius=5;

        System.out.println("Circle");
        c1.displayArea();
        c1.displayCircumference();
    }

    double radius;

    void displayArea() {
        double area = 3.1416 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    void displayCircumference() {
        double circumference = 2 * 3.1416 * radius;
        System.out.println("Circumference of Circle = " + circumference);
    }
}

