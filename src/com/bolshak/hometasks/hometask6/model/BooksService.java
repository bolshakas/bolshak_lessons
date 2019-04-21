package com.bolshak.hometasks.hometask6.model;

import com.bolshak.hometasks.hometask6.controller.Controller;
import com.bolshak.hometasks.hometask6.model.entity.Book;
import com.bolshak.hometasks.hometask6.model.entity.Books;
import com.bolshak.hometasks.hometask6.veiw.View;

import java.util.Arrays;
import java.util.Comparator;

public class BooksService {

    private static final String CHESS_FOR_DUMMIES = "Chess for Dummies";
    private static final String ENGLISH_LESSONS = "English lessons";
    private static final String FAIRY_TALE = "Fairy tale";
    private static final String PETROV = "Petrov";
    private static final String IVANOV = "Ivanov";
    private static final String SIDOROV = "Sidorov";
    private static final String KYREN = "Kyren";
    private static final String DANDY = "Dandy";
    private static final String SUM = "Sum";
    private static final int ONE_HUNDRED_PERCENT = 100;
    private static final int INIT_NUMBER = 0;
    private static final int FIRST_DATA_YEAR_OF_PUBLISHING = 2001;
    private static final int SECOND_DATA_YEAR_OF_PUBLISHING = 2002;
    private static final int THIRD_DATA_YEAR_OF_PUBLISHING = 2003;
    private static final int NUMBER_OF_PAGES = 320;
    private static final int FIRST_BOOK_COST = 322;
    private static final int SECOND_BOOK_COST = 142;
    private static final int THIRD_BOOK_COST = 511;
    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int DEFAULT_LENGTH = 3;


    private BooksService() {
    }

    public static Books initDefaultData() {
        Books books = new Books(DEFAULT_LENGTH);
        Book book1 = new Book(FIRST, CHESS_FOR_DUMMIES, PETROV, KYREN, FIRST_DATA_YEAR_OF_PUBLISHING, NUMBER_OF_PAGES, FIRST_BOOK_COST);
        Book book2 = new Book(SECOND, ENGLISH_LESSONS, IVANOV, DANDY, SECOND_DATA_YEAR_OF_PUBLISHING, NUMBER_OF_PAGES, SECOND_BOOK_COST);
        Book book3 = new Book(THIRD, FAIRY_TALE, SIDOROV, SUM, THIRD_DATA_YEAR_OF_PUBLISHING, NUMBER_OF_PAGES, THIRD_BOOK_COST);
        addBook(book1, books.getBookArr());
        addBook(book2, books.getBookArr());
        addBook(book3, books.getBookArr());
        View.printInitArray();
        return books;
    }

    public static void addBook(Book book, Book[] bookArr) {
        boolean result = false;
        for (int i = INIT_NUMBER; i < bookArr.length; i++) {
            if (bookArr[i] == null) {
                bookArr[i] = book;
                result = true;
                break;
            }
        }

        if (!result) {
            View.printAddedErrorMessage(bookArr.length);
        }
    }

    public static void changeCostOfBook(Books bookList) {
        int percent = Controller.inputPercent();
        for (Book book : bookList.getBookArr()) {
            double cost = book.getCost();
            book.setCost(cost + (cost * percent / ONE_HUNDRED_PERCENT));
        }
    }

    public static Books searchByAuthor(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        String author = Controller.inputAuthor();
        int counter = getBooksLengthByAuthor(bookArr, author);
        Books booksWithDefineAuthor;

        if (counter == INIT_NUMBER) {
            View.printNotFoundMessage();
            booksWithDefineAuthor = searchByAuthor(bookList);
        } else {
            booksWithDefineAuthor = new Books(counter);
            for (Book book : bookArr) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    addBook(book, booksWithDefineAuthor.getBookArr());
                }
            }
        }
        return booksWithDefineAuthor;
    }

    private static int getBooksLengthByAuthor(Book[] bookArr, String author) {
        int counter = INIT_NUMBER;
        for (Book book : bookArr) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                counter++;
            }
        }
        return counter;
    }

    public static Books searchByYearOfPublishing(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        int yearOfPublishing = Controller.inputYearOfPublishing();
        int counter = getCounterYearOfPublishingBooks(bookArr, yearOfPublishing);
        Books defineYearOfPublishing;

        if (counter == INIT_NUMBER) {
            View.printNotFoundMessage();
            defineYearOfPublishing = searchByYearOfPublishing(bookList);
        } else {
            defineYearOfPublishing =  new Books(counter);
            for (Book book : bookArr) {
                if (book.getYearOfPublishing() > yearOfPublishing) {
                    addBook(book, defineYearOfPublishing.getBookArr());
                }
            }
        }
        return defineYearOfPublishing;
    }

    private static int getCounterYearOfPublishingBooks(Book[] bookArr, int yearOfPublishing) {
        int counter = INIT_NUMBER;
        for (Book book1 : bookArr) {
            if (book1.getYearOfPublishing() > yearOfPublishing) {
                counter++;
            }
        }
        return counter;
    }

    public static Book [] sortByAuthor (Book [] bookArr) {
        Book[] copyBook = bookArr.clone();
        Arrays.sort(copyBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
     });
        return copyBook;
    }

    public static Book [] sortByPublishingHouse(Book [] bookArr) {
        Book[] copyBook = bookArr.clone();
        Arrays.sort(copyBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingHouse().compareTo(o2.getPublishingHouse());
            }
        });
        return copyBook;
    }

    public static Book [] descSortByCost (Book [] bookArr) {
        Book[] copyBook = bookArr.clone();
        Arrays.sort(copyBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o2.getCost(), o1.getCost());
            }
        });
        return copyBook;
    }

}
