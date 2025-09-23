package mg.dvo_ran.users;

import mg.dvo_ran.events.AreaCalculated;
import mg.dvo_ran.events.PerimeterCalculated;
import mg.dvo_ran.publishers.Publisher;
import mg.dvo_ran.shapes.Shape;

public class DefaultUser implements User {

    private final String name;
    private final Publisher publisher;

    public DefaultUser(String name, Publisher publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcArea(Shape shape) {
        double area = shape.getArea();
        publisher.notifyObservers(new AreaCalculated(name,shape,area));
        return area;
    }

    @Override
    public double calcPerimeter(Shape shape) {
        double perimeter = shape.getPerimeter();
        publisher.notifyObservers(new PerimeterCalculated(name,shape,perimeter));
        return perimeter;
    }
}
