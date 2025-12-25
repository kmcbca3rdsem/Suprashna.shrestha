package com.kmc.oop.test.lab1;

public class Arraysum {
    static void main() {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

