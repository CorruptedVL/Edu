package mg.edu.astronomy.cosmic_bodies;

public class Planet extends AbstractBody {

    private final double distanceToStar;
    private final double x;
    private final double y;

    public Planet(String name, double distanceToStar) {
        super(name);
        this.distanceToStar = distanceToStar;
        this.x = Double.NaN;
        this.y = Double.NaN;
    }

    public Planet(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
        this.distanceToStar = Math.hypot(x, y);
    }

    public double distanceToStar() {
        return distanceToStar;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
