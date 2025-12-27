package com.kmc.oop.test.lab2.newlab;

import java.util.Scanner;

class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows for first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for first matrix: ");
        int c1 = sc.nextInt();

        System.out.print("Enter number of rows for second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for second matrix: ");
        int c2 = sc.nextInt();

        // Check if multiplication is possible or not
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        int[][] result = new int[r1][c2];

        //first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        //second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Display
        System.out.println("Result:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

