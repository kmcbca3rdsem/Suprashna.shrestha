package com.kmc.oop.test.lab1;


class rectangle {
    double length;
    double width;

    void calculatearea() {
        double calculatearea = length*width;
        System.out.println("area=" + calculatearea);
    }
}
public class Areaofrectangle {
    static void main() {
        rectangle rectangle = new rectangle();
        rectangle.length=10;
        rectangle.width=10;
        rectangle.calculatearea();
    }
}
