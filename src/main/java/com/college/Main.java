
package com.college;

import com.college.library.Book;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Programming",
                "James Gosling", "Available"));

        books.add(new Book(102, "Python Basics",
                "Guido van Rossum", "Issued"));

        books.add(new Book(103, "Data Structures",
                "Mark Allen Weiss", "Available"));

        System.out.println("================================");
        System.out.println("     COLLEGE LIBRARY SYSTEM");
        System.out.println("================================");

        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
