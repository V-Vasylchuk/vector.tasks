package fourth.impl;

import fourth.Shape;

public record Triangle(double base, double height) implements Shape {
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
