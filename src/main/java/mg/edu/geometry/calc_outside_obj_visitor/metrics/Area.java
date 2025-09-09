package mg.edu.geometry.calc_outside_obj_visitor.metrics;


public class Area extends MetricResult {

    public Area(double area, String desc) {
        super(area, desc);
    }

    public Area(String reason) {
        super(reason);
    }

    @Override
    public String toString() {
        return supported ? ("Площадь " + desc + " = " + value) : desc;
    }

}
