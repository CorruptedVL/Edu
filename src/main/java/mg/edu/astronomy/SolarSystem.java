package mg.edu.astronomy;

import mg.edu.astronomy.cosmic_bodies.Planet;
import mg.edu.astronomy.cosmic_bodies.PlanetWithCoord;
import mg.edu.astronomy.cosmic_bodies.PlanetWithRadius;
import mg.edu.astronomy.cosmic_bodies.Star;

public class SolarSystem {

    Star sun = new Star("Sun");
    Planet mercury = new PlanetWithCoord("Mercury", 2,4);
    Planet venus = new PlanetWithCoord("Venus", 5,4);
    Planet earth = new PlanetWithRadius("Earth", 150.0);
    Planet mars = new PlanetWithRadius("Mars", 228.0);
    Planet jupiter = new PlanetWithRadius("Jupiter", 778.0);
    Planet saturn = new PlanetWithRadius("Saturn", 1429.0);
    Planet uranus = new PlanetWithRadius("Uranus", 2875.0);
    Planet neptune = new PlanetWithRadius("Neptune", 4497.0);
    Planet pluto = new PlanetWithRadius("Pluto", 5913.0);

}
