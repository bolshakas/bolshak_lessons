package com.bolshak.hometasks.hometask6.controller;

import com.bolshak.hometasks.hometask6.controller.exceptions.AuthorFormatException;
import com.bolshak.hometasks.hometask6.controller.exceptions.FileNameFormatException;
import com.bolshak.hometasks.hometask6.controller.exceptions.PercentFormatException;
import com.bolshak.hometasks.hometask6.controller.exceptions.YearFormatException;

import java.util.Date;

public class Validator {
    private static final int MIN_INPUT_PERCENT_VALUE = -100;
    private static final int CURRENT_YEAR = new Date().getYear() + 1900;
    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 20;

    public static void validatePercent(int percent) throws PercentFormatException {

        if (percent < MIN_INPUT_PERCENT_VALUE) {
            throw new PercentFormatException();
        }
    }

    public static void validateAuthor(String author) throws AuthorFormatException {

        if (author.length() < MIN_LENGTH || author.length() > MAX_LENGTH) {
            throw new AuthorFormatException();
        }
    }

    public static void validateYearOfPublishing (int yearOfPublishing) throws YearFormatException {
        if (yearOfPublishing > CURRENT_YEAR) {
            throw new YearFormatException();
        }
    }

    public static void validateNameOfFile (String name) throws FileNameFormatException {
        if (name.length()<MIN_LENGTH || name.length()> MAX_LENGTH){
            throw new FileNameFormatException();
        }
    }
}
