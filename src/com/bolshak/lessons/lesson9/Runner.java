package com.bolshak.lessons.lesson9;

public class Runner {
    public static void main(String[] args) {
        MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhomeNumber("Iva", "+30986448848");
        phoneBook.addPhomeNumber("Ray", "+30986448848");
        phoneBook.addPhomeNumber("Lili", "+30986448848");
        System.out.println(phoneBook);
    }
}
