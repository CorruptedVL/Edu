package mg.dvo_ran.shapes;

public class Square extends AbstractNotCircleShapes {
    private final double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("Сторона квадрата должна быть положительной.");
        this.side = side;
    }
    @Override
    protected double[] sides() {
        return new double[]{side, side};
    }
}
