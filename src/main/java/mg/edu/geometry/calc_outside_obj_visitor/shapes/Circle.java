package mg.edu.geometry.calc_outside_obj_visitor.shapes;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.calculations.ShapeVisitor;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус > 0");
        this.radius = radius;
    }

    public double radius() { return radius; }

    @Override
    public Result accept(ShapeVisitor visitor) {
        return visitor.visit(this);
    }
}

