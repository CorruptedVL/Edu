package mg.edu.geometry.calc_outside_obj_visitor.metrics;

public class Perimeter extends MetricResult {

    public Perimeter(double perimeter, String desc) {
        super(perimeter, desc);
    }

    @Override
    public String toString() {
        return "Периметр " + desc + " = " + value;
    }
}
