package mg.dvo_ran;

import mg.dvo_ran.shapes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionsTest {
    @Test
    void circleNegativeRadius() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> new Circle(-1.0));
    }

    @Test
    void circleZeroRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0.0));
    }

    @Test
    void circleNaNOrInfinite() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Circle(Double.POSITIVE_INFINITY));
    }

    @Test
    void rectangleNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-10.0, 20.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10.0, -20.0));
    }

    @Test
    void rectangleZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0.0, 20.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10.0, 0.0));
    }

    @Test
    void rectangleNaNOrInfinite() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Double.NaN, 10.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10.0, Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Double.POSITIVE_INFINITY, 10.0));
    }


    @Test
    void squareNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-5.0));
    }

    @Test
    void squareZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0.0));
    }

    @Test
    void squareNaNOrInfinite() {
        assertThrows(IllegalArgumentException.class, () -> new Square(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Square(Double.POSITIVE_INFINITY));
    }

    @Test
    void triangleNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-3, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, -4, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, -5));
    }

    @Test
    void triangleZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, 0));
    }

    @Test
    void triangleViolatesInequality() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class, () -> new Triangle(1, 2, 3));
    }


    @Test
    void ellipseNegativeAxis() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(-2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(2, -3));
    }

    @Test
    void ellipseZeroAxis() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(0, 3));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(2, 0));
    }

    @Test
    void ellipseNaNOrInfinite() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(Double.NaN, 2));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(2, Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(Double.POSITIVE_INFINITY, 2));
    }

    @Test
    void ellipseRMaxLessRMin() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(5, 3));
    }

    @Test
    void trapezoidNegativeSide() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(-3, 4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, -4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, -5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 5, -6));
    }

    @Test
    void trapezoidZeroSide() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(0, 4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 0, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 0, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 5, 0));
    }

    @Test
    void trapezoidNaNOrInfinite() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(Double.NaN, 4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, Double.NaN, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, Double.NaN, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 5, Double.NaN));
    }
}
