package mg.edu.astronomy.cosmic_bodies;

import mg.edu.astronomy.estimators.EstimateStrategy;

public class Planet extends AbstractBody {

    private final PlanetFacts facts;

    public Planet(String name, PlanetFacts facts) {
        super(name);
        this.facts = facts;
    }
    public PlanetFacts facts() {
        return facts;
    }
}
