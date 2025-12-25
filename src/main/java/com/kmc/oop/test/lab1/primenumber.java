package com.kmc.oop.test.lab1;
import java.util.Scanner;

class PrimeNumbers {
public class primenumber {
        public static void main(String[] args) {
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
        }
    }

}
