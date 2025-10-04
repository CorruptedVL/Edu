package mg.edu.astronomy.estimators;

import mg.edu.astronomy.cosmic_bodies.Planet;

public class SometherBySomething implements EstimateStrategy {
    @Override
    public double estimate(Planet a, Planet b) {
        double sum = 0;
        for (double i : a.facts().something().set()) {
            sum += i;
        }
        for (double i : b.facts().something().set()) {
            sum += i;
        }
        return sum;
    }
}
