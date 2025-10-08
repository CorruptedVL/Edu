package mg.edu.fruits;

import java.util.Arrays;
import java.util.List;

public class Basket {
    List<String> fruits;
    FreqSorter sorter = new FreqSorter();


    public Basket(String... fruits) {
        this.fruits = Arrays.asList(fruits);
    }

    public List<String> names() {
        return sorter.getSortedCopy(fruits);
    }
}
