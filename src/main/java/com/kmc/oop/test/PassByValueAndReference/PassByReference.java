package com.kmc.oop.test.PassByValueAndReference;

class Car{
    String name;
    float mileage;
    int price;
}


public class PassByReference{
    public static void main() {
        Car c = new Car();
        c.name="Kyoto";
        c.mileage=10.0f;
        c.price=1000;
        System.out.println(c.name);
        System.out.println(c.mileage);
        System.out.println(c.price);


        Car b;
        b=c;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.price);


        b.name="TATA";
        b.price=20000;
        b.mileage=20.0f;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.price);



        System.out.println(c.name);
        System.out.println(c.price);
        System.out.println(c.mileage);
    }
}