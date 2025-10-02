package mg.edu.geometry;

import mg.dvo_ran.shapes.Shape;

public record GeometryEvent(EventType type, Shape shape, Double result) {}
