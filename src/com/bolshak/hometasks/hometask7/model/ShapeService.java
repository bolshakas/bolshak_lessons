package com.bolshak.hometasks.hometask7.model;

import com.bolshak.hometasks.hometask7.model.entity.Circle;
import com.bolshak.hometasks.hometask7.model.entity.Rectangle;
import com.bolshak.hometasks.hometask7.model.entity.Shape;
import com.bolshak.hometasks.hometask7.model.entity.Triangle;

public class ShapeService {

    private static final double INITIAL_VALUE = 0.0;

    public static double calculateAreaOfShapes(Shape[] shapes) {
        double arrOfShapes = INITIAL_VALUE;
        for (Shape shape : shapes) {
            arrOfShapes += shape.calcArea();
        }
        return arrOfShapes;
    }

    public static double[] calculateAreaOfEachTypeShapes(Shape[] arrShapes) {
        double areaOfRectangle = INITIAL_VALUE;
        double areaOfCircle = INITIAL_VALUE;
        double areaOfTriangle = INITIAL_VALUE;

        for (Shape shape : arrShapes) {
            if (shape instanceof Rectangle) {
                areaOfRectangle += shape.calcArea();
            } else if (shape instanceof Circle) {
                areaOfCircle += shape.calcArea();
            } else if (shape instanceof Triangle) {
                areaOfTriangle += shape.calcArea();
            }
        }
        return new double[]{areaOfRectangle, areaOfCircle, areaOfTriangle};
    }
}
