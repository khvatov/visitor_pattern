package com.khvatov.visitors;

import com.khvatov.Circle;
import com.khvatov.Rectangle;
import com.khvatov.Triangle;

public class AreaVisitor implements ShapeVisitor {
    @Override
    public double visit(Circle circle) {
        var area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Calculating area of Circle");
        return area;
    }

    @Override
    public double visit(Rectangle rectangle) {
        System.out.println("Calculating area of Rectangle");
        return rectangle.getWidth() * rectangle.getHeight();    
    }

    @Override
    public double visit(Triangle triangle) {        
        System.out.println("Calculating area of Triangle");
        return 0.5 * triangle.getBase() * triangle.getHeight();
    }

}
