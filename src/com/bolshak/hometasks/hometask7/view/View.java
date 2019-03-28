package com.bolshak.hometasks.hometask7.view;

import com.bolshak.hometasks.hometask7.model.entity.Shape;

public class View {

    private static final String AREA_IS = " area is: ";

    public static void println(String a, double v) {
        System.out.println(a + AREA_IS + v);
    }

    public static void println(double v) {
        System.out.println(AREA_IS + v);
    }

    private static void print(String s) {
        System.out.print(s);
    }

    public static void printArray(Shape[] arrShapes) {
        for (Shape shape : arrShapes) {
            printShape(shape);
        }
    }

    private static void printShape(Shape shape) {
        print(shape.toString());
        println(shape.calcArea());
    }

}
