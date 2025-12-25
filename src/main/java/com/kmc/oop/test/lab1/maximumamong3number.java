package com.kmc.oop.test.lab1;
import java.util.Scanner;
public class maximumamong3number {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter 1st number:");
        a = sc.nextInt();

        System.out.println("Enter 2nd number:");
        b = sc.nextInt();

        System.out.println("Enter 3rd number:");
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Maximum number is: " + a);
            } else {
                System.out.println("Maximum number is: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Maximum number is: " + b);
            } else {
                System.out.println("Maximum number is: " + c);
            }
        }
    }
}
