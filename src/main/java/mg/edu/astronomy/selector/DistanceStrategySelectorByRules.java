package mg.edu.astronomy.selector;

import mg.edu.astronomy.cosmic_bodies.Planet;
import mg.edu.astronomy.estimators.*;
import mg.edu.astronomy.facts.PlanetFacts;

import java.util.ArrayList;
import java.util.List;

public class DistanceStrategySelectorByRules implements StrategySelector {

    @Override
    public List<EstimateStrategy> selectAll(Planet a, Planet b) {
        List<EstimateStrategy> list = new ArrayList<>();
        PlanetFacts fa = a.facts();
        PlanetFacts fb = b.facts();

        if (fa.orbitRadius() != null && fb.orbitRadius() != null) {
            list.add(new DistanceByOrbitRadius());
        }
        if (fa.coordinates() != null && fb.coordinates() != null) {
            list.add(new DistanceByCoordinates());
        }
        if (fa.darkMatter() != null && fb.darkMatter() != null) {
            list.add(new DistanceByDarkMatter());
        }
        if (fa.something() != null && fb.something() != null) {
            list.add(new SometherBySomething());
        }
        return list;
    }
}
