package com.kmc.oop.test.lab2.newlab;

public class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        //Array to store 5 Book
        Book[] b = new Book[5];

        //Create object
        b[0] = new Book("java", "James Goslin", 600);
        b[1] = new Book("Dsa", "Thomas", 400);
        b[2] = new Book("Web", "Tim Berners", 900);
        b[3] = new Book("Sad", "jerry W.", 650);
        b[4] = new Book("Java", "James Goslin", 780);

        Book highest = b[0];

        for (int i = 0; i < b.length; i++) {
            if (b[i].price > highest.price) {
                highest = b[i];
            }
        }
        System.out.println("Highest price : " + highest.price);
        System.out.println("Title : " + highest.title);
        System.out.println("Author : " + highest.author);
        System.out.println("Price : " + highest.price);
    }
}
