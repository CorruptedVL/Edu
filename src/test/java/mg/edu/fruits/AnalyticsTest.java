package mg.edu.fruits;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.BiFunction;

import static org.hamcrest.MatcherAssert.*;

public class AnalyticsTest {

    class Basket {

        record Item(String name, int quantity, int position) implements Comparable<Item> {
            @Override
            public int compareTo(Item another) {
                var byQuantity = Integer.compare(quantity, another.quantity);
                var byPosition = Integer.compare(another.position, position);
                return byQuantity != 0 ? byQuantity : byPosition;
            }
        }

        private final Map<String, Item> items = new HashMap<>();

        public Basket(String... names) {
            for (int i = 0; i < names.length; i++) {
                var name = names[i];
                items.merge(name, ifNotExist(name, i), ifExists(name));
            }
        }

        private static Item ifNotExist(String name, int i) {
            return new Item(name, 1, i);
        }

        private static BiFunction<Item, Item, Item> ifExists(String name) {
            return (old, _) -> new Item(name, old.quantity + 1, old.position);
        }

        public Set<String> names() {
            var values = new ArrayList<>(items.values());
            values.sort(Collections.reverseOrder());

            var map = new LinkedHashSet<String>();
            values.forEach(x -> map.add(x.name()));

            return map;
        }
    }

    @Test
    public void doTest() {
        var basket = new Basket("Orange", "Apple", "Banana", "Apple", "Apple", "Watermelon", "Pear", "Cherry", "Banana");
        assertThat(basket.names(), Matchers.contains("Apple", "Banana", "Orange", "Watermelon", "Pear", "Cherry"));
    }

}