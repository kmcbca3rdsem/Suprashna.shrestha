package com.kmc.oop.test.lab1;
import java.util.Scanner;
public class printseries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int i,n;

        System.out.println("Enter number:");
        n = sc.nextInt();

        for (i=1;i<=n;i++)
        {
            System.out.println(i + "");
        }
    }
}
