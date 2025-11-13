package mg.dvo_ran.shapes;

public class Rectangle extends AbstractNotCircleShapes {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        validateSide(a, "a");
        validateSide(b, "b");
        this.a = a;
        this.b = b;
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
        return new double[]{a, b};
    }
}
