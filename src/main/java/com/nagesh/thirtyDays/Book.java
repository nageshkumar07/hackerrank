package com.nagesh.thirtyDays;

/**
 * Created by nageshkumar
 * since  17/11/17.
 */
 abstract class Book {
    String title;

    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
