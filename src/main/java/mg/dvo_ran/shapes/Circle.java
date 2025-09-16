package mg.dvo_ran.shapes;

public class Circle extends AbstractCircleShapes{
    private final double r;

    public Circle(double r) {
        if (r <= 0) throw new IllegalArgumentException("Радиус должен быть положительным");
        this.r = r;
    }

    @Override
    protected double[] sides() {
        return new double[] {r};
    }
}
