package mg.dvo_ran.publishers;

import mg.dvo_ran.events.Event;
import mg.dvo_ran.observers.Observer;

public interface Publisher {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(Event event);
}
