package com.kmc.oop.test.polymorphism;
 class A {
     int add(int a, int b) {
         return a + b;
     }

     int subtract(int a, int b) {
         return a - b;
     }
 }
 class B extends A{
     @Override
     int subtract(int a,int b){
        return super.subtract(a,b);
     }
 }
public class MathematicalOperation {
    static void main() {
        A subtract = new B();
        int sub = subtract.subtract(10,20);
        System.out.println(sub);
    }
}
