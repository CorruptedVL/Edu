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
        var distance = solarSystem.mercury.distanceTo(solarSystem.venus);
        var d1 = distanceByOrbit.estimate(solarSystem.mercury, solarSystem.venus);
        var d2 = distanceByCoord.estimate(solarSystem.mercury, solarSystem.venus);
        assertThat(distance, is(3.0));

    }

    @Test
    public void fromEarthToMercury() {
        var distance = solarSystem.earth.distanceTo(solarSystem.mercury);
        assertThat(distance, is(92.0));
    }
    @Test
    public void fromJupiterToEarth() {
        var distance = solarSystem.jupiter.distanceTo(solarSystem.earth);
        assertThat(distance, is(628.0));
    }

    @Test
    public void fromUranusToNeptune(){
        var d1 = distanceByDarkMatter.estimate(solarSystem.mercury, solarSystem.mars);
        System.out.println(d1);
        //var d2 = solarSystem.uranus.distanceTo(solarSystem.neptune);
        //assertThat(d1,is (d2));
    }


}
