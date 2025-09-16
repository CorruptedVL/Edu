package mg.dvo_ran.estimators;

import mg.dvo_ran.EstimateAreaStrategy;
import mg.dvo_ran.EstimatePerimeterStrategy;

public class NotCircleShapeEstimator implements EstimatePerimeterStrategy, EstimateAreaStrategy {

    @Override
    public double estimatePerimeter(double... sides) {
        switch (sides.length) {
            case 2:
                double a = sides[0], b = sides[1];
                return Math.ceil((2 * (a + b)) * 100.0) / 100.0;
            case 3:
                double x = sides[0], y = sides[1], z = sides[2];
                return Math.ceil((x + y + z) * 100.0) / 100.0;
            case 4:
                double t1 = sides[0], t2 = sides[1], t3 = sides[2], t4 = sides[3];
                return Math.ceil((t1 + t2 + t3 + t4) * 100.0) / 100.0;
            default:
                throw new IllegalArgumentException("Неподдерживаемое количество параметров: " + sides.length);

        }
    }

    public double estimateArea(double... sides) {
        switch (sides.length) {
            case 2:
                double a = sides[0], b = sides[1];
                return Math.ceil((a * b) * 100.0) / 100.0;
            case 3:
                double x = sides[0], y = sides[1], z = sides[2];
                double p = estimatePerimeter(x, y, z);
                double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
                return Math.ceil(area * 100.0) / 100.0;
            case 4:
                throw new UnsupportedOperationException("Площадь трапеции не рассчитывается");
            default:
                throw new IllegalArgumentException("Неподдерживаемое количество параметров: " + sides.length);
        }
    }

}