package interfaces.exercises.collection_hierarchy.collections;

import interfaces.exercises.collection_hierarchy.interfaces.Removable;

public class AddRemoveCollection extends AddCollection implements Removable {

    @Override
    public int add(String element) {
        this.getItems().add(0, element);
        return super.getItems().indexOf(element);
    }

    @Override
    public String remove() {
        int lastIndex = getItems().size() -1;
        String product = getItems().get(lastIndex);
        this.getItems().remove(lastIndex);
        return product;
    }
}
