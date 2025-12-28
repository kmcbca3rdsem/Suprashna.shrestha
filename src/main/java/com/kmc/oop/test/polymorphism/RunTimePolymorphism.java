package com.kmc.oop.test.polymorphism;

class Animal {
    void sound() {
        System.out.println("Make sounds");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Override methods:");
    }
}
public class RunTimePolymorphism {
    static void main() {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
    }

    }

