package inheritance.exercises.restaurant;

import java.math.BigDecimal;

public class Tea extends HotBeverage {

    public Tea(String name, BigDecimal price, Double milliliters) {
        super(name, price, milliliters);
    }
}
