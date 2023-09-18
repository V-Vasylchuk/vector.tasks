package fourth;

import fourth.impl.Circle;
import fourth.impl.Rectangle;
import fourth.impl.Square;
import fourth.impl.Triangle;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {

    @Test
    public void testGetArea() {
        List<Shape> expectedListShapesSortedByArea = List.of(
                new Rectangle(2.5, 3.5), new Square(3.5),
                new Triangle(4.5, 9.5), new Triangle(5.5, 10.5),
                new Rectangle(4.5, 10.5), new Circle(4.5), new Square(10.5),
                new Circle(18.5));
        List<Shape> shapes = List.of(
                new Circle(4.5), new Circle(18.5), new Square(10.5), new Square(3.5),
                new Rectangle(4.5, 10.5), new Rectangle(2.5, 3.5),
                new Triangle(5.5, 10.5), new Triangle(4.5, 9.5)
        );
        assertEquals(expectedListShapesSortedByArea, shapes.stream()
                .sorted(Comparator.comparing(Shape::getArea))
                .toList());
    }
}