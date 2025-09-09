package mg.edu.geometry.calc_outside_obj_visitor.shapes;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.calculations.ShapeVisitor;

public class Trapezoid extends Shape {
    private final double a, b, c, d;

    public Trapezoid(double a, double b, double c, double d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
            throw new IllegalArgumentException("Все стороны трапеции > 0");
        this.a = a; this.b = b; this.c = c; this.d = d;
    }

    public double a() { return a; }
    public double b() { return b; }
    public double c() { return c; }
    public double d() { return d; }

    @Override
    public Result accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}
