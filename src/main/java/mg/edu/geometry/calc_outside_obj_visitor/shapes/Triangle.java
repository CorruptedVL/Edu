package mg.edu.geometry.calc_outside_obj_visitor.shapes;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.calculations.ShapeVisitor;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) throw new IllegalArgumentException("Стороны треугольника должны быть > 0");
        if (a + b <= c || a + c <= b || b + c <= a) throw new IllegalArgumentException("Треугольник не существует");
        this.a = a; this.b = b; this.c = c;
    }

    public double a() { return a; }
    public double b() { return b; }
    public double c() { return c; }

    @Override
    public Result accept(ShapeVisitor visitor) {

        return visitor.visit(this);
    }
}
