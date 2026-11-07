package com.khvatov;
import com.khvatov.visitors.ShapeVisitor;

import lombok.Value;

@Value
public class Triangle {
    private final double base;
    private final double height;


    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }

}
