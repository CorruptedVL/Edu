package mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.*;

public interface PerimeterVisitor {
    void visit (Square s);
    void  visit (Rectangle r);
    void visit (Triangle t);
    void visit(Circle c);
    void visit (Trapezoid t);
}
