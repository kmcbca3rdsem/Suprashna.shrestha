package com.kmc.oop.test.controlstructure;
import java.util.Scanner;

public class control_structure {
    static void main() {
        //Arithmetic operations
        //1.Addition
        //2.Substraction
        //3.Multiplication
        //4.Division
        //5.Power
        Scanner sc = new Scanner(System.in);//create object of class Scanner
        while (true){
            System.out.println("=====Arithmetic and control structure==========/n");
            System.out.println(" 1.Addition ");
            System.out.println(" 2.Subtraction ");
            System.out.println(" 3.Multiplication ");
            System.out.println(" 4.Division ");
            System.out.println(" 5.Power ");
            System.out.println(" 6.Exit ");

            int num1,num2,choices;//variable declared
            int result;
            System.out.println(" Enter the choices");
            choices= sc.nextInt();
            if (choices == 6){
                System.out.println("Exit =============");
                break;
            }
            System.out.println("Enter the first number");
            num1= sc.nextInt();
            System.out.println("Enter the second number");
            num2= sc.nextInt();

            switch (choices) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                    break;
                case 5:
                    result = (int) Math.pow(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Please choose the valid choices");
                    break;
            }
        }
    }

}
