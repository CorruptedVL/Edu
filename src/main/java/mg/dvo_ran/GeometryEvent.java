package mg.dvo_ran;

import mg.dvo_ran.shapes.Shape;

public record GeometryEvent(EventType type, Shape shape, Double result) {}
