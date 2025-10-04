package mg.edu.astronomy;

import mg.edu.astronomy.estimators.DistanceByDarkMatter;
import mg.edu.astronomy.estimators.DistanceByOrbitRadius;
import mg.edu.astronomy.estimators.DistanceByCoordinates;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DistanceTest {
    SolarSystem solarSystem = new SolarSystem();
    DistanceByOrbitRadius distanceByOrbitRadius = new DistanceByOrbitRadius();
    DistanceByCoordinates distanceByCoordinates = new DistanceByCoordinates();
    DistanceByDarkMatter distanceByDarkMatter= new DistanceByDarkMatter();

    @Test
    public void fromMercuryToVenus() {
        var distByOrbit = distanceByOrbitRadius.estimate(solarSystem.mercury, solarSystem.venus);
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
