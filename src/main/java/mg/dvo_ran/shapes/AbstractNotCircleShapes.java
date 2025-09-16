package mg.dvo_ran.shapes;

import mg.dvo_ran.EstimateAreaStrategy;
import mg.dvo_ran.EstimatePerimeterStrategy;
import mg.dvo_ran.estimators.NotCircleShapeEstimator;

public abstract class AbstractNotCircleShapes extends AbstractShape {

    @Override
    protected EstimatePerimeterStrategy perimeterStrategy() {
        return new NotCircleShapeEstimator();
    }

    @Override
    protected EstimateAreaStrategy areaStrategy() {
        return new NotCircleShapeEstimator();
    }
}
