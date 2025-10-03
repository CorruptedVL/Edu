package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodys.Planet;

public interface EstimateStrategy {
    double estimate (Planet a, Planet b);
}
