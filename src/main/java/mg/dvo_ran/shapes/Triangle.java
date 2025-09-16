package mg.dvo_ran.shapes;

public class Triangle extends AbstractNotCircleShapes{
    private final double x;
    private  final double y;
    private final double z;

    public Triangle(double x, double y, double z) {
        if (x <= 0 || y <= 0 || z <= 0)
            throw new IllegalArgumentException("Стороны треугольника должны быть положительными.");
        if (x + y <= z || x + z <= y || y + z <= x)
            throw new IllegalArgumentException("Такого треугольника не существует (нарушено неравенство треугольника).");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    protected double[] sides() {
        return new double[] {x, y, z};
    }
}
