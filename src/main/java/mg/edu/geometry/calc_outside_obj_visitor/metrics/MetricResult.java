package mg.edu.geometry.calc_outside_obj_visitor.metrics;

public abstract class MetricResult implements Result {
    protected final double value;
    protected final String desc;
    protected final boolean supported;

    protected MetricResult(double value, String desc) {
        this.value = value;
        this.desc = desc;
        this.supported = true;
    }

    protected MetricResult(String desc) {
        this.value = Double.NaN;
        this.desc = desc;
        this.supported = false;
    }

    @Override
    public abstract String toString();
}