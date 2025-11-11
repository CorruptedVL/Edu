package mg.dvo_ran.web;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.core.MultivaluedMap;
import mg.dvo_ran.EventType;
import mg.dvo_ran.Geometry;
import mg.dvo_ran.shapes.*;

@ApplicationScoped
public class GeometryController {

    public double compute(String shapeName,
                          MultivaluedMap<String, String> params,
                          EventType eventType) {

        if (shapeName == null || shapeName.isBlank()) {
            throw new BadRequestException("Shape name must be provided");
        }
        if (params == null) {
            throw new BadRequestException("No query parameters provided");
        }

        String shapeKey = shapeName.toLowerCase();

        try {
            Shape shape = switch (shapeKey) {
                case "circle" -> new Circle(getParam(params, "radius"));
                case "rectangle" -> new Rectangle(
                        getParam(params, "a"),
                        getParam(params, "b")
                );
                case "square" -> new Square(
                        getParam(params, "side")
                );
                case "triangle" -> new Triangle(
                        getParam(params, "a"),
                        getParam(params, "b"),
                        getParam(params, "c")
                );
                case "ellipse" -> new Ellipse(
                        getParam(params, "rMin"),
                        getParam(params, "rMax")
                );
                case "trapezoid" -> new Trapezoid(
                        getParam(params, "t1"),
                        getParam(params, "t2"),
                        getParam(params, "t3"),
                        getParam(params, "t4")
                );
                default -> throw new BadRequestException("Unknown shape: " + shapeName);
            };

            return switch (eventType) {
                case AREA      -> Geometry.area(shape);
                case PERIMETER -> Geometry.perimeter(shape);
                default        -> throw new BadRequestException("Unsupported event type: " + eventType);
            };
        } catch (IllegalArgumentException ex) {
            // ошибки из доменной логики
            throw new BadRequestException("Invalid shape parameters: " + ex.getMessage());
        }
    }

    private double getParam(MultivaluedMap<String, String> params, String paramName) {
        String value = params.getFirst(paramName);
        if (value == null) {
            throw new BadRequestException("Missing query parameter: " + paramName);
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            throw new BadRequestException("Invalid value for " + paramName + ": " + value);
        }
    }
}
