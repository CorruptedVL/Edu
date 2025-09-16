package mg.edu.geometry.calc_inside_obj.getting_metrics;

import mg.edu.geometry.calc_inside_obj.shapes.ShapeArea;
import mg.edu.geometry.calc_inside_obj.shapes.ShapePerimeter;

public class GetMetrics {

    public static double calculatePerimeter(ShapePerimeter shapePerimeter) {
        return shapePerimeter.getPerimeter();
    }
    public static double calculateArea(ShapeArea shapeArea) { return shapeArea.getArea(); }
}
