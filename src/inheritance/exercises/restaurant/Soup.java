package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Soup extends Starter {

    public Soup(String name, BigDecimal price, Double grams) {
        super(name, price, grams);
    }
}
