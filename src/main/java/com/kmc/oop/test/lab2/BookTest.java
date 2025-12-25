package com.kmc.oop.test.lab2;

class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to apply discount
    void applyDiscount(double discountPercent) {
        double discountAmount = price * (discountPercent / 100);
        price = price - discountAmount;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
        System.out.println();
    }
}

public class BookTest {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("Java ", "James Gosling", 900);
        Book book2 = new Book("Data Structures", "Mark Allen ", 700);

        // Before discount
        System.out.println("Before Discount:");
        book1.displayDetails();
        book2.displayDetails();

        // Applying discount
        book1.applyDiscount(10); // 10% discount
        book2.applyDiscount(15); // 15% discount

        // After discount
        System.out.println("After Discount:");
        book1.displayDetails();
        book2.displayDetails();
    }
}