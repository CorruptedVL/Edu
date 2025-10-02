package mg.edu.geometry;

import mg.dvo_ran.shapes.*;
import mg.dvo_ran.users.DefaultUser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserListenerTest {

    private static UserListener listener;

    @BeforeAll
    static void setUp() {
        listener = new UserListener();
        Geometry.subscribe(listener);
    }

    @AfterAll
    static void tearDown() {
        Geometry.unsubscribeAll();
    }


    @Test
    void statsByUserTest() {
        Shape trapezoidByMikhalych = shapeByUser("Mikhalych", new Trapezoid(10.0, 10.0, 10.0, 10.0));
        Geometry.perimeter(trapezoidByMikhalych);

        Shape rectangleByAlice = shapeByUser("Alice", new Rectangle(10.0, 10.0));
        Geometry.perimeter(rectangleByAlice);
        Geometry.area(rectangleByAlice);

        Shape ellipseByAlice = shapeByUser("Alice", new Ellipse(9.0, 10.0));
        Geometry.perimeter(ellipseByAlice);
        Geometry.area(ellipseByAlice);

        Shape triangleByAlice = shapeByUser("Alice", new Triangle(10,10,10));
        Geometry.area(triangleByAlice);


        Shape squareByAlex = shapeByUser("Alex", new Square(10.0));
        Geometry.area(squareByAlex);
        Geometry.perimeter(squareByAlex);

        Shape circleByZheka = shapeByUser("Zheka", new Circle(10.0));
        Geometry.area(circleByZheka);
        Geometry.perimeter(circleByZheka);


        System.out.println(listener);


    }

    private Shape shapeByUser(String username, Shape shape) {
        return new UsersShape(new DefaultUser(username), shape);
    }

}
