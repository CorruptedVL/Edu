package mg.dvo_ran.shapes;

import mg.dvo_ran.EstimateAreaStrategy;
import mg.dvo_ran.EstimatePerimeterStrategy;
import mg.dvo_ran.estimators.CircleShapeEstimator;

public abstract class AbstractCircleShapes extends AbstractShape {
    @Override
    protected EstimatePerimeterStrategy perimeterStrategy() {
        return new CircleShapeEstimator();
    }

    @Override
    protected EstimateAreaStrategy areaStrategy() {
        return new CircleShapeEstimator();
    }
}
