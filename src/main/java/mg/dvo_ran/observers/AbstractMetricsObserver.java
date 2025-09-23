package mg.dvo_ran.observers;

import mg.dvo_ran.events.AreaCalculated;
import mg.dvo_ran.events.EventDispatcher;
import mg.dvo_ran.events.Event;
import mg.dvo_ran.events.PerimeterCalculated;

public abstract class AbstractMetricsObserver implements Observer, EventDispatcher {

    @Override
    public final void on(Event event) {
        event.dispatch(this);
    }

    @Override
    public void on(PerimeterCalculated perimeterCalculated) {
    }

    @Override
    public void on(AreaCalculated areaCalculated) {
    }

}
