package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByDarkMatter implements EstimateStrategy {
    private final DistanceByOrbitRadius orbitDelegate = new DistanceByOrbitRadius();

    @Override
    public double estimate(Planet a, Planet b) {
       String sign =  a.facts().darkMatter().darkSignature();
        if (!Double.isNaN(a.facts().orbitRadius().radius())) {
            return orbitDelegate.estimate(a, b);
        }
        return 0;
    }
}
