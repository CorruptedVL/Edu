package mg.edu.post;

import mg.edu.post.items.Nail;

import java.util.Comparator;
import java.util.List;

import static mg.edu.post.items.Straightness.*;

public class NailsBox extends Box<Nail> {

    public NailsBox(List<Nail> items) {

        super(items, Comparator.comparing(Nail::straightness), nail -> nail.straightness() == STRAIGHT);

    }

}
