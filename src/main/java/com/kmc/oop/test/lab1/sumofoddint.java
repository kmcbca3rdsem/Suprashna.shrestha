package com.kmc.oop.test.lab1;

public class sumofoddint {
    static void main() {

        int a[] = {2, 5, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 == 1) {
                sum = sum + a[i];
            }
        }

        System.out.println("Sum of odd integers = " + sum);
    }
    }
