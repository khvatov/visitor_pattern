package com.khvatov;

import com.khvatov.visitors.ShapeVisitor;
import lombok.Getter;

@Getter
public class Circle implements Shape{
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }

}
