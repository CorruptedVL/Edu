package mg.dvo_ran.events;

import mg.dvo_ran.shapes.Shape;

public abstract class AbstractCalculated implements Event {
    private final String user;
    private final Shape shape;
    private final double value;

    protected AbstractCalculated(String user, Shape shape, double value) {
        this.user = user;
        this.shape = shape;
        this.value = value;
    }

    public String getUser() {
        return user;
    }
}
