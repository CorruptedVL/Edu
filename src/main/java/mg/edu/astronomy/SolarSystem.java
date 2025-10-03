package mg.edu.astronomy;

import mg.edu.astronomy.cosmic_bodys.Planet;
import mg.edu.astronomy.cosmic_bodys.Star;
import mg.edu.astronomy.estimators.DistanceEstimator;

public class SolarSystem {

    Star sun = new Star("Sun");
    Planet mercury = new Planet("Mercury", 58.0);
    Planet venus = new Planet("Venus", 108.0);
    Planet earth = new Planet("Earth", 150.0);
    Planet mars = new Planet("Mars", 228.0);
    Planet jupiter = new Planet("Jupiter", 778.0);
    Planet saturn = new Planet("Saturn", 1429.0);
    Planet uranus = new Planet("Uranus", 2875.0);
    Planet neptune = new Planet("Neptune", 4497.0);
    Planet pluto = new Planet("Pluto", 5913.0);

}
