package com.college.library;

public class Book {

    int bookId = 101;
    String bookName = "Java Programming";
    String author = "James Gosling";

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }
}