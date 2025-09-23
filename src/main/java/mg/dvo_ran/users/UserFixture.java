package mg.dvo_ran.users;

import mg.dvo_ran.observers.MetricsStatsByUser;
import mg.dvo_ran.publishers.PublisherFixture;
import mg.dvo_ran.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class UserFixture {
    private final PublisherFixture publisherFixture;
    private final Map<String, User> users = new HashMap<>();

    public UserFixture(PublisherFixture publisherFixture) {
        this.publisherFixture = publisherFixture;
    }

    public User addUser(String name) {
        User u = users.get(name);
        if (u == null) {
            u = new DefaultUser(name, publisherFixture.getPublisher());
            users.put(name, u);
        }
        return u;
    }

    public User user(String name) {
        User u = users.get(name);
        if (u == null) {
            throw new IllegalStateException("User '" + name + "' не зарегистрирован. Вызовите addUser(name).");
        }
        return u;
    }

    public double area(String userName, Shape shape) {
        return addUser(userName).calcArea(shape);
    }

    public double perimeter(String userName, Shape shape) {
        return addUser(userName).calcPerimeter(shape);
    }

    public int areaCount(String userName) {
        return publisherFixture.getStatsObserver().areaCount(userName);
    }

    public int perimeterCount(String userName) {
        return publisherFixture.getStatsObserver().perimeterCount(userName);
    }

    public MetricsStatsByUser stats() {
        return publisherFixture.getStatsObserver();
    }
}
