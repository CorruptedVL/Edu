package mg.dvo_ran.events;

import mg.dvo_ran.shapes.Shape;

public class PerimeterCalculated extends AbstractCalculated {
    public PerimeterCalculated(String user, Shape shape, double perimeterValue) {
        super(user, shape, perimeterValue);
    }

    @Override
    public void dispatch(EventDispatcher eventDispatcher) {
        eventDispatcher.on(this);
    }
}
