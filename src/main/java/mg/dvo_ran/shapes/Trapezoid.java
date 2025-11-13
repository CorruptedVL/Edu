package mg.dvo_ran.shapes;

public class Trapezoid extends AbstractNotCircleShapes {
    private final double t1;
    private final double t2;
    private final double t3;
    private final double t4;

    public Trapezoid(double t1, double t2, double t3, double t4) {
        validateSide(t1, "t1");
        validateSide(t2, "t2");
        validateSide(t3, "t3");
        validateSide(t4, "t4");

        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
    }

    private void validateSide(double value, String name) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Side " + name + " must be a finite number");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("Side " + name + " must be > 0");
        }
    }

    @Override
    protected double[] sides() {
        return new double[]{t1, t2, t3, t4};
    }
}
