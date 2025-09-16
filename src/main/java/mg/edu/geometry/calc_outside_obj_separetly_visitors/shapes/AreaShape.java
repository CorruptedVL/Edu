package mg.edu.geometry.calc_outside_obj_separetly_visitors.shapes;

import mg.edu.geometry.calc_outside_obj_separetly_visitors.calculations.AreaVisitor;

public interface AreaShape {
    void accept (AreaVisitor visitor);
}
