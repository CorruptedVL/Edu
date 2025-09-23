package mg.dvo_ran.publishers;

import mg.dvo_ran.events.Event;

public class MetricsPublisher extends AbstractPublisher {

    @Override
    public void notifyObservers(Event event) {
        dispatchToAll(event);
    }
}
