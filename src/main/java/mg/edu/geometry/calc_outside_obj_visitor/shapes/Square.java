package mg.edu.geometry.calc_outside_obj_visitor.shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double side() {
        return a();
    }

    public String displayName() {
        return "Квадрат";
    }
}
