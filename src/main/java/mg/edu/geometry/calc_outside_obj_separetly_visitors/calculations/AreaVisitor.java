package mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Circle;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Rectangle;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Square;
import mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes.Triangle;

public interface AreaVisitor {
    void visit (Square s);
    void  visit (Rectangle r);
    void visit (Triangle t);
    void visit(Circle c);
}
