package com.kmc.oop.test.lab1;
import java.util.Scanner;
public class fibonacciseries {
    static void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Emter number of terms:");
    int n = sc.nextInt();

    int a = 0, b = 1, c;

    for ( int i = 1; i <= n; i++)
    {
        System.out.println(a + " ");
        c = a + b;
        a = b;
        b = c;
    }
}
}

