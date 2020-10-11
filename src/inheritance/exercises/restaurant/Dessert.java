package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Dessert extends Food {
    private final Double calories;            

    public Dessert(String name, BigDecimal price, Double grams, Double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public Double getCalories() {
        return this.calories;
    }
}
