package mg.dvo_ran.shapes;

public class Triangle extends AbstractNotCircleShapes {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        validateSide(a, "a");
        validateSide(b, "b");
        validateSide(a, "c");
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new IllegalArgumentException("Такого треугольника не существует (нарушено неравенство треугольника).");
        this.a = a;
        this.b = b;
        this.c = c;
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
        return new double[]{a, b, c};
    }
}
