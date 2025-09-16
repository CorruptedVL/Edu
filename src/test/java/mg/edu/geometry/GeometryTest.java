package mg.edu.geometry;

import mg.dvo_ran.shapes.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeometryTest {

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

}
