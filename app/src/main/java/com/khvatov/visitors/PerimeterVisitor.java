package com.khvatov.visitors;

import com.khvatov.Circle;
import com.khvatov.Rectangle;
import com.khvatov.Triangle;

public class PerimeterVisitor implements ShapeVisitor {
    @Override
    public double visit(Circle circle) {
        var perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Calculating perimeter of Circle");
        return perimeter;
    }

    @Override
    public double visit(Rectangle rectangle) {
        System.out.println("Calculating perimeter of Rectangle");
        return 2 * (rectangle.getWidth() + rectangle.getHeight());
    }

    @Override
    public double visit(Triangle triangle) {
        System.out.println("Calculating perimeter of Triangle");
        return triangle.getBase() + triangle.getHeight() + Math.sqrt(Math.pow(triangle.getBase(), 2) + Math.pow(triangle.getHeight(), 2));
    }

}
