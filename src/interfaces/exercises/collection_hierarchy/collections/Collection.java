package interfaces.exercises.collection_hierarchy.collections;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {

    private final int MAX_SIZE = 100;
    private final List<String> items;

    public Collection() {
        this.items = new ArrayList<>(MAX_SIZE);
    }

    public List<String> getItems() {
        return this.items;
    }
}
