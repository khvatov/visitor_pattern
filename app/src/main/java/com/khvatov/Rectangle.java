package com.khvatov;

import com.khvatov.visitors.ShapeVisitor;
import lombok.Getter;

@Getter
public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}
