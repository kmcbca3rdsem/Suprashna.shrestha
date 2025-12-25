package com.kmc.oop.test.lab2.newlab;

public class ArrayBook {
    String title;
    String author;
    int price;
}

ArrayBook(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
}

void display() {
    System.out.println("Title:" +title);
    System.out.println();
}

