package mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.*;

public class PerimeterCalc implements PerimeterVisitor {
    private double result;

    public double getResult() {
        return result;
    }

    public void visit(Square s) {
        result = 4 * s.side();
    }

    public void visit(Rectangle r) {
        result = 2 * (r.a() + r.b());
    }

    public void visit(Triangle t) {
        result = t.a() + t.b() + t.c();
    }

    public void visit(Circle c) {
        result = 2 * Math.PI * c.radius();
    }

    public void visit(Trapezoid z) {
        result = z.a() + z.b() + z.c() + z.d();
    }
}
