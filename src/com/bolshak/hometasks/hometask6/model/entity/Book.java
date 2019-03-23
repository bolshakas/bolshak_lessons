package com.bolshak.hometasks.hometask6.model.entity;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublishing;
    private int numberOfPages;
    private double cost;

    public Book(int id, String name, String author, String publishingHouse, int yearOfPublishing, int numberOfPages, double cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return ("ID: " + id + "; name: " + name + "; author: " + author + "; publishing house: " + publishingHouse + "; year of publishing: " + yearOfPublishing + "; number of pages: " + numberOfPages + "; cost: " + cost);

    }
}
