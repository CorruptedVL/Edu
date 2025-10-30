package mg.edu.post;

import mg.edu.post.items.Nail;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static mg.edu.post.items.Straightness.BENT;
import static mg.edu.post.items.Straightness.STRAIGHT;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

public class BoxTest {

    @Test
    public void testFilter() {

        var nails = new ArrayList<>(List.of(new Nail(STRAIGHT), new Nail(BENT), new Nail(STRAIGHT)));

        Box<Nail> nailsBox = new NailsBox(nails);
        assertThat(nailsBox.processed(), contains(new Nail(STRAIGHT), new Nail(STRAIGHT)));
    }

}
