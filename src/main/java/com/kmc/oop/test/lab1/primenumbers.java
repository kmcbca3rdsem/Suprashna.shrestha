package com.kmc.oop.test.lab1;
import java.util.Scanner;

public class primenumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        int number = 2;

        System.out.println("Enter value for n:");
        n = sc.nextInt();
        while (count < n) {
            int check = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    check++;
                }
            }
            if (check == 2) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
