package mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Circle;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Rectangle;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Square;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Triangle;

public class AreaCalc implements AreaVisitor {
    private double result;

    public double getResult() {
        return result;
    }

    public void visit(Square s) {
        result = s.side() * s.side();
    }

    public void visit(Rectangle r) {
        result = r.a() * r.b();
    }

    public void visit(Triangle t) {
        double p = (t.a() + t.b() + t.c()) / 2.0;
        result = Math.sqrt(p * (p - t.a()) * (p - t.b()) * (p - t.c()));
    }

    public void visit(Circle c) {
        result = Math.PI * c.radius() * c.radius();
    }

}
