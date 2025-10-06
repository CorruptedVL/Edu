package mg.edu.astronomy.selector;

import mg.edu.astronomy.cosmic_bodies.Planet;
import mg.edu.astronomy.estimators.EstimateStrategy;

import java.util.*;

public class DistanceEstimator {

    private final StrategySelector selector;

    public DistanceEstimator(StrategySelector selector) {
        this.selector = selector;
    }

    public Map<String, Double> estimateAll(Planet a, Planet b) {

        var strategies = selector.selectAll(a, b);

        if (strategies.isEmpty()) {
            throw new IllegalStateException("Нет применимых стратегий для " + a + " и " + b);
        }

        Map<String, Double> results = new LinkedHashMap<>();

        for (EstimateStrategy s : strategies) {
            double v = s.estimate(a, b);
            if (Double.isFinite(v)) {
                results.put(s.getClass().getSimpleName(), v);
            }
        }
        if (results.isEmpty()) {
            throw new IllegalStateException("Стратегии найдены, но ни одна не смогла посчитать: " + a + " и " + b);
        }
        return results;
    }
}
