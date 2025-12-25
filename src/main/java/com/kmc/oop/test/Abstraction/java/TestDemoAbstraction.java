package com.kmc.oop.test.Abstraction.java;

public class TestDemoAbstraction {
    static void main() {
        Animal dog = new Dog();
        Animal cat = new Cat();


        dog.makeSound();
        dog.info();


        cat.makeSound();
        cat.info();

    }
}
