package mg.dvo_ran.shapes;

public class Trapezoid extends AbstractNotCircleShapes {
    private final double t1;
    private final double t2;
    private final double t3;
    private final double t4;

    public Trapezoid(double t1, double t2, double t3, double t4) {
        if (t1 <= 0 || t2 <= 0 || t3 <= 0 || t4 <= 0)
            throw new IllegalArgumentException("Стороны трапеции должны быть положительными.");
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
    }

    @Override
    protected double[] sides() {
        return new double[]{t1, t2, t3, t4};
    }
}
