package com.kmc.oop.test.lab1;

public class sortarray {
    static void main() {
        int a[] = {6, 3, 1, 5, 2};
        int temp;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(" The Sorted array in ascending order:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
