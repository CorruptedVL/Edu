package mg.edu.astronomy;

import mg.edu.astronomy.cosmic_bodies.Planet;
import mg.edu.astronomy.cosmic_bodies.PlanetFacts;
import mg.edu.astronomy.cosmic_bodies.Star;

public class SolarSystem {

    Star sun = new Star("Sun");
    Planet mercury = new Planet("Mercury", PlanetFacts.coord(5,3).withOrbit(58));
    Planet venus = new Planet("Venus", PlanetFacts.coord(5,4).withOrbit(98));
    Planet earth = new Planet("Earth", PlanetFacts.orbit(150).withCoord(10,7));
    Planet mars = new Planet("Mars", PlanetFacts.orbit(258));
    Planet jupiter = new Planet("Jupiter", PlanetFacts.orbit(789));
    Planet saturn = new Planet("Saturn", PlanetFacts.orbit(1429));
    Planet uranus = new Planet("Uranus", PlanetFacts.orbit(2875).withDarkSignature("Meow"));
    Planet neptune = new Planet("Neptune", PlanetFacts.orbit(4497).withDarkSignature("BowWow"));
    Planet pluto = new Planet("Pluto", PlanetFacts.empty());

}
