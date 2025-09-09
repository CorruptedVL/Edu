package mg.edu.geometry.calc_outside_obj_visitor.calculations;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Circle;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Rectangle;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Trapezoid;
import mg.edu.geometry.calc_outside_obj_visitor.shapes.Triangle;

public interface ShapeVisitor {
    Result visit (Rectangle rectangle);
    Result visit (Triangle triangle);
    Result visit (Circle circle);
    Result visit (Trapezoid trapezoid);
}
