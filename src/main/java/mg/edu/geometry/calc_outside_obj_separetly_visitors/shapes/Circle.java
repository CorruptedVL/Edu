package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.AreaVisitor;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterVisitor;

public class Circle implements PerimeterShape, AreaShape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.radius = radius;
    }

    public double radius() {
        return radius;
    }

    public void accept(PerimeterVisitor v) {

        v.visit(this);
    }

    public void accept(AreaVisitor v) {

        v.visit(this);
    }
}
