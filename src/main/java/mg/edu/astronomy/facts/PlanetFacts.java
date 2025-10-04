package mg.edu.astronomy.facts;

import java.util.HashMap;
import java.util.Map;

public final class PlanetFacts {
    private final Map<Class<?>, Fact> facts = new HashMap<>();

    private PlanetFacts() {
    }

    public static PlanetFacts empty() {
        return new PlanetFacts();
    }

    public PlanetFacts add(Fact fact) {
        facts.put(facts.getClass(), fact);
        return this;
    }

    public OrbitRadius orbitRadius() {
        return (OrbitRadius) facts.get(OrbitRadius.class);
    }

    public Coordinates coordinates() {
        return (Coordinates) facts.get(Coordinates.class);
    }

    public DarkMatter darkMatter() {
        return (DarkMatter) facts.get(DarkMatter.class);
    }

    public Something something() {
        return (Something) facts.get(Something.class);
    }

}
