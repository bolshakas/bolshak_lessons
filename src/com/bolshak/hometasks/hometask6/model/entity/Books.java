package com.bolshak.hometasks.hometask6.model.entity;

import java.io.Serializable;

public class Books  implements Serializable {

    private Book[] bookArr;

    public Books (){}

    public Books(int length) {
        bookArr = new Book[length];
    }

    public Book[] getBookArr() {
        return bookArr;
    }

    
}

