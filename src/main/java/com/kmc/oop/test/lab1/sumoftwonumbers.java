package com.kmc.oop.test.lab1;

import java.util.Scanner;

public class sumoftwonumbers {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);//object initialization
        System.out.println("enter the first number");
        int a = scanner.nextInt();
        System.out.println("enter the second number");
        int b= scanner.nextInt();
        int c = a+b;
        System.out.println("The sum of two numbers is:"+c);
    }
}
