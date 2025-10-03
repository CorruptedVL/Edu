package mg.edu.astronomy.cosmic_bodies;

import mg.edu.astronomy.estimators.DistanceByDarkMatter;
import mg.edu.astronomy.estimators.EstimateStrategy;

public class PlanetWithDarkMatter extends Planet{

    public PlanetWithDarkMatter(String name) {
        super(name, defaultStrategy());
    }

    private static EstimateStrategy defaultStrategy() {
        return new DistanceByDarkMatter();
    }
}