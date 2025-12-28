package com.kmc.oop.test.polymorphism;
class MethodOverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePolymorphism {
    static void main() {
        MethodOverloading obj = new MethodOverloading();
        int add = obj.add(1, 2);
        int add1 = obj.add(1, 2,3);
        System.out.println(add);
        System.out.println(add1);
    }
}

