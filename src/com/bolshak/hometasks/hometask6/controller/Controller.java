package com.bolshak.hometasks.hometask6.controller;

import com.bolshak.hometasks.hometask6.controller.exceptions.AuthorFormatException;
import com.bolshak.hometasks.hometask6.controller.exceptions.FileNameFormatException;
import com.bolshak.hometasks.hometask6.controller.exceptions.PercentFormatException;
import com.bolshak.hometasks.hometask6.controller.exceptions.YearFormatException;
import com.bolshak.hometasks.hometask6.veiw.View;

import java.util.Scanner;

public class Controller {


    private Controller() {
    }

    public static int inputPercent()  {
        Scanner scanner = new Scanner(System.in);
        View.printInputPercentMessage();
        int percent = scanner.nextInt();
        try {
            Validator.validatePercent(percent);
        } catch (PercentFormatException ex) {
            View.printIncorrectInput();
            percent = inputPercent();
        }
        return percent;
    }

    public static String inputAuthor() {
        Scanner scanner = new Scanner(System.in);
        View.printInputAuthorMessage();
        String author = scanner.nextLine();
        try {
           Validator.validateAuthor(author);
        }
        catch (AuthorFormatException e) {
            View.printIncorrectInput();
            author = inputAuthor();
        }
        return author;
    }


    public static int inputYearOfPublishing() {
        Scanner scanner = new Scanner(System.in);
        View.printInputYearMessage();
        int yearOfPublishing = scanner.nextInt();
        try {
            Validator.validateYearOfPublishing(yearOfPublishing);
        } catch (YearFormatException e) {
            View.printIncorrectInput();
            yearOfPublishing = inputYearOfPublishing();
        }
        return yearOfPublishing;
    }

    public static String inputNameOfFile (){

        Scanner scanner = new Scanner(System.in);
        String nameOfFile = scanner.nextLine();
        try {
            Validator.validateNameOfFile(nameOfFile);
        }
        catch (FileNameFormatException e) {
            View.printIncorrectInput();
            nameOfFile = inputNameOfFile();
        }
        return nameOfFile;
    }
}
