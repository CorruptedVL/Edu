package mg.dvo_ran.publishers;

import mg.dvo_ran.events.Event;
import mg.dvo_ran.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPublisher implements Publisher {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    protected void dispatchToAll(Event event) {
        for (Observer o : observers) {
            o.on(event);
        }

    }
}
