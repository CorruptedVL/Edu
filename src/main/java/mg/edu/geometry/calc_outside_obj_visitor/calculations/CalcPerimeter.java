package mg.edu.geometry.calc_outside_obj_visitor.calculations;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Perimeter;
import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Circle;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Rectangle;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Trapezoid;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Triangle;

public class CalcPerimeter implements ShapeVisitor {

    @Override
    public Result visit(Rectangle r) {
        double perimeter = 2 * (r.a() + r.b());
        return new Perimeter(perimeter, r.displayName());
    }

    @Override
    public Result visit(Triangle t) {
        double perimeter = t.a() + t.b() + t.c();
        return new Perimeter(perimeter, "Треугольник");
    }

    @Override
    public Result visit(Circle c) {
        double perimeter = 2 * Math.PI * c.radius();
        return new Perimeter(perimeter, "Круг");
    }

    @Override
    public Result visit(Trapezoid z) {
        double perimeter = z.a() + z.b() + z.c() + z.d();
        return new Perimeter(perimeter, "Трапеция");
    }
}
