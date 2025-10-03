package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByCoord implements EstimateStrategy {

    @Override
    public double estimate(Planet a, Planet b) {
        double dx = a.facts().x() - b.facts().x();
        double dy = a.facts().y() - b.facts().y();
        if (Double.isNaN(dx) || Double.isNaN(dy)) {
            throw new IllegalStateException("Нужны известные x,y у обеих планет");
        }
        return Math.hypot(dx, dy);
    }
}
