package mg.edu.geometry;

import mg.dvo_ran.shapes.Triangle;


public class StatisticsListener implements GeometryListener {

    private int areaCalls;
    private int perimeterCalls;
    private int triangularCalls;

    @Override
    public void notify(GeometryEvent event) {
        var name = event.type();
        switch (name) {
            case PERIMETER -> perimeterCalls++;
            case AREA -> areaCalls++;
        }
        var shape = event.shape();
        if (shape instanceof Triangle) {
            triangularCalls++;
        }
    }

    public int getAreaCalls() {
        return areaCalls;
    }

    public int getPerimeterCalls() {
        return perimeterCalls;
    }

    public int getTriangularCalls() {
        return triangularCalls;
    }

    private void print() {
        record Stats(int areaCalls, int perimeterCalls, int triangularCalls) {
        }
        System.out.println(new Stats(areaCalls, perimeterCalls, triangularCalls));
    }

    @Override
    public String toString() {
        return "StatisticsListener{" +
                "areaCalls=" + areaCalls +
                ", perimeterCalls=" + perimeterCalls +
                ", triangularCalls=" + triangularCalls +
                '}';
    }
}
