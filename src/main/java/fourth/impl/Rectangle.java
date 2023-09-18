package fourth.impl;

import fourth.Shape;

public record Rectangle(double width, double height) implements Shape {
    @Override
    public double getArea() {
        return width * height;
    }
}
