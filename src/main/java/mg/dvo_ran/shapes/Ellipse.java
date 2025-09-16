package mg.dvo_ran.shapes;

public class Ellipse extends AbstractCircleShapes {
    private final double rMin;
    private final double rMax;

    public Ellipse(double rMin, double rMax) {
        if (rMin <= 0 || rMax <= 0)
            throw new IllegalArgumentException("Каждая из полуосей эллипса должна быть положительной");
        if (rMin > rMax)
            throw new IllegalArgumentException("Малая полуось должны быть меньше большой полуоси");
        this.rMin = rMin;
        this.rMax = rMax;
    }

    @Override
    protected double[] sides() {
        return new double[]{rMin, rMax};
    }
}
