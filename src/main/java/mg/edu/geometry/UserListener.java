package mg.edu.geometry;

import mg.dvo_ran.shapes.Triangle;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UserListener implements GeometryListener {

    private final Map<String, StatisticsListener> stats = new LinkedHashMap<>();

    @Override
    public void notify(GeometryEvent event) {
        if (!(event.shape() instanceof UsersShape shape)) return;
        var userGeoEvent = new GeometryEvent(event.type(), shape.unwrap(), event.result());
        var user = shape.getUser();
        if (stats.containsKey(user)) {
            var delegate = stats.get(user);
            delegate.notify(userGeoEvent);
        } else {
            var delegate = new StatisticsListener();
            delegate.notify(userGeoEvent);
            stats.put(user, delegate);
        }


    }

    @Override
    public String toString() {
        return stats.toString();_
    }

}

