package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.AreaVisitor;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterVisitor;

public class Triangle implements PerimeterShape, AreaShape {
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

    public double a() {
        return a;
    }

    public double b() {
        return b;
    }

    public double c() {
        return c;
    }

    public void accept(PerimeterVisitor v) {
        v.visit(this);
    }

    public void accept(AreaVisitor v) {
        v.visit(this);
    }

}
