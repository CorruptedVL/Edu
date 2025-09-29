package mg.edu.geometry;

public class LogEventListener implements GeometryListener {

    @Override
    public void notify(GeometryEvent event) {
        System.out.printf("%s, %s -> %s\n",
                event.shape().getClass().getSimpleName(),
                event.name(),
                event.result());
    }

}
