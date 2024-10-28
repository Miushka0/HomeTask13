package app.Shapes;

public class Triangle implements Shape{
    private double triangleSide;
    private double triangleHeight;

    public Triangle(double triangleHeight, double triangleSide) {
        this.triangleHeight = triangleHeight;
        this.triangleSide = triangleSide;
    }

    @Override
    public double getArea() {
        return 0.5 * triangleSide * triangleHeight;
    }
}
