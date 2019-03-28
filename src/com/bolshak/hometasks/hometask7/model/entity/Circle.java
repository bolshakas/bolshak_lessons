package com.bolshak.hometasks.hometask7.model.entity;

import static java.lang.Math.PI;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * (radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius = " + radius + ";";
    }

}
