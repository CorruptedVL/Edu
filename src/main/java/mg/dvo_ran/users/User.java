package mg.dvo_ran.users;

import mg.dvo_ran.shapes.Shape;

public interface User {
    String getName();
    double calcArea (Shape shape);
    double calcPerimeter (Shape shape);
}
