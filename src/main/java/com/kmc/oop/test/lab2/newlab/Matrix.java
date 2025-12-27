package com.kmc.oop.test.lab2.newlab;

    import java.util.Scanner;
    class Matrix {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int rows, cols;

            // Read rows and columns
            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            cols = sc.nextInt();

            int[][] a = new int[rows][cols];

            // Read matrix elements
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            // Display matrix
            System.out.println("Matrix is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

