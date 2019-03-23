package com.bolshak.hometasks.hometask6.model.entity;

public class Books {

    private Book[] bookArr;

    public Books(int length) {
        bookArr = new Book[length];
    }

    public Book[] getBookArr() {
        return bookArr;
    }

}

