package com.kmc.oop.test.lab1;

class student{
    int age;
    String name;
}
public class UserdefinedDataType {
    static void main() {
        student room1= new student();//object initialization
        room1.name="Suprashna Shrestha";
        room1.age=20;
        System.out.println("Name:"+room1.name);
        System.out.println("age:"+room1.age);
        student room2= new student();//object initialization
        room2.name="Aarya Shrestha";
        room2.age=23;
        System.out.println("Name:"+room2.name);
        System.out.println("age:"+room2.age);
    }
}
