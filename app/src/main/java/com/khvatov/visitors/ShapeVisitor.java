package com.khvatov.visitors;

import com.khvatov.Circle;
import com.khvatov.Rectangle;
import com.khvatov.Triangle;

public interface ShapeVisitor {
    double visit(Circle circle);  
    double visit(Rectangle rectangle);
    double visit(Triangle triangle);

}
