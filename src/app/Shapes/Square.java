package app.Shapes;

public class Square implements Shape {
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double getArea() {
        return squareSide * squareSide;
    }
}
