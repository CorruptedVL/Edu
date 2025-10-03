package mg.edu.astronomy.cosmic_bodies;

public record PlanetFacts(double x, double y, double radius, String darkSignature) {

    public static PlanetFacts empty () {
        return new PlanetFacts(Double.NaN, Double.NaN, Double.NaN, null);
    }

    public static PlanetFacts coord(double x, double y) {
        return new PlanetFacts(x, y, Double.NaN, null);
    }
    public static PlanetFacts orbit(double radius) {
        return new PlanetFacts(Double.NaN, Double.NaN, radius, null);
    }

    public PlanetFacts withCoord(double x, double y) {
        return new PlanetFacts(x, y, radius, darkSignature);
    }

    public PlanetFacts withOrbit(double radius) {
        return new PlanetFacts(x, y, radius, darkSignature);
    }

    public PlanetFacts withDarkSignature(String darkSignature) {
        return new PlanetFacts(x, y, radius, darkSignature);
    }

}
