package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.PerimeterVisitor;

public interface PerimeterShape {
    void accept (PerimeterVisitor visitor);
}
