package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.HasCoordinates;
import mg.edu.astronomy.cosmic_bodies.Planet;

public class DistanceByCoord implements EstimateStrategy {


    @Override
    public double estimate(Planet a, Planet b) {
        if (!(a instanceof HasCoordinates p1) || !(b instanceof HasCoordinates p2)) {
            throw new IllegalStateException(
                    "Должны быть координаты у обоихь планет, чтобы посчитать");
        }
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.hypot(dx, dy);
    }

}
