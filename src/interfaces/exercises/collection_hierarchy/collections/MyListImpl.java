package interfaces.exercises.collection_hierarchy.collections;

public class MyListImpl extends AddRemoveCollection {

    @Override
    public String remove() {
       String product = super.getItems().get(0);
       this.getItems().remove(0);
        return product;
    }

    public int getUsed() {
        return this.getItems().size();
    }

}
