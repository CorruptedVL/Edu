package mg.dvo_ran.shapes;

import mg.dvo_ran.estimators.EstimateAreaStrategy;
import mg.dvo_ran.estimators.EstimatePerimeterStrategy;

public abstract class AbstractShape implements Shape {

    protected abstract EstimatePerimeterStrategy perimeterStrategy();

    protected abstract EstimateAreaStrategy areaStrategy();

    protected abstract double[] sides();


    @Override
    public double getPerimeter() {
        return perimeterStrategy().estimatePerimeter(sides());
    }

    @Override
    public double getArea() {
       return areaStrategy().estimateArea(sides());
    }
}
