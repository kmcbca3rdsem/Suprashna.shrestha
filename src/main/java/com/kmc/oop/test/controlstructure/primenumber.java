package com.kmc.oop.test.controlstructure;
import java.util.Scanner;

public class primenumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, num = 2;
        System.out.print("Enter how many prime numbers: ");
        n = sc.nextInt();

        while (count < n) {
            int i;
            boolean isPrime = true;

            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        sc.close();
    }
}
