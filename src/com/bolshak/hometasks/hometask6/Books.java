package com.bolshak.hometasks.hometask6;

import java.util.Scanner;

public class Books {

    private static final int ONE_HUNDRED_PERCENT = 100;
    private static final String ENTER_PERCENTAGE_VALUE_MESSAGE = "Enter a percentage value to change the book cost ->  ";
    private static final int MIN_INPUT_PERCENT_VALUE = -100;
    private static final String NOTHING_FOUND_FOR_REQUEST = "Nothing found for this request";

    private Book[] bookArr;

    public Books(int length) {
        bookArr = new Book[length];
    }

    public Book[] getBookArr() {
        return bookArr;
    }

    public void addBook(Book book) {
        boolean result = false;
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i] == null) {
                bookArr[i] = book;
                result = true;
                break;
            }
        }

        if (!result){
            System.out.println("Book Did not added. The length of the array is " + bookArr.length);
        }
    }


    public static void printAllBooks(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        for (Book book : bookArr) {
            book.view();
        }
    }

    public static void changeCostOfBook(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        Scanner scanner = new Scanner(System.in);
        System.out.print(ENTER_PERCENTAGE_VALUE_MESSAGE);
        int percent = scanner.nextInt();
        if (percent < MIN_INPUT_PERCENT_VALUE) {
            System.out.print("Pleas, try again -> ");
            percent = scanner.nextInt();
        }
        if (percent >= MIN_INPUT_PERCENT_VALUE) {
            for (Book book : bookArr) {
                double cost = book.getCost();
                book.setCost(cost + (cost * percent / ONE_HUNDRED_PERCENT));
            }
        }
    }

    static Books searchByAuthor(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author to search for books ->  ");
        String author = scanner.nextLine();
        int counter = 0;
        for (Book book : bookArr) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                counter++;
            }
        }
        Books booksWithDefineAuthor = new Books(counter);
        if (counter == 0) {
            System.out.println(NOTHING_FOUND_FOR_REQUEST);

        }
        for (Book book : bookArr) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                booksWithDefineAuthor.addBook(book);
            }
        }
        return booksWithDefineAuthor;
    }

    static Books searchByYearOfPublishing(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of publishing to search for books ->  ");
        int yearOfPublishing = scanner.nextInt();
        int counter = 0;
        for (Book book1 : bookArr) {
            if (book1.getYearOfPublishing() > yearOfPublishing) {
                counter++;
            }
        }
        Books defineYearOfPublishing = new Books(counter);

        if (counter == 0) {
            System.out.println(NOTHING_FOUND_FOR_REQUEST);
        } else {
            for (Book book : bookArr) {
                if (book.getYearOfPublishing() > yearOfPublishing) {
                    defineYearOfPublishing.addBook(book);
                }
            }
        }
        return defineYearOfPublishing;
    }
}

