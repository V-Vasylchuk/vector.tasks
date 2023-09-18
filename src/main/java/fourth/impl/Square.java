package fourth.impl;

import fourth.Shape;

public record Square(double side) implements Shape {

    @Override
    public double getArea() {
        return side * side;
    }
}
