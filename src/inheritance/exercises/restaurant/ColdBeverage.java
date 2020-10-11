package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class ColdBeverage extends Beverages{

    public ColdBeverage(String name, BigDecimal price, Double milliliters) {
        super(name, price, milliliters);
    }
}
