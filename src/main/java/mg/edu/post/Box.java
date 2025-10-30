package mg.edu.post;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Box<T> {

    private final List<T> items;
    private final Comparator<T> comparator;
    private final Predicate<T> predicate;

    public Box(List<T> items, Comparator<T> comparator, Predicate<T> predicate) {
        this.items = items;
        this.comparator = comparator;
        this.predicate = predicate;
    }

    public List<T> processed() {
       return items.stream()
               .sorted(comparator)
               .filter(predicate)
               .toList();
    }

}
