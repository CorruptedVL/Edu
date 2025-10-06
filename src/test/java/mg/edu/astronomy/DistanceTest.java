package mg.edu.astronomy;

import mg.edu.astronomy.estimators.DistanceByDarkMatter;
import mg.edu.astronomy.estimators.DistanceByOrbitRadius;
import mg.edu.astronomy.estimators.DistanceByCoordinates;
import mg.edu.astronomy.selector.DistanceEstimator;
import mg.edu.astronomy.selector.DistanceStrategySelectorByRules;
import mg.edu.astronomy.selector.StrategySelector;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DistanceTest {
    SolarSystem solarSystem = new SolarSystem();
    DistanceByOrbitRadius distanceByOrbitRadius = new DistanceByOrbitRadius();
    DistanceByCoordinates distanceByCoordinates = new DistanceByCoordinates();
    DistanceByDarkMatter distanceByDarkMatter= new DistanceByDarkMatter();
    StrategySelector selector = new DistanceStrategySelectorByRules();
    DistanceEstimator estimator = new DistanceEstimator(selector);


    @Test
    public void fromMercuryToVenus() {
        var distByOrbit = distanceByOrbitRadius.estimate(solarSystem.mercury, solarSystem.venus);
        System.out.println(distByOrbit);
        System.out.println(estimator.estimateAll(solarSystem.mercury, solarSystem.venus));
    }

    @Test
    public void fromMarsToNeptune() {

        System.out.println(estimator.estimateAll(solarSystem.mars, solarSystem.neptune));

    }



    @Test
    public void fromEarthToMercury() {

    }
    @Test
    public void fromJupiterToEarth() {

    }

    @Test
    public void fromUranusToNeptune(){
        var distance = distanceByDarkMatter.estimate(solarSystem.uranus, solarSystem.neptune);
    }


}
