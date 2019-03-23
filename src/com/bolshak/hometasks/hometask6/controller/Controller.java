package com.bolshak.hometasks.hometask6.controller;

import com.bolshak.hometasks.hometask6.veiw.View;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {

    private static final int MIN_INPUT_PERCENT_VALUE = -100;
    private static final int CURRENT_YEAR = new Date().getYear() + 1900;

    private Controller() {
    }

    public static int inputPercent() {
        Scanner scanner = new Scanner(System.in);
        View.printInputPercentMessage();
        int percent = scanner.nextInt();
        if (percent < MIN_INPUT_PERCENT_VALUE) {
            View.printTryAgainMessage();
            percent = scanner.nextInt();
        }
        return percent;
    }

    public static String inputAuthor() {
        Scanner scanner = new Scanner(System.in);
        View.printInputAuthorMessage();
        return scanner.nextLine();
    }


    public static int inputYearOfPublishing() {
        Scanner scanner = new Scanner(System.in);
        View.printInputYearMessage();
        int yearOfPublishing;
        try {
            yearOfPublishing = scanner.nextInt();
            if (yearOfPublishing > CURRENT_YEAR) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException ex) {
            View.printWrongYearMessage();
            yearOfPublishing = inputYearOfPublishing();
        }
        return yearOfPublishing;
    }
}
