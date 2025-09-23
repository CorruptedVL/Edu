package mg.dvo_ran.events;

public interface Event {
    void dispatch (EventDispatcher eventDispatcher);
}
