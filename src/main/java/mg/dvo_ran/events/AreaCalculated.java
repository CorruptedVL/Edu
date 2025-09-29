package mg.dvo_ran.events;

import mg.dvo_ran.shapes.Shape;

public class AreaCalculated extends AbstractCalculated {

    public AreaCalculated(String user, Shape shape, double areaValue) {
        super(user, shape, areaValue);
    }

    @Override
    public void dispatch(EventDispatcher eventDispatcher) {
        eventDispatcher.on(this);
    }
}
