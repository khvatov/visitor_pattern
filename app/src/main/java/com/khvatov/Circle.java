package com.khvatov;

import com.khvatov.visitors.ShapeVisitor;

import lombok.Value;

@Value
public class Circle implements Shape{
    private final double radius;


    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }

}
