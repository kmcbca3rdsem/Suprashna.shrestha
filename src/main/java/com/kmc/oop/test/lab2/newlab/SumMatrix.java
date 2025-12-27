package com.kmc.oop.test.lab2.newlab;

import java.util.Scanner;
public class SumMatrix {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();

    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int[][] matrix = new int[rows][cols];

    // Read matrix elements
    System.out.println("Enter matrix elements:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }

    // Calculate sum
    int sum = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sum += matrix[i][j];
        }
    }

    // Display sum
    System.out.println("Sum of all elements = " + sum);
}
}
