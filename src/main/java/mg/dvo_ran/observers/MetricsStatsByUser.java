package mg.dvo_ran.observers;

import mg.dvo_ran.events.AreaCalculated;
import mg.dvo_ran.events.PerimeterCalculated;

import java.util.HashMap;
import java.util.Map;

public class MetricsStatsByUser extends AbstractMetricsObserver {
    private final Map<String, Integer> areaByUser = new HashMap<>();
    private final Map<String, Integer> perimByUser = new HashMap<>();

    @Override
    public void on(AreaCalculated areaCalculated) {
        areaByUser.merge(areaCalculated.getUser(), 1, Integer::sum);
    }

    @Override
    public void on(PerimeterCalculated perimeterCalculated) {
        perimByUser.merge(perimeterCalculated.getUser(), 1, Integer::sum);
    }

    public int areaCount(String user) {
        return areaByUser.getOrDefault(user, 0);
    }

    public int perimeterCount(String user) {
        return perimByUser.getOrDefault(user, 0);
    }

    public void printReport() {
        System.out.println("=== Статистика ===");
        System.out.println("Площади:   " + areaByUser);
        System.out.println("Периметры: " + perimByUser);
    }
}
