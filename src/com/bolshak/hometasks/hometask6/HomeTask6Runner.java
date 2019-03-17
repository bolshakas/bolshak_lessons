package com.bolshak.hometasks.hometask6;

import static com.bolshak.hometasks.hometask6.Books.*;

public class HomeTask6Runner {
    public static void main(String[] args) {
        Books bookList = new Books(3);
        Book book1 = new Book(1, "Chess for Dummies", "Petrov", "Kyren", 2001, 320, 322);
        Book book2 = new Book(1, "English lessons", "Ivanov", "Dandy", 2002, 120, 142);
        Book book3 = new Book(1, "Fairy tale", "Sidorov", "Sum", 2003, 456, 511);

        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);
        System.out.println("Book list:");
        printAllBooks(bookList);

        changeCostOfBook(bookList);
        System.out.println("Books with change cost:");
        printAllBooks(bookList);
        printAllBooks(searchByAuthor(bookList));
        printAllBooks(searchByYearOfPublishing(bookList));

    }
}
