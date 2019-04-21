package com.bolshak.hometasks.hometask6.veiw;

import com.bolshak.hometasks.hometask6.model.entity.Book;
import com.bolshak.hometasks.hometask6.model.entity.Books;

public class View {
    private static final String ENTER_PERCENTAGE_VALUE_MESSAGE = "Enter a percentage value to change the book cost ->  ";
    private static final String NOTHING_FOUND_FOR_REQUEST = "Nothing found for this request";
    private static final String BOOK_DID_NOT_ADDED_TO_ARRAY = "Book Did not added. The length of the array is ";
    private static final String INCORRECT_INPUT = "Incorrect input! Pleas, try again  ";
    private static final String ENTER_THE_AUTHOR_FOR_SEARCH = "Enter the author to search for books ->  ";
    private static final String ENTER_THE_YEAR_OF_PUBLISHING = "Enter the year of publishing to search for books ->  ";
    private static final String BOOK_LIST = "Book list:";
    private static final String BOOKS_WITH_CHANGE_COST = "Books with change cost:";
    private static final String ERROR = "Error: ";
    private static final String ARRAY_INIT_DEFAULT_DATA = "Array init default data";
    private static final String FILE_READING_ERROR = "File reading error: ";
    private static final String ENTER_NAME_OF_FILE = "Pleas, enter the name of the file ";

    private View() {
    }

    public static void printErrorMessage(String errorMessage) {
        println(ERROR + errorMessage);
    }

    public static void printEnterFileName() {
        print(ENTER_NAME_OF_FILE);
    }

    public static void printFileReadingError(String error) {
        println(FILE_READING_ERROR);
    }

    public static void printInitArray () {println(ARRAY_INIT_DEFAULT_DATA);}

    public static void printChangeCostMessage() {
        println(BOOKS_WITH_CHANGE_COST);
    }

    public static void printAddedErrorMessage(int length) {
        println(BOOK_DID_NOT_ADDED_TO_ARRAY + length);
    }

    public static void printIncorrectInput() {
        print(INCORRECT_INPUT);
    }

    public static void printInputAuthorMessage() {
        print(ENTER_THE_AUTHOR_FOR_SEARCH);
    }

    public static void printInputPercentMessage() {
        print(ENTER_PERCENTAGE_VALUE_MESSAGE);
    }

    public static void printNotFoundMessage() {
        println(NOTHING_FOUND_FOR_REQUEST);
    }

    public static void printInputYearMessage() {
        print(ENTER_THE_YEAR_OF_PUBLISHING);
    }

    public static void printAllBooks(Books bookList) {
        Book[] bookArr = bookList.getBookArr();
        for (Book book : bookArr) {
            println(book.toString());
        }
    }

    public static void printBookArray(Book[] bookArr) {
        println(BOOK_LIST);
        for (Book book : bookArr) {
            println(book.toString());
        }
    }

    private static void println(String string) {
        System.out.println(string);
    }

    private static void print(String string) {
        System.out.print(string);
    }

}
