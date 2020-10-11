package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Food extends Product {
    private final Double grams;

    public Food(String name, BigDecimal price, Double grams) {
        super(name, price);
        this.grams = grams;
    }

    public Double getGrams() {
        return this.grams;
    }
}
