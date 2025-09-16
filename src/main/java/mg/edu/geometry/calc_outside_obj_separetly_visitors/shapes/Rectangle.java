package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;


import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.AreaVisitor;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterVisitor;

public class Rectangle implements PerimeterShape, AreaShape {
    private final double a, b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными.");
        this.a = a;
        this.b = b;
    }

    public double a() {
        return a;
    }

    public double b() {
        return b;
    }

    public void accept(PerimeterVisitor v) {
        v.visit(this);
    }

    public void accept(AreaVisitor v) {
        v.visit(this);
    }

}