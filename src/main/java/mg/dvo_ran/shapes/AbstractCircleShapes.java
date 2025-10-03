package mg.dvo_ran.shapes;

import mg.dvo_ran.estimators.EstimateAreaStrategy;
import mg.dvo_ran.estimators.EstimatePerimeterStrategy;
import mg.dvo_ran.estimators.CircleShapeEstimator;

public abstract class AbstractCircleShapes extends AbstractShape {
    @Override
    protected EstimatePerimeterStrategy perimeterStrategy() {
        return new CircleShapeEstimator();
    }

    @Override
    protected EstimateAreaStrategy areaStrategy() { return new CircleShapeEstimator(); }
}
