package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByCoordinates implements EstimateStrategy {

    @Override
    public double estimate(Planet a, Planet b) {
        double dx = a.facts().coordinates().x() - b.facts().coordinates().x();
        double dy = a.facts().coordinates().y() - b.facts().coordinates().y();
        if (Double.isNaN(dx) || Double.isNaN(dy)) {
            throw new IllegalStateException("Нужны известные x,y у обеих планет");
        }
        return Math.hypot(dx, dy);
    }
}
