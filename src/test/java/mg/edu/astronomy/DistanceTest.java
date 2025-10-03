package mg.edu.astronomy;

import mg.edu.astronomy.estimators.DistanceEstimator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DistanceTest {
    SolarSystem solarSystem = new SolarSystem();
    DistanceEstimator distanceEstimator = new DistanceEstimator();

    @Test
    public void fromMercuryToEarth() {
        var distance = distanceEstimator.estimate(solarSystem.mercury, solarSystem.earth);
        assertThat(distance, is(92.0));
    }

    @Test
    public void fromEarthToMercury() {
        var distance = distanceEstimator.estimate(solarSystem.earth, solarSystem.mercury);
        assertThat(distance, is(92.0));
    }
    @Test
    public void fromJupiterToMercury() {
        var distance = distanceEstimator.estimate(solarSystem.jupiter, solarSystem.mercury);
        assertThat(distance, is(720.0));
    }


}
