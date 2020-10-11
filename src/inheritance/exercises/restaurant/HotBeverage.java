package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class HotBeverage extends Beverages {

    public HotBeverage(String name, BigDecimal price, Double milliliters) {
        super(name, price, milliliters);
    }
}
