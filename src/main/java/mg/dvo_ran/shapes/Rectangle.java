package mg.dvo_ran.shapes;

public class Rectangle extends AbstractNotCircleShapes {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0)
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными.");
        this.a = a;
        this.b = b;
    }
    @Override
    protected double[] sides() {
        return new double[]{a, b};
    }
}
