package com.kmc.oop.test.lab1;
import java.util.Scanner;
public class factorialofnum {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n, fact = 1;
        System.out.print("Enter number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);
    }
}


