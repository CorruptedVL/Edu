package mg.dvo_ran;

import mg.dvo_ran.shapes.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeometryTest {

    @BeforeAll
    static void setUp() {
//        Geometry.subscribe(new LogEventListener());
        Geometry.subscribe(new StatisticsListener());
    }

    @AfterAll
    static void afterAll() {
        Geometry.unsubscribeAll();
    }

    @Test
    public void testRectangle() {
        var rectangle = new Rectangle(1.0, 2.0);
        var perimeter = Geometry.perimeter(rectangle);
        var area = Geometry.area(rectangle);
        assertThat(perimeter, is(6.0));
        assertThat(area, is(2.0));
    }

    @Test
    public void testTriangle() {
        var triangle = new Triangle(5.0, 2.0, 4.0);
        var perimeter = Geometry.perimeter(triangle);
        var area = Geometry.area(triangle);
        assertThat(perimeter, is(11.0));
        assertThat(area, is(3.8));
    }

    @Test
    public void testSquare() {
        var square = new Square(3);
        var perimeter = Geometry.perimeter(square);
        var area = Geometry.area(square);
        assertThat(perimeter, is(12.0));
        assertThat(area, is(9.0));
    }

    @Test
    public void testTrapezoid() {
        var trapezoid = new Trapezoid(2, 4, 5, 2);
        var perimeter = Geometry.perimeter(trapezoid);
        assertThat(perimeter, is(13.0));
    }

    @Test
    public void testCircle() {
        var circle = new Circle(3);
        var perimeter = Geometry.perimeter(circle);
        var area = Geometry.area(circle);
        assertThat(perimeter, is(18.85));
        assertThat(area, is(28.28));
    }

    @Test
    public void testEllipse() {
        var ellipse = new Ellipse(7, 9);
        var perimeter = Geometry.perimeter(ellipse);
        var area = Geometry.area(ellipse);
        assertThat(perimeter, is(50.47));
        assertThat(area, is(197.93));
    }

    @Test
    void circle_negativeRadius_shouldThrow() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Circle(-1.0)
        );
    }

    @Test
    void circle_zeroRadius_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0.0));
    }

    @Test
    void circle_nanOrInfinite_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Circle(Double.POSITIVE_INFINITY));
    }

    @Test
    void rectangle_negativeSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-10.0, 20.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10.0, -20.0));
    }

    @Test
    void rectangle_zeroSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0.0, 20.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10.0, 0.0));
    }

    @Test
    void rectangle_nanOrInfinite_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Double.NaN, 10.0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10.0, Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Double.POSITIVE_INFINITY, 10.0));
    }


    @Test
    void square_negativeSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-5.0));
    }

    @Test
    void square_zeroSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Square(0.0));
    }

    @Test
    void square_nanOrInfinite_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Square(Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Square(Double.POSITIVE_INFINITY));
    }

    @Test
    void triangle_negativeSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(-3, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, -4, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, -5));
    }

    @Test
    void triangle_zeroSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0, 4, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(3, 4, 0));
    }

    @Test
    void triangle_violatesInequality_shouldThrow() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> new Triangle(1, 2, 3)
        );
    }


    @Test
    void ellipse_negativeAxis_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(-2, 3));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(2, -3));
    }

    @Test
    void ellipse_zeroAxis_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(0, 3));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(2, 0));
    }

    @Test
    void ellipse_nanOrInfinite_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(Double.NaN, 2));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(2, Double.NaN));
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(Double.POSITIVE_INFINITY, 2));
    }

    @Test
    void ellipse_rMaxLessThan_rMin_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Ellipse(5, 3));
    }

    @Test
    void trapezoid_negativeSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(-3, 4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, -4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, -5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 5, -6));
    }

    @Test
    void trapezoid_zeroSide_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(0, 4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 0, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 0, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 5, 0));
    }

    @Test
    void trapezoid_nanOrInfinite_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(Double.NaN, 4, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, Double.NaN, 5, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, Double.NaN, 6));
        assertThrows(IllegalArgumentException.class, () -> new Trapezoid(3, 4, 5, Double.NaN));
    }

}
