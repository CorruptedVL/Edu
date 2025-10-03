package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceEstimator implements EstimateStrategy {
    @Override
    public double estimate(Planet a, Planet b) {
        return Math.abs(a.distanceToStar() - b.distanceToStar());
    }
}
