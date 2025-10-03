package mg.edu.astronomy.cosmic_bodies;

import mg.edu.astronomy.estimators.EstimateStrategy;

public abstract class Planet extends AbstractBody {
    EstimateStrategy strategy;

    public Planet(String name, EstimateStrategy strategy) {
        super(name);
        this.strategy = strategy;
    }
    public double distanceTo(Planet other) {
        return strategy.estimate(this, other);
    }
}
