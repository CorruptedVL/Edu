package mg.edu.geometry.calc_inside_obj.shapes;

public class Circle implements ShapePerimeter, ShapeArea {
    private final double r;

    public Circle(double r) {
        if (r <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
    public double getArea() {
        return Math.PI * r * r;
    }
}
