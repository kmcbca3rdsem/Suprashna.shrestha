package com.kmc.oop.test.lab2.newlab;

public class Student1 {
    String name;
    int roll;
    int[] marks;

     Student1(String name, int roll, int[] marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    int totalMarks() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }

    double averageMarks() {
         int total = 0;
         for (int i = 0; i < marks.length; i++) {
             total += marks[i];
         }
         double average = total / marks.length;
         return average;
    }
    public static void main(String[] args) {

        int[] marks = {60, 79, 80, 55, 95};
         Student1 s = new Student1("Hari", 16, marks );


        System.out.println("Name : " + s.name);
        System.out.println("Roll : " + s.roll);
        System.out.println("Total marks : " + s.totalMarks());
        System.out.println("Average marks : " + s.averageMarks());
    }
}



