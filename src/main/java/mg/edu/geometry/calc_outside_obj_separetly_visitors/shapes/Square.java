package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.AreaVisitor;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterVisitor;

public class Square implements PerimeterShape, AreaShape {
    private final double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("Сторона квадрата > 0");
        this.side = side;
    }

    public double side() {
        return side;
    }

    @Override
    public void accept(PerimeterVisitor v) {
        v.visit(this);
    }

    @Override
    public void accept(AreaVisitor v) {
        v.visit(this);
    }
}