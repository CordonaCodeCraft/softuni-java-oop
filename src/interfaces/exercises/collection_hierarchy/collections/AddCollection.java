package interfaces.exercises.collection_hierarchy.collections;

import interfaces.exercises.collection_hierarchy.interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    @Override
    public int add(String element) {
        this.getItems().add(element);
        return super.getItems().indexOf(element);
    }
}
