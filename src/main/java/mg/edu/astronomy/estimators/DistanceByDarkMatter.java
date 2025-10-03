package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByDarkMatter implements EstimateStrategy {
    private final DistanceByOrbit orbitDelegate = new DistanceByOrbit();
    private final DistanceByCoord coordDelegate = new DistanceByCoord();

    @Override
    public double estimate(Planet a, Planet b) {
        if (a.facts().radius() != Double.NaN) {
            return orbitDelegate.estimate(a, b);
        }
        return 0;
    }
}
