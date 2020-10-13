package polymorphism.exercises.wild_farm.entities.foods;

public abstract class Food {

    private final Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
