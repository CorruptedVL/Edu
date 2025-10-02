package mg.edu.geometry;

import mg.dvo_ran.shapes.Shape;
import mg.dvo_ran.users.User;

public class UsersShape implements Shape {

    private final User user;
    private final Shape shape;

    public UsersShape(User user, Shape shape) {
        this.user = user;
        this.shape = shape;
    }


    public String getUser() {
        return user.getName();
    }

    public Shape unwrap() { return shape; }

    @Override
    public double getPerimeter() {
        return shape.getPerimeter();
    }

    @Override
    public double getArea() {
        return shape.getArea();
    }

}
