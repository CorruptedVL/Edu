package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByOrbit implements EstimateStrategy {
    @Override
    public double estimate(Planet a, Planet b) {
        double r1 = a.facts().radius();
        double r2 = b.facts().radius();
        if (Double.isNaN(r1) || Double.isNaN(r2)) {
            throw new IllegalStateException("Нужны известные радиусы орбит у обеих планет");
        }
        return Math.abs(r1 - r2);
    }
}
