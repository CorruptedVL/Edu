package mg.edu.astronomy.cosmic_bodys;

public class Planet  extends AbstractBody{

    private final double distanceToStar;

    public Planet (String name, double distanceToStar) {
        super(name);
        this.distanceToStar = distanceToStar;
    }
    public double distanceToStar(){
        return distanceToStar;
    }
}
