package mg.edu.geometry.calc_inside_obj.shapes;

public class Triangle implements ShapePerimeter, ShapeArea {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными.");
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("Такого треугольника не существует (нарушено неравенство треугольника).");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
