package com.khvatov;

import com.khvatov.visitors.ShapeVisitor;

import lombok.Value;

@Value
public class Rectangle {
    private final double width;
    private final double height;



    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}
