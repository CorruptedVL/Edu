package mg.edu.geometry;

import mg.dvo_ran.shapes.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsListenerTest {

    private static StatisticsListener stats;

    @BeforeAll
    static void setUp() {
        stats = new StatisticsListener();
        Geometry.subscribe(stats);
    }

    @AfterAll
    static void tearDown() {
        Geometry.unsubscribeAll();
    }

    @Test
    void allShapesStatTest() {
        Geometry.area(new Rectangle(10.0, 10.0));
        Geometry.area(new Square(10.0));
        Geometry.area(new Triangle(10.0, 10.0, 10));
        Geometry.area(new Circle(10.0));
        Geometry.area(new Ellipse(9, 10));
        Geometry.perimeter(new Rectangle(9, 10));
        Geometry.perimeter(new Square(10));
        Geometry.perimeter(new Triangle(10, 10, 10));
        Geometry.perimeter(new Trapezoid(10, 10, 10, 10));
        Geometry.perimeter(new Circle(10));
        Geometry.perimeter(new Ellipse(9, 10));

        assertEquals(5, stats.getAreaCalls(), "Должно быть 5"); //area stat
        assertEquals(6, stats.getPerimeterCalls(), "должен быть 6"); //perimeter stat
        assertEquals(2, stats.getTriangularCalls(), "должен быть 2"); //triangular stat
    }
}
