package mg.edu.fruits;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;

public class FruitsTest {
    @Test
    public void doTest() {
        var basket = new Basket("Orange", "Apple", "Banana", "Apple", "Apple", "Watermelon", "Pear", "Cherry", "Banana");
        assertThat(basket.names(), Matchers.contains("Apple", "Banana", "Orange", "Watermelon", "Pear", "Cherry"));
    }
}
