package com.kmc.oop.test.lab2;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Suprashna";
        p1.age = 25;
        p1.greet();
    }

    String name;
    int age;

    void greet() {
        System.out.println("My name is " + name);
    }
}
