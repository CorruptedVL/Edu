package mg.edu.astronomy.selector;

import mg.edu.astronomy.cosmic_bodies.Planet;
import mg.edu.astronomy.estimators.EstimateStrategy;
import java.util.List;

public interface StrategySelector {
    List<EstimateStrategy> selectAll(Planet a, Planet b);

}
