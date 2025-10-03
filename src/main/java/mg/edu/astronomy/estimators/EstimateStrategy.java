package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public interface EstimateStrategy {
    double estimate (Planet a, Planet b);
}
