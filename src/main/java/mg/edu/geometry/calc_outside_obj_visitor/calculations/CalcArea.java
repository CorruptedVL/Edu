package mg.edu.geometry.calc_outside_obj_visitor.calculations;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Area;
import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.*;

public class CalcArea implements ShapeVisitor {

    @Override
    public Result visit(Rectangle r) {
        double area = r.a() * r.b();
        return new Area(area, r.displayName());
    }

    @Override
    public Result visit(Triangle t) {
        double perimeter = t.a() + t.b() + t.c();
        double p = perimeter / 2.0;
        double area = Math.sqrt(p * (p - t.a()) * (p - t.b()) * (p - t.c()));
        return  new Area(area, "Треугольник");
    }

    @Override
    public Result visit(Circle c) {
        double area = Math.PI * c.radius() * c.radius();
        return  new Area(area, "Круг");
    }

    @Override
    public Result visit(Trapezoid trapezoid) {
        return  new Area("Площадь трапеции не считаем");
    }

}
