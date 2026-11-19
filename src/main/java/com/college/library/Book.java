package com.college.library;

public class Book {

        private int bookId;
        private String bookName;
        private String authorName;
        private String status;

        public Book(int bookId, String bookName,
                    String authorName, String status) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.authorName = authorName;
            this.status = status;
        }

        public void displayBookDetails() {
            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName);
            System.out.println("Author Name: " + authorName);
            System.out.println("Status: " + status);
            System.out.println("---------------------------");
        }
    }
