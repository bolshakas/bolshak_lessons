package com.bolshak.hometasks.hometask7;

import com.bolshak.hometasks.hometask7.model.entity.Shape;

import static com.bolshak.hometasks.hometask7.controller.Controller.initShapeArray;
import static com.bolshak.hometasks.hometask7.model.ShapeService.*;
import static com.bolshak.hometasks.hometask7.view.View.printArray;
import static com.bolshak.hometasks.hometask7.view.View.println;

public class Hometask7Runner {

    private static final String OF_ALL_RECTANGLE = "Of all rectangle";
    private static final String OF_ALL_CIRCLE = "Of all circle is";
    private static final String OF_OLL_TRIANGLE = "Of all triangle is";
    private static final String TOTAL = "Total";

    public static void main(String[] args) {
        Shape[] arrShapes =initShapeArray();
        printArray(arrShapes);
        println(TOTAL, calculateAreaOfShapes(arrShapes));
        double[] areaOfOneTypeShapes = calculateAreaOfEachTypeShapes(arrShapes);
        println(OF_ALL_RECTANGLE, areaOfOneTypeShapes[0]);
        println(OF_ALL_CIRCLE, areaOfOneTypeShapes[1]);
        println(OF_OLL_TRIANGLE, areaOfOneTypeShapes[2]);
        println(TOTAL,calculateAreaOfShapes(arrShapes));
    }
}
