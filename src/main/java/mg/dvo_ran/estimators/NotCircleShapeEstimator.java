package mg.dvo_ran.estimators;

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
                double halfP = estimatePerimeter(x, y, z) / 2;
                double area = Math.sqrt(halfP * (halfP - x) * (halfP - y) * (halfP - z));
                return Math.ceil(area * 100.0) / 100.0;
            case 4:
                throw new UnsupportedOperationException("Площадь трапеции не рассчитывается");
            default:
                throw new IllegalArgumentException("Неподдерживаемое количество параметров: " + sides.length);
        }
    }

}