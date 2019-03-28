package com.bolshak.hometasks.hometask7.model.entity;


import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return super.toString()  +
                "a = " + a + ";" +
                " b = " + b + ";" +
                " c = " + c + ";";
    }

}
