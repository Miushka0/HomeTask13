package app;

import app.Shapes.Circle;
import app.Shapes.Shape;
import app.Shapes.Square;
import app.Shapes.Triangle;

public class HomeTask13 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Circle(1),
                new Triangle(2, 5),
                new Square(3)
        };
        System.out.printf("Загальна лоща фігур: %.2f", sumShapeArea(shapes));
    }

    public static double sumShapeArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum +=shape.getArea();
        }

        return sum;
    }
}
