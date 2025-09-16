package mg.edu.geometry.calc_inside_obj.shapes;


public class Rectangle implements ShapePerimeter, ShapeArea {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными.");
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    public double getArea() {
        return a * b;
    }
}