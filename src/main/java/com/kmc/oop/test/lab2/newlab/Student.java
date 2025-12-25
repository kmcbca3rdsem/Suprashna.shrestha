package com.kmc.oop.test.lab2.newlab;


public class Student {

    int rollnumber;
    String name;
    int marks;

    //constructor
    Student(int rollnumber, String name, int marks) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.marks = marks;
    }

    //calculate total,percentage & result
    void displayresult() {

        String result;
        if (marks >= 50) {
            result = "Pass";
        }
        else {
            result = "Fail";
        }
        System.out.println("Rollnumber: " + rollnumber);
        System.out.println("Name: " + name);
        System.out.println("Total marks: " + marks);
        System.out.println("Percentage: " + marks + "%");
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1,"Suprashna", 70);
        s1.displayresult();
    }
}



