package mg.edu.astronomy;

import mg.edu.astronomy.cosmic_bodies.Planet;
import mg.edu.astronomy.cosmic_bodies.Star;
import mg.edu.astronomy.facts.Coordinates;
import mg.edu.astronomy.facts.DarkMatter;
import mg.edu.astronomy.facts.OrbitRadius;
import mg.edu.astronomy.facts.PlanetFacts;

public final class SolarSystem {

    Star sun = new Star("Sun");
    Planet mercury = new Planet("Mercury",PlanetFacts.empty()
            .add(new OrbitRadius(27)));
    Planet venus = new Planet("Venus", PlanetFacts.empty().
            add(new Coordinates(5,4)).
            add(new OrbitRadius(58)));
    Planet earth = new Planet("Earth", PlanetFacts.empty()
            .add(new OrbitRadius(150))
            .add(new DarkMatter("A lot of peoples")));
    Planet mars = new Planet("Mars", PlanetFacts.empty()
            .add(new OrbitRadius(428))
            .add(new Coordinates(10,8))
            .add(new DarkMatter("I'm red and bad mazafucka")));
    Planet jupiter = new Planet("Jupiter", PlanetFacts.empty()
            .add(new OrbitRadius (789)));
    Planet saturn = new Planet("Saturn", PlanetFacts.empty()
            .add(new OrbitRadius (1789)));
    Planet uranus = new Planet("Uranus", PlanetFacts.empty()
            .add(new OrbitRadius (2089))
            .add(new DarkMatter("Meow")));
    Planet neptune = new Planet("Neptune", PlanetFacts.empty()
            .add(new OrbitRadius (4789))
            .add(new DarkMatter("BowWow")));
    Planet pluto = new Planet("Pluto", PlanetFacts.empty()
            .add(new DarkMatter("Some bitches told me i,m not a Planet")));

}
