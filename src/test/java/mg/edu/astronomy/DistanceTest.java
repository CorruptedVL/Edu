package mg.edu.astronomy;

import mg.edu.astronomy.estimators.DistanceByDarkMatter;
import mg.edu.astronomy.estimators.DistanceByOrbit;
import mg.edu.astronomy.estimators.DistanceByCoord;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DistanceTest {
    SolarSystem solarSystem = new SolarSystem();
    DistanceByOrbit distanceByOrbit = new DistanceByOrbit();
    DistanceByCoord distanceByCoord = new DistanceByCoord();
    DistanceByDarkMatter distanceByDarkMatter= new DistanceByDarkMatter();

    @Test
    public void fromMercuryToVenus() {
        var distByOrbit = distanceByOrbit.estimate(solarSystem.mercury, solarSystem.venus);
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
