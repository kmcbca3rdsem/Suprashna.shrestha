package com.kmc.oop.test.PassByValueAndReference;

public class PassBYValue {
    static void main() {
        int a= 1000; // variable initialization
        System.out.println(a);
        int b; // value assign to b
        b = a;
        System.out.println(b);
        b = 2000;
        System.out.println(b);
    }
}
