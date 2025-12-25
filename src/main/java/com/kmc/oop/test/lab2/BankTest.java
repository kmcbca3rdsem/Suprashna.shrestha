package com.kmc.oop.test.lab2;

class BankAccount {
    // Attributes
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit amount
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method to withdraw amount
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else
        {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        // Creating object
        BankAccount account = new BankAccount(101, 5000);

        // Performing operations
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1500);
        account.displayBalance();
    }
}