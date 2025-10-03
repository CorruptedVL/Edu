package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.HasRadius;
import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByOrbit implements EstimateStrategy {
    @Override
    public double estimate(Planet a, Planet b) {
        if (!(a instanceof HasRadius p1) || !(b instanceof HasRadius p2)){
            throw new IllegalStateException(
                    "У обоих планет должны быть известны радиусы, чтобы посчитать");
        }
        return Math.abs(p1.distanceToStar() - p2.distanceToStar());
    }
}
