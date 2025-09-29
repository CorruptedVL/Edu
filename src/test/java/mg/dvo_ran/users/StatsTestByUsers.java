package mg.dvo_ran.users;

import mg.dvo_ran.publishers.PublisherFixture;
import mg.dvo_ran.shapes.Circle;
import mg.dvo_ran.shapes.Rectangle;
import mg.dvo_ran.shapes.Square;
import mg.dvo_ran.shapes.Triangle;
import mg.edu.geometry.Geometry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StatsTestByUsers {
    private UserFixture fx;

    @BeforeEach
    void setUp() {
        PublisherFixture pubFixture = new PublisherFixture();
        fx = new UserFixture(pubFixture);
    }

    @Test
    void testSingleUserCounts() {
        fx.area("Alice", new Square(2));
        fx.perimeter("Alice", new Square(2));

        assertThat(fx.areaCount("Alice"), is(1));
        assertThat(fx.perimeterCount("Alice"), is(1));

        Geometry.area(new Square(2));

    }

    @Test
    void testMultipleUsers() {
        fx.area("Alice", new Circle(3));
        fx.perimeter("Bob", new Rectangle(2, 5));

        assertThat(fx.areaCount("Alice"), is(1));
        assertThat(fx.perimeterCount("Alice"), is(0));

        assertThat(fx.areaCount("Bob"), is(0));
        assertThat(fx.perimeterCount("Bob"), is(1));
    }

    @Test
    void testAccumulatedCounts() {
        fx.area("Alice", new Triangle(3, 4, 5));
        fx.area("Alice", new Square(5));
        fx.area("Alice", new Rectangle(2, 6));

        assertThat(fx.areaCount("Alice"), is(3));
        assertThat(fx.perimeterCount("Alice"), is(0));
    }


}
