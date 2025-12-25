package com.kmc.oop.test.lab1;
import java.util.Scanner;
public class different_operator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a, b, choice;

        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();

        System.out.println("\n--- MENU ---");
        System.out.println("1. Arithmetic Operators");
        System.out.println("2. Relational Operators");
        System.out.println("3. Logical Operators");
        System.out.println("4. Assignment Operators");
        System.out.println("Enter your chooice");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\nArithmetic Operators:");
                System.out.println("Addition = " + (a + b));
                System.out.println("Subtraction = " + (a - b));
                System.out.println("Multiplication = " + (a * b));
                System.out.println("Division = " + (a / b));
                break;

            case 2:
                System.out.println("\nRelational Operators:");
                System.out.println("a > b = " + (a > b));
                System.out.println("a < b = " + (a < b));
                System.out.println("a == b = " + (a == b));
                System.out.println("b == a = " + (b == a));
                System.out.println("a != b = " + (a != b));
                break;

            case 3:
                System.out.println("\nlogical Operators:");
                System.out.println("(a>b && a!=b) = " + (a > b && a != b));
                System.out.println("(a>b || a<b) = " + (a > b || a < b));
                System.out.println("!(a==b) = " + !(a == b));
                break;

            case 4:
                System.out.println("\nAsssignment Operators:");
                int c = 10;
                c += 5;
                System.out.println(c);
                c -= 3;
                System.out.println(c);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}


