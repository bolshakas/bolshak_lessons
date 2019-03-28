package com.bolshak.hometasks.hometask7.controller;

import com.bolshak.hometasks.hometask7.model.entity.Circle;
import com.bolshak.hometasks.hometask7.model.entity.Rectangle;
import com.bolshak.hometasks.hometask7.model.entity.Shape;
import com.bolshak.hometasks.hometask7.model.entity.Triangle;

public class Controller {
    private static final String RED = "red";
    private static final String YELLOW = "yellow";
    private static final String BLUE = "blue";

    public static Shape[] initShapeArray() {
        Shape[] arrShapes = new Shape[9];
        arrShapes[0] = new Rectangle(RED, 2, 3);
        arrShapes[1] = new Rectangle(RED, 3, 2);
        arrShapes[2] = new Rectangle(RED, 4, 3);
        arrShapes[3] = new Rectangle(RED, 5, 2);
        arrShapes[4] = new Circle(YELLOW, 5);
        arrShapes[5] = new Circle(YELLOW, 4);
        arrShapes[6] = new Circle(YELLOW, 3);
        arrShapes[7] = new Triangle(BLUE, 3, 4, 4);
        arrShapes[8] = new Triangle(BLUE, 4, 5, 6);
        return arrShapes;
    }
}
