package mg.edu.astronomy.cosmic_bodies;

import mg.edu.astronomy.estimators.DistanceByCoord;
import mg.edu.astronomy.estimators.EstimateStrategy;

public class PlanetWithCoord extends Planet implements HasCoordinates {
    private final double x;
    private final double y;

    public PlanetWithCoord(String name, double x, double y) {
        super(name, defaultStrategy());
        this.x = x;
        this.y = y;
    }

    private static EstimateStrategy defaultStrategy() {
        return new DistanceByCoord();
    }

    @Override
    public double getX() { return x; }

    @Override
    public double getY() { return y; }
}
