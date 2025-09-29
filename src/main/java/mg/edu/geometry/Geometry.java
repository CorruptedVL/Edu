package mg.edu.geometry;

import mg.dvo_ran.shapes.Shape;

import java.util.HashSet;
import java.util.Set;


public class Geometry {

    private static final Geometry GEOMETRY = new Geometry();

    private final Set<GeometryListener> listeners = new HashSet<>();

    private Geometry() {
    }

    public static void subscribe(GeometryListener listener) {
        GEOMETRY.listeners.add(listener);
    }

    public static void unsubscribeAll() {
        GEOMETRY.listeners.clear();
    }

    public static double perimeter(Shape shape) {
        var perimeter = shape.getPerimeter();
        notifyListeners("perimeter", shape, perimeter);
        return perimeter;
    }

    public static double area(Shape shape) {
        var area = shape.getArea();
        notifyListeners("area", shape, area);
        return area;
    }

    private static void notifyListeners(String eventType, Shape shape, Double result) {
        for (var listener: GEOMETRY.listeners) {
            var event = new GeometryEvent(eventType, shape, result);
            listener.notify(event);
        }
    }

}
