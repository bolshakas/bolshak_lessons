package com.bolshak.hometasks.hometask6.model.util;

import com.bolshak.hometasks.hometask6.controller.Controller;
import com.bolshak.hometasks.hometask6.model.BooksService;
import com.bolshak.hometasks.hometask6.model.entity.Book;
import com.bolshak.hometasks.hometask6.model.entity.Books;
import com.bolshak.hometasks.hometask6.veiw.View;

import java.io.*;

public class SerializationService {

    private static final String FILE_NAME = "BookList";
    private static final String FILE_DIRECTORY = "src\\com\\bolshak\\hometasks\\hometask6\\resultserialize\\";

    public static void serializeBooks(Books books) {

        File file = new File(FILE_DIRECTORY + FILE_NAME);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(books);
        } catch (Exception ex) {
            View.printErrorMessage(ex.getMessage());
        }
    }

    public static Books deserializeBooks() {
        Books books;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_DIRECTORY + FILE_NAME))) {
            books = (Books) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            View.printFileReadingError(e.getMessage());
            books = BooksService.initDefaultData();
        }
        return books;
    }

    public static void serializeIntermediateResult(Book[] books) {
        View.printEnterFileName();
        File file = new File(FILE_DIRECTORY + Controller.inputNameOfFile());
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(books);
        } catch (Exception ex) {
            View.printErrorMessage(ex.getMessage());
        }
    }
}

