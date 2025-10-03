package mg.edu.astronomy.cosmic_bodies;

import mg.edu.astronomy.estimators.DistanceByOrbit;
import mg.edu.astronomy.estimators.EstimateStrategy;

public class PlanetWithRadius extends Planet implements HasRadius {
    private final double distanceToStar;

    public PlanetWithRadius(String name, double distanceToStar) {
        super(name, defaultStrategy());
        this.distanceToStar = distanceToStar;
    }

    private static EstimateStrategy defaultStrategy() {
        return new DistanceByOrbit();
    }

    @Override
    public double distanceToStar() {
        return distanceToStar;
    }
}
