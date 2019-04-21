package com.bolshak.hometasks.hometask6;

import com.bolshak.hometasks.hometask6.model.BooksService;
import com.bolshak.hometasks.hometask6.model.entity.Book;
import com.bolshak.hometasks.hometask6.model.util.SerializationService;
import com.bolshak.hometasks.hometask6.model.entity.Books;
import com.bolshak.hometasks.hometask6.veiw.View;


public class HomeTask6Runner {
    public static void main(String[] args) {
        Books bookList = SerializationService.deserializeBooks();

        View.printAllBooks(bookList);

        BooksService.changeCostOfBook(bookList);
        View.printChangeCostMessage();
        View.printAllBooks(bookList);

        View.printAllBooks(BooksService.searchByAuthor(bookList));
        View.printAllBooks(BooksService.searchByYearOfPublishing(bookList));

        Book[] arrByAuthor = BooksService.sortByAuthor(bookList.getBookArr());
        View.printBookArray(arrByAuthor);

        SerializationService.serializeIntermediateResult(arrByAuthor);

        Book[] arrByCost = BooksService.descSortByCost(bookList.getBookArr());
        View.printBookArray(arrByCost);

        SerializationService.serializeIntermediateResult(arrByCost);

        Book[] arrByPublishingHouse = BooksService.sortByPublishingHouse(bookList.getBookArr());
        View.printBookArray(arrByPublishingHouse);

        SerializationService.serializeIntermediateResult(arrByPublishingHouse);

        SerializationService.serializeBooks(bookList);
    }
}
