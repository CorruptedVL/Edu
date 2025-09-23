package mg.dvo_ran.observers;

import mg.dvo_ran.events.Event;

public interface Observer {
    void on (Event event);

}
