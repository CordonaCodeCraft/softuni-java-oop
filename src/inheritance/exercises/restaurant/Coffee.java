package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    private static final Double COFFEE_MILLILITERS = 50.0;
    private static final BigDecimal COFFEE_PRICE = new BigDecimal("3.50");
    private final Double caffeine;

    public Coffee(String name, BigDecimal price, Double milliliters) {
        super(name, price, milliliters);
        this.caffeine = 0.0;
    }

    public Double getCaffeine() {
        return this.caffeine;
    }
}
