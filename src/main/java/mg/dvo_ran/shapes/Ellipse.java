package mg.dvo_ran.shapes;

public class Ellipse extends AbstractCircleShapes {
    private final double rMin;
    private final double rMax;

    public Ellipse(double rMin, double rMax) {
        validateAxis(rMin, "rMin");
        validateAxis(rMax, "rMax");
        if (rMin > rMax)
            throw new IllegalArgumentException("rMax must be >= rMin");
        this.rMin = rMin;
        this.rMax = rMax;
    }

    private void validateAxis(double value, String name) {
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw new IllegalArgumentException("Axis " + name + " must be a finite number");
        }
        if (value <= 0) {
            throw new IllegalArgumentException("Axis " + name + " must be > 0");
        }
    }

    @Override
    protected double[] sides() {
        return new double[]{rMin, rMax};
    }
}
