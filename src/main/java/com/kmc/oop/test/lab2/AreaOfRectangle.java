package com.kmc.oop.test.lab2;

class Rectangle {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.calculateArea();
        r.calculatePerimeter();
    }

    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    void calculatePerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

