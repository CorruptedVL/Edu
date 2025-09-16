package mg.dvo_ran.estimators;

import mg.dvo_ran.EstimateAreaStrategy;
import mg.dvo_ran.EstimatePerimeterStrategy;

public class CircleShapeEstimator implements EstimatePerimeterStrategy, EstimateAreaStrategy {
    @Override
    public double estimateArea(double... sides) {
        if (sides.length == 1) {
            double r = sides[0];
            double area = Math.PI * r * r;
            return Math.ceil(area * 100.0) / 100.0;
        } else {
            double rMin = sides[0];
            double rMax = sides[1];
            double area = Math.PI * rMin * rMax;
            return Math.ceil(area * 100.0) / 100.0;
        }
    }

    @Override
    public double estimatePerimeter(double... sides) {
        if (sides.length == 1) {
            double r = sides[0];
            double perimeter = 2 * Math.PI * r;
            return Math.ceil(perimeter * 100.0) / 100.0;
        } else {
            double rMin = sides[0];
            double rMax = sides[1];
            double perimeter = Math.PI * (3 * (rMin + rMax) - Math.sqrt((3 * rMin + rMax) * (rMin + 3 * rMax)));
            return Math.ceil(perimeter * 100.0) / 100.0;
        }
    }
}