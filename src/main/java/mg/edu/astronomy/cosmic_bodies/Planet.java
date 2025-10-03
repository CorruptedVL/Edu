package mg.edu.astronomy.cosmic_bodies;

public class Planet extends AbstractBody {

    private double distanceToStar;
    private double x;
    private double y;

    public Planet(String name, double distanceToStar) {
        super(name);
        this.distanceToStar = distanceToStar;
    }

    public Planet(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    public double distanceToStar() {
        return distanceToStar;
    }
}
