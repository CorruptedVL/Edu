package mg.edu.geometry.calc_outside_obj_visitor.shapes;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.calculations.ShapeVisitor;

public class Rectangle extends Shape {
    private final double a, b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) throw new IllegalArgumentException("Стороны прямоугольника должны быть > 0");
        this.a = a;
        this.b = b;
    }

    public double a() {
        return a;
    }

    public double b() {
        return b;
    }

    public String displayName() {
        return "Прямоугольник";
    }

    @Override
    public Result accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}
