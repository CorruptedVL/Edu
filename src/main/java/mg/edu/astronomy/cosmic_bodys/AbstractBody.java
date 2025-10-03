package mg.edu.astronomy.cosmic_bodys;

public abstract class AbstractBody implements Body {
    private final String name;

    protected AbstractBody(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
