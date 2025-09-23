package mg.dvo_ran.events;

public interface EventDispatcher {
    void on (PerimeterCalculated perimeterCalculated);
    void on (AreaCalculated areaCalculated);

    //новые события - новый on и в Observers тоже
}
