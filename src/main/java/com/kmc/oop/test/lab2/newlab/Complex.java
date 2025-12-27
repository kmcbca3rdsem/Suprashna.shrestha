package com.kmc.oop.test.lab2.newlab;

public class Complex {

    public static void main(String[] args) {

        Complex c1 = new Complex();
        c1.real = 6;
        c1.imag = 4;

        Complex c2 = new Complex();
        c2.real = 2;
        c2.imag = 1;

        Complex result = new Complex();

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        result.add(c1, c2);
        System.out.print("Addition: ");
        result.display();

        result.subtract(c1, c2);
        System.out.print("Subtraction: ");
        result.display();
    }

    // Attributes
    int real;
    int imag;

    // Add two complex numbers
    void add(Complex a, Complex b) {
        real = a.real + b.real;
        imag = a.imag + b.imag;
    }

    void subtract(Complex a, Complex b) {
        real = a.real - b.real;
        imag = a.imag - b.imag;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
