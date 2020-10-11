package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Starter extends Food {

    public Starter(String name, BigDecimal price, Double grams) {
        super(name, price, grams);
    }
}
