package com.bolshak.hometasks.hometask6;

import com.bolshak.hometasks.hometask6.model.BooksService;
import com.bolshak.hometasks.hometask6.model.entity.Books;
import com.bolshak.hometasks.hometask6.veiw.View;

public class HomeTask6Runner {
    public static void main(String[] args) {
        Books bookList = BooksService.initDefaultData();

        View.printBookListMessage();
        View.printAllBooks(bookList);

        BooksService.changeCostOfBook(bookList);
        View.printChangeCostMessage();
        View.printAllBooks(bookList);
        View.printAllBooks(BooksService.searchByAuthor(bookList));
        View.printAllBooks(BooksService.searchByYearOfPublishing(bookList));

    }
}
