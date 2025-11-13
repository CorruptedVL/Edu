package mg.dvo_ran.shapes;

public class Circle extends AbstractCircleShapes {
    private final double radius;

    public Circle(double radius) {
        if (Double.isNaN(radius) || Double.isInfinite(radius)) {
            throw new IllegalArgumentException("Radius must be a finite number");
        }
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
        this.radius = radius;
    }

    @Override
    protected double[] sides() {
        return new double[]{radius};
    }
}
