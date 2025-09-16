package mg.dvo_ran.shapes;

import mg.dvo_ran.EstimateAreaStrategy;
import mg.dvo_ran.EstimatePerimeterStrategy;
import mg.dvo_ran.Shape;

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
