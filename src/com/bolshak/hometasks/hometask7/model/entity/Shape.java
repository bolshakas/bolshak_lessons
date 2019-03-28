package com.bolshak.hometasks.hometask7.model.entity;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName()  + ": color = " + color + ";";
    }


}
