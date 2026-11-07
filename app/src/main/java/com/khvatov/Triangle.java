package com.khvatov;
import com.khvatov.visitors.ShapeVisitor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter
@RequiredArgsConstructor
public class Triangle {
    private final double base;
    private final double height;


    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }

}
