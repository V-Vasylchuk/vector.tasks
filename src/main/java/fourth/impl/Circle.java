package fourth.impl;

import fourth.Shape;

public record Circle(double radius) implements Shape {
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
