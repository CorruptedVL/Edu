package mg.dvo_ran;

public class LogEventListener implements GeometryListener {

    @Override
    public void notify(GeometryEvent event) {
        System.out.printf("%s, %s -> %s\n",
                event.shape().getClass().getSimpleName(),
                event.type(),
                event.result());
    }

}
