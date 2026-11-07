package com.khvatov.visitors;

import com.khvatov.Circle;
import com.khvatov.Rectangle;
import com.khvatov.Triangle;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;

public class PerimeterVisitor implements ShapeVisitor {
    @Override
    public double visit(Circle circle) {
        var perimeter = 2 * PI * circle.getRadius();
        IO.println("Calculating perimeter of Circle");
        return perimeter;
    }

    @Override
    public double visit(Rectangle rectangle) {
        
        IO.println("Calculating perimeter of Rectangle");
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    @Override
    public double visit(Triangle triangle) {
        IO.println("Calculating perimeter of Triangle");
        return triangle.getBase() + triangle.getHeight() + sqrt(Math.pow(triangle.getBase(), 2) + Math.pow(triangle.getHeight(), 2));
    }

}
