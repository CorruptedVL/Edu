package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;


import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterVisitor;

public class Trapezoid implements PerimeterShape {
    private final double a, b, c ,d;

    public Trapezoid(double a, double b, double c, double d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными.");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public double d() {
        return d;
    }

    public void accept(PerimeterVisitor v) {
        v.visit(this);
    }
}
