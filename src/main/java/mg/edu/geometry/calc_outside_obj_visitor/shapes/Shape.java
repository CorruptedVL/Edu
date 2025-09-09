package mg.edu.geometry.calc_outside_obj_visitor.shapes;

import mg.edu.geometry.calc_outside_obj_visitor.metrics.Result;
import mg.edu.geometry.calc_outside_obj_visitor.calculations.ShapeVisitor;

public abstract class Shape {
    public abstract Result accept(ShapeVisitor visitor);
}
