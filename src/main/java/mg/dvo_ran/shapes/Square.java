package mg.dvo_ran.shapes;

public class Square extends AbstractNotCircleShapes {
    private final double side;

    public Square(double side) {
        if (Double.isNaN(side) || Double.isInfinite(side)) {
            throw new IllegalArgumentException("Side must be a finite number");
        }
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be > 0");
        }
        this.side = side;
    }

    @Override
    protected double[] sides() {
        return new double[]{side, side};
    }
}
