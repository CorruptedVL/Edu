package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceEstimatorWithCoord implements EstimateStrategy {


    @Override
    public double estimate(Planet a, Planet b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.hypot(dx, dy);
    }
}
