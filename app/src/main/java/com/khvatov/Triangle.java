package com.khvatov;
import com.khvatov.visitors.ShapeVisitor;
import lombok.Getter;

@Getter
public class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }

}
